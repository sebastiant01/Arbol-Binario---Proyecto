package arbol;

/*
   Este será la clase en donde se almacenará y creará el curso virtual, manteniendo
   la estructura de un árbol binario. También estarán los métodos que permitirán
   las operaciones básicas de un árbol binario, como: insertar elementos, eliminar
   un elemento, buscar un elemento, etc.
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
                return;
            } else if (moduloIzquierdo.getNodoDerecho() == null) {
                moduloIzquierdo.setNodoDerecho(nuevaLeccion);
                return;
            }
        }

        // Si el hijo izquierdo de la raíz principal tiene dos hijos, entonces
        // pasamos al subárbol derecho
        // Hacemos lo mismo que lo anterior.
        if (moduloDerecho != null) {
            if (moduloDerecho.getNodoIzquierdo() == null) {
                moduloDerecho.setNodoIzquierdo(nuevaLeccion);
            } else if (moduloDerecho.getNodoDerecho() == null) {
                moduloDerecho.setNodoDerecho(nuevaLeccion);
            } else {
                System.out.println("No se pueden añadir más lecciones.");
            }
        }
    }
}
