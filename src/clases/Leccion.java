package clases;

public class Leccion {
    private String titulo, descripcion;
    private boolean completado;
    
    public Leccion(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completado = false;
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

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
