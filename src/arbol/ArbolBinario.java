package arbol;

/*
   Este será la clase en donde se almacenará y creará el curso virtual, manteniendo
   la estructura de un árbol binario. También estarán los métodos que permitirán
   las operaciones básicas de un árbol binario, como: insertar elementos, eliminar
   un elemento, buscar un elemento, etc.
*/

import clases.Curso;

public class ArbolBinario {
    private Nodo<Curso> raiz;
    
    public ArbolBinario() {
    }
    
    public void insertarCurso(String titulo, String descripcion) {
        if (this.raiz == null) {
            Curso nuevoCurso = new Curso(titulo, descripcion);
            
            this.raiz = new Nodo<>(nuevoCurso);
        } else {
            System.out.println("Ya hay un curso creado. No se puede añadir un curso dentro de otro curso.");
        }
    }
}
