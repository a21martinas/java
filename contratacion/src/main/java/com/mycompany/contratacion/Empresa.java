/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contratacion;

/**
 *
 * @author Martin A
 */
public class Empresa {
     private String cif;
    private String nombre;
    private String direccion;
    private int numEmpl;

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }
    
    public Empresa(){
        
    }

    public Empresa(String cif, String nombre, String direccion, int numEmpl) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numEmpl = numEmpl;
    }

    @Override
    public String toString() {
        return "Empresa{" + "cif=" + cif + ", nombre=" + nombre + ", direccion=" + direccion + ", numEmpl=" + numEmpl + '}';
    }
    
}
