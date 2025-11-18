package arbol;

/*
   Este será la clase en donde se almacenará y creará el curso virtual, manteniendo
   la estructura de un árbol binario. También estarán los métodos que permitirán
   las operaciones básicas de un árbol binario, como: insertar elementos y mostrar
   el curso.
*/

import clases.*;

public class ArbolBinario<T> {
    private Nodo<T> raiz;
    
    public ArbolBinario() {
    }

    public void insertarCurso(T curso) {
        if (this.raiz == null) {
            Nodo<T> nuevoCurso = new Nodo<>(curso);
            
            this.raiz = nuevoCurso;
        } else {
            System.out.println("Ya hay un curso creado. No se puede añadir un curso dentro de otro curso.");
        }
    }
    
    public void insertarModulo(T modulo) {
        if (this.raiz == null) {
            System.out.println("Es necesario añadir un curso primero para añadir módulos.");
            return;
        }
        
        if (this.raiz.getNodoIzquierdo() != null && this.raiz.getNodoDerecho() != null) {
            System.out.println("No se pueden añadir más módulos.");
            return;
        }
        
        Nodo<T> nuevoModulo = new Nodo<>(modulo);
        
        if (this.raiz.getNodoIzquierdo() == null) {
            this.raiz.setNodoIzquierdo(nuevoModulo);
        } else {
            this.raiz.setNodoDerecho(nuevoModulo);
        }
    }
    
    public void insertarLeccion(T leccion) {
        Nodo<T> moduloIzquierdo = this.raiz.getNodoIzquierdo();
        Nodo<T> moduloDerecho = this.raiz.getNodoDerecho();

        if (this.raiz == null) {
            System.out.println("Es necesario que exista un curso primero para añadir lecciones.");
            return;
        }

        if (moduloIzquierdo == null && moduloDerecho == null) {
            System.out.println("No se pueden añadir lecciones. Es necesario añadir módulos.");
            return;
        }

        Nodo<T> nuevaLeccion = new Nodo<>(leccion);

        /* Primero nos dirigimos al subárbol izquierdo, y verificamos si
           alguno de los dos nodos está vacío, de ser así, añadimos la nueva 
           lección                                                           */
        if (moduloIzquierdo != null) {
            if (moduloIzquierdo.getNodoIzquierdo() == null) {
                moduloIzquierdo.setNodoIzquierdo(nuevaLeccion);
                
                ((Modulo) moduloIzquierdo.getDato()).incrementarLecciones();
                return;
            } else if (moduloIzquierdo.getNodoDerecho() == null) {
                moduloIzquierdo.setNodoDerecho(nuevaLeccion);
                
                ((Modulo) moduloIzquierdo.getDato()).incrementarLecciones();
                return;
            }
        }

        // Si el hijo izquierdo de la raíz principal tiene dos hijos, entonces
        // pasamos al subárbol derecho
        // Hacemos lo mismo que lo anterior.
        if (moduloDerecho != null) {
            if (moduloDerecho.getNodoIzquierdo() == null) {
                moduloDerecho.setNodoIzquierdo(nuevaLeccion);
                
                ((Modulo) moduloDerecho.getDato()).incrementarLecciones();
            } else if (moduloDerecho.getNodoDerecho() == null) {
                moduloDerecho.setNodoDerecho(nuevaLeccion);
                
                ((Modulo) moduloDerecho.getDato()).incrementarLecciones();
            } else {
                System.out.println("No se pueden añadir más lecciones.");
            }
        }
    }
    
    public void mostrarArbol() {
        if (this.raiz == null) {
            System.out.println("No hay ningún curso disponible.");
            return;
        }
        
        metodoRecursivoMostrar(this.raiz, "", true);
    }
    
    private void metodoRecursivoMostrar(Nodo<T> nodo, String prefijo, boolean esUltimo) {
        // Se verifica si el nodo (o hijo) está vacío, de ser así, acaba el proceso.
        if (nodo == null) {
            return;
        }

        // Imprimir prefijo ya construido
        System.out.print(prefijo);

        // Imprime el primer ícono según si es el último nodo que queda.
        if (esUltimo) {
            System.out.print("└── ");
        } else {
            System.out.print("├── ");
        }

        // Se necesita identificar a qué clase pertenece el nodo, y se imprimirá
        // sus respectivos datos dependiendo de qué clase sea.
        if (nodo.getDato() instanceof Curso curso) {
            System.out.println(curso.getTitulo() + " | " + curso.getDescripcion() + " | "
                    + curso.getCategoria() + " | " + curso.getNivel());

        } else if (nodo.getDato() instanceof Modulo modulo) {
            System.out.println(modulo.getTitulo() + " | " + modulo.getDescripcion()
                    + " | Duración: " + modulo.getDuracionHoras() + " hora(s) | Cantidad lecciones: "
                    + modulo.getCantidadLecciones());

        } else if (nodo.getDato() instanceof Leccion leccion) {
            System.out.println(leccion.getTitulo() + " | " + leccion.getDescripcion());
        }

        String nuevoPrefijo;
        if (esUltimo) {
            nuevoPrefijo = prefijo + "    ";  
        } else {
            nuevoPrefijo = prefijo + "│   ";   
        }

        Nodo<T> hijoIzq = nodo.getNodoIzquierdo();
        Nodo<T> hijoDer = nodo.getNodoDerecho();

        boolean existeIzq = hijoIzq != null;
        boolean existeDer = hijoDer != null;

        // Si existe el nodo/hijo izquierdo, dependiendo de si existe o no el nodo derecho:
        // o no será el último, o sí será el último nodo que se va a imprimir.
        if (existeIzq) {
            if (existeDer) {
                metodoRecursivoMostrar(hijoIzq, nuevoPrefijo, false);
            } else {
                metodoRecursivoMostrar(hijoIzq, nuevoPrefijo, true);
            }
        }
        // Si sí existe el derecho, claramente será el último nodo a imprimir.
        if (existeDer) {
            metodoRecursivoMostrar(hijoDer, nuevoPrefijo, true);
        }
    }
}
