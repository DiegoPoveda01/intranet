package org.example;

public class Alumno {
    //Atributos
    private String nombre;
    private String apellido;
    private String rut;
    private String numeroMatricula;
    //constructor
    public Alumno(String nombre, String apellido, String rut, String numeroMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numeroMatricula = numeroMatricula;
    }
    //metodos
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public String getNumeroMatricula(){
        return numeroMatricula;
    }
    public void setNumeroMatricula(String numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
}
