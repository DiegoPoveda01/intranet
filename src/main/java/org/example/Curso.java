package org.example;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Alumno> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList<Alumno>();
    }

    public List<Alumno> getEstudiantes() {
        return estudiantes;
    }

    public Alumno agregarAlumno(String nombre, String apellido, String rut, String numeroMatricula){
        Alumno alumno = new Alumno(nombre, apellido, rut, numeroMatricula);
        estudiantes.add(alumno);
        return alumno;
    }

    public void eliminarAlumno(Alumno alumno){
        estudiantes.remove(alumno);
    }
}
