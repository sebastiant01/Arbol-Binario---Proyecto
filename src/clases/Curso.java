package clases;

/*
  Este será la clase la cual será la raíz del árbol binario,
  porque es donde se desglosarán las otras dos clases, o sea,
  los módulos y lecciones.
*/

public class Curso {
    private String titulo, descripcion;
    
    public Curso(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
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
