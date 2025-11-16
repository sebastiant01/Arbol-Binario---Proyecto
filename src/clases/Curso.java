package clases;

/*
  Este será la clase la cual será la raíz del árbol binario,
  porque es donde se desglosarán las otras dos clases, o sea,
  los módulos y lecciones.
*/

public class Curso {
    private String titulo, descripcion, categoria, nivel;
    
    public Curso(String titulo, String descripcion, String categoria, String nivel) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.nivel = nivel;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
