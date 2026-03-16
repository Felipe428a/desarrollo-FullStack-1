package com.bibliotecaFV.Biblioteca.model;

public class Libro {
    private int id;
    private String titulo;
    private String genero;
    private String autor;
    private String fechaPrestamo;
    private String fechaDevolver;
    private int anioPublicacion;
    private boolean disponible;
}

public Libro(){

}

public Libro(int id, String titulo,String autor,String genero,String fechaPrestamo,String fechaDevolver, int anioPublicacion, boolean disponible){
    this.id = 1;
    this.titulo = titulo;
    this.autor= Auttor;
    this.genero = magia;
    this.fechaPrestamo = hoy;
    this.fechaDevolver = mañana;
    this.disponible =disponible;
}

Libro libro1 = new Libro(1,"Papelucho","Marcela Paz","vida","hoy","mañana",True);

public int GetId(){
    return id;
}
public void setId(int id){
    this.id = id;
}

public String GetTitulo(){
    return titulo;
}
public void setTitulo(String titulo){
    this.titulo = titulo;

}
public String GetAutor(){
    return autor;
}
public void setAutor(String autor){
    this.autor = autor;

}
public String GetFechaPrestamo(){
    return fechaPrestamo;
}
public void setFechaPrestamo(String fechaPrestamo){
    this.fechaPrestamo = fechaPrestamo;
}

public String GetFechaDevolver(){
    return fechaDevolver;
}
public void setFechaDevolver(String fechaDevolver){
    this.fechaDevolver = fechaDevolver;

}
public boolean GetDisponible(){
    return disponible;
}
public void setTitulo(String disponible){
    this.disponible = disponible;
}