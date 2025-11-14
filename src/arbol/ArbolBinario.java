package arbol;

/*
   Este será la clase en donde se almacenará y creará el curso virtual, manteniendo
   la estructura de un árbol binario. También estarán los métodos que permitirán
   las operaciones básicas de un árbol binario, como: insertar elementos, eliminar
   un elemento, buscar un elemento, etc.
*/

import java.util.ArrayList;
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
}
