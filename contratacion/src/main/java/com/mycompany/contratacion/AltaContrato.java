/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.contratacion;

import java.util.Scanner;
/**
 *
 * @author Martin A
 */
public class AltaContrato {
   
    public static void resolverCadena(String cadena){
        Trabajador trabajador=new Trabajador();
         Empresa empresa=new Empresa();
         
        String partes []= cadena.split("&");
                trabajador.setDni(partes[0]);
                trabajador.setNombre(partes[1]);
                trabajador.setApellidos(partes[2]);
                trabajador.setEdad(Integer.parseInt(partes[3]));
                trabajador.setLugarNac(partes[4]);

                empresa.setCif(partes[5]);
                empresa.setDireccion(partes[6]);
                empresa.setNombre(partes[7]);
                empresa.setNumEmpl(Integer.parseInt(partes[8]));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dni;
        String nombre;
        String apellidos;
        int edad;
        String lugarNac;
        String cif;
        String nombreEmpr;
        String direccion;
        int numEmpl;
        
        String cadena;
        
        Scanner leer=new Scanner(System.in);
        
         Trabajador trabajador=new Trabajador();
         Empresa empresa=new Empresa();
         
         boolean fin =false;
        
        while(fin==false){
         
            System.out.println("Escriba el numero de la opción elegida:\n0 Finalizar programa.\n1 Alta de un empleado.\n2 Mostrar información del empleado.\n3 Entrada de datos por cadena especial y mostrar el nuevo empleado.\n");
            String opcion=leer.nextLine();
            
            System.out.println(opcion);
            
            if ("0".equals(opcion)){
                fin=true;
            }
            else if("1".equals(opcion)){
                System.out.println("dni");
                dni=leer.nextLine();
                System.out.println("nombre");
                nombre=leer.nextLine();
                System.out.println("apellidos");
                apellidos=leer.nextLine();
                System.out.println("edad");
                edad=Integer.parseInt(leer.nextLine());
                System.out.println("lugarNac");
                lugarNac=leer.nextLine();
                System.out.println("cif");
                cif=leer.nextLine();
                System.out.println("nombreEmpr");
                nombreEmpr=leer.nextLine();
                System.out.println("direccion");
                direccion=leer.nextLine();
                System.out.println("numEmpl");
                numEmpl=leer.nextInt();

                trabajador.setDni(dni);
                trabajador.setNombre(nombre);
                trabajador.setApellidos(apellidos);
                trabajador.setEdad(edad);
                trabajador.setLugarNac(lugarNac);

                empresa.setCif(cif);
                empresa.setDireccion(direccion);
                empresa.setNombre(nombre);
                empresa.setNumEmpl(numEmpl);
            }
            else if("2".equals(opcion)){
                System.out.println(trabajador.toString()); 
                System.out.println(empresa.toString()); 
            }
            else if("3".equals(opcion)){
                
                System.out.println("Introducir cadena"); 
               cadena=leer.nextLine();
                System.out.println("Empleado dado de alta");
            }
            else{
                
                System.out.println("Escoger número correcto"); 
                System.out.println(" ");
            }
            
            
        }
        
        
    }
    
}
