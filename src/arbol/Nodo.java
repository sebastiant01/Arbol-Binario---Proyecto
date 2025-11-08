package arbol;

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
