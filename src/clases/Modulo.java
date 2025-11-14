package clases;

/*
   Esta clase será la siguiente a la clase curso, un curso tiene distintos módulos,
   por lo cual serán los siguientes a ser introducidos. Si no hay un nodo de tipo "Curso",
   no se podrá introducir.
*/

public class Modulo {
    private String titulo, descripcion;
    private double duracionHoras;
    
    public Modulo(String titulo, String descripcion, double duracionHoras) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracionHoras = duracionHoras;
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

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }
}
