/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contratacion;

/**
 *
 * @author Martin A
 */
public class Trabajador {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String lugarNac;
    
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }
    
    public Trabajador(){
        
    }

    public Trabajador(String dni, String nombre, String apellidos, int edad, String lugarNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.lugarNac = lugarNac;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", lugarNac=" + lugarNac + '}';
    }
    
    
}
