package clases;

import java.util.ArrayList;

public class Modulo {
    private String titulo, descripcion;
    private ArrayList<Leccion> leccionesModulo;
    
    public Modulo(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.leccionesModulo = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
