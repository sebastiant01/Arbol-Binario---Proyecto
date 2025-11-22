package main;

import clases.*;
import arbol.ArbolBinario;
import java.util.Scanner;

public class PlataformaVirtual {
    static Scanner sc = new Scanner(System.in);
    static ArbolBinario<Object> arbol = new ArbolBinario<>();
    
    public static void main(String[] args) {
        System.out.println("Bienvenido a la plataforma virtual.");
        System.out.println("En este programa vas a poder interactuar con el sistema de cursos.");
        System.out.println("Aquí puedes añadir un curso, asimismo se puede añadir módulos y lecciones.");
        System.out.println("Nota: Tenga en cuenta de que sólo podrá crear un solo curso, debido a limitaciones técnicas.");
        
        int opcion;
        
        do {
            System.out.println();
            System.out.println("Por favor elige una opción para continuar: ");
            System.out.println("1. Añadir un nuevo curso.");
            System.out.println("2. Añadir un módulo.");
            System.out.println("3. Añadir una lección.");
            System.out.println("4. Mostrar el curso.");
            System.out.println("0. Salir.");
            System.out.println();
            
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    insertarCurso();
                    break;
                case 2:
                    insertarModulo();
                    break;
                case 3:
                    insertarLeccion();
                    break;
                case 4:
                    System.out.println("---------------------------------------------------------------------");
                    arbol.mostrarArbol();
                    System.out.println("---------------------------------------------------------------------");
                    break;
            }
        } while (opcion != 0);
    }
    
    private static void insertarCurso() {
        System.out.print("\nIntroduce el título para el nuevo curso: ");
        sc.nextLine();
        String tituloCurso = sc.nextLine();
        System.out.print("Introduce una descripción corta para este curso: ");
        String descripcionCurso = sc.nextLine();
        System.out.print("Introduce la categoría de este curso (Ejemplo: Programacion, Tecnología, etc.): ");
        String categoriaCurso = sc.nextLine();
        System.out.print("Introduce el nivel de este curso (Principiante, intermedio, avanzado): ");
        String nivelCurso = sc.nextLine();

        Curso nuevoCurso = new Curso(tituloCurso, descripcionCurso, categoriaCurso, nivelCurso);
        
        if (arbol.getRaiz() == null) {
           System.out.println("\nNuevo curso añadido.");
        }

        arbol.insertarCurso(nuevoCurso);
    }
    
    private static void insertarModulo() {
        System.out.print("\nIntroduce el título para el nuevo módulo: ");
        sc.nextLine();
        String tituloModulo = sc.nextLine();
        System.out.print("Introduce una descripción corta para el módulo: ");
        String descripcionModulo = sc.nextLine();
        System.out.print("Introduce la duración en horas de este módulo: ");
        
        double duracionHoras;
        try {
            duracionHoras = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Debes de ingresar un número válido.");
            return;
        }
        
        Modulo nuevoModulo = new Modulo(tituloModulo, descripcionModulo, duracionHoras);
        
        if (arbol.getRaiz().getNodoIzquierdo() == null || arbol.getRaiz().getNodoDerecho() == null) {
            System.out.println("\nNuevo módulo añadido.");
        }
        
        arbol.insertarModulo(nuevoModulo);
    }
    
    private static void insertarLeccion() {
        System.out.print("\nIntroduce el título para esta lección: ");
        sc.nextLine();
        String tituloLeccion = sc.nextLine();
        System.out.print("Introduce una descripción corta para la lección: ");
        String descripcionLeccion = sc.nextLine();
        
        Leccion nuevaLeccion = new Leccion(tituloLeccion, descripcionLeccion);
        System.out.println("\nNueva lección añadida.");
        arbol.insertarLeccion(nuevaLeccion);
    }
}
