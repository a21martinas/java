/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizcalendario;
import java.util.*;
/**
 *
 * @author martin
 */
public class MatrizCalendario {
    
    public static int[][][] crearMatriz(){
        int calendario [][][]=new int[12][31][24];
        for (int m = 0; m < 12; m++) {
            int numd=31;
            if(m==1){
                numd=28;
            }else if(m%2!=0){
                   numd=30; 
                    }
            for (int d = 0; d <numd; d++) {
                for (int h = 0; h <24; h++){
                    calendario[m][d][h]=(int) (Math.random()*999+1);
                }
            }
        }
        return calendario;
    }
     

    public static void main(String[] args) {
        int mes=1;
        String diasMasCoches=" ";
        
        for(int[][]meses:crearMatriz()){
            int MAsCochesint=0;
            int diaMC=0;
            int dia=1;
            System.out.println("Mes: "+mes);
            
            for(int[]dias:meses){
                int sumHoras=0;
                for(int horas:dias){
                    System.out.print(horas+" ");
                    sumHoras+=horas;
                    
                }
                if(sumHoras>MAsCochesint){
                    MAsCochesint=sumHoras;
                    diaMC=dia;
                }
                dia++;
                System.out.println(" ");
            }
            
            diasMasCoches+="El día del mes "+mes+" con mas coches "+MAsCochesint+" es el día "+diaMC+"\n";
            mes++;
            System.out.println(" ");
        }
        System.out.println(diasMasCoches);
        
        
    }
}
