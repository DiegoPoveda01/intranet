package org.example;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Scanner leer = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("Ingrese una opción:");
            System.out.println("1 - Agregar alumno");
            System.out.println("2 - Eliminar alumno");
            System.out.println("3 - Mostrar lista de estudiantes");
            System.out.println("4 - Salir");

            int opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del alumno:");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese el apellido del alumno:");
                    String apellido = leer.nextLine();
                    System.out.println("Ingrese el RUT del alumno:");
                    String rut = leer.nextLine();
                    System.out.println("Ingrese el número de matrícula del alumno:");
                    String numeroMatricula = leer.nextLine();
                    leer.nextLine();
                    Alumno alumno = curso.agregarAlumno(nombre, apellido, rut, numeroMatricula);
                    System.out.println("Alumno agregado: " + alumno.getNombre() + " " + alumno.getApellido());
                    break;
                case 2:
                    System.out.println("Ingrese el RUT del alumno que desea eliminar:");
                    rut = leer.nextLine();
                    Alumno alumnoAEliminar = null;
                    for (Alumno a : curso.getEstudiantes()) {
                        if (a.getRut().equals(rut)) {
                            alumnoAEliminar = a;
                            break;
                        }
                    }
                    if (alumnoAEliminar != null) {
                        curso.eliminarAlumno(alumnoAEliminar);
                        System.out.println("Alumno eliminado: " + alumnoAEliminar.getNombre() + " " + alumnoAEliminar.getApellido());
                    } else {
                        System.out.println("No se encontró ningún alumno con el RUT ingresado.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de estudiantes:");
                    for (Alumno a : curso.getEstudiantes()) {
                        System.out.println(a.getNombre() + " " + a.getApellido() + " - " + a.getRut() + " - " + a.getNumeroMatricula());
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println();
        }
        leer.close();
    }
}
