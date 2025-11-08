package arbol;

/*
   Este será la clase en donde almacenará cada módulo y lección para el árbol binario,
   se usará un nodo genérico para que permita crear nodos de distintas clases para
   evitar problemas respecto a tipos de datos.
*/

public class Nodo<T> {
    private T dato;
    private Nodo<T> nodoIzquierdo;
    private Nodo<T> nodoDerecho;
    
    public Nodo(T dato) {
        this.dato = dato;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public void setNodoIzquierdo(Nodo<T> nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }

    public Nodo<T> getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoDerecho(Nodo<T> nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }
}
