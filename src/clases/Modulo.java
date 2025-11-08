package clases;

/*
   Esta clase será la siguiente a la clase curso, un curso tiene distintos módulos,
   por lo cual serán los siguientes a ser introducidos. Si no hay un nodo de tipo "Curso",
   no se podrá introducir.
*/

public class Modulo {
    private String titulo, descripcion, idModulo;
    private double duracionHoras;
    private int numeroModulo;
    
    public Modulo(String titulo, String descripcion, String idModulo, double duracionHoras, int numeroModulo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.idModulo = idModulo;
        this.duracionHoras = duracionHoras;
        this.numeroModulo = numeroModulo;
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

    public String getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(String idModulo) {
        this.idModulo = idModulo;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public int getNumeroModulo() {
        return numeroModulo;
    }

    public void setNumeroModulo(int numeroModulo) {
        this.numeroModulo = numeroModulo;
    }
}
