package com.bibliotecaFV.Biblioteca.model;

public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private int rut;
    private int numeroTelefono;
    private String fechaContratacion;
}
public Cliente(){
    
}


Cliente cliente1 = new Cliente("pepe","Papu",12,212121212-1,123456789,"hoy");


public String GetNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;

}
public String GetApellido(){
    return apellido;
}

public int GetEdad(){
    return edad;
}
public int setId(int edad){
    this.edad = edad;
}

public int GetRut(){
    return rut;
}
public int setId(int rut){
    this.rut = rut;
}

public int GetNumeroTelefono(){
    return numeroTelefono;
}
public int setId(int numeroTelefono){
    this.numeroTelefono = numeroTelefono;
}
public String GetFechaContratacion(){
    return fechaContratacion;
}
public void setFechaContratacion(String fechaContratacion){
    this.fechaContratacion = fechaContratacion;
}