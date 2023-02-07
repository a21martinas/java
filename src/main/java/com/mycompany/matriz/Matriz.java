/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz;

/**
 *
 * @author martin
 */
public class Matriz {
    
    public static int[][] crearMatriz(){
        int [][] matriz1= new int [6][6];
        
        for(int filas []:matriz1){
            for(int i=0;i<filas.length;i++){
                filas[i]=(int) (Math.random()*100);
            }
        }
        return matriz1;
    }

    public static void main(String[] args) {
        
        int matrizF[][]=crearMatriz();
         
        for(int fila[]:matrizF){
            for(int columna:fila){
                System.out.print(columna+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        
        int contadorDiaPr=matrizF.length-1;
        int contadorDiaSecCre=0;
        int contadorDiaSecDec=matrizF.length-1;
        
        for(int i=0;i<matrizF.length;i++){
            for(int j=0;j<matrizF[i].length;j++){
                if(i==j){
                    System.out.print(matrizF[contadorDiaPr][contadorDiaPr]+" ");
                    contadorDiaPr--;
                }
                else if(i==contadorDiaSecCre && j==contadorDiaSecDec){
                    System.out.print(matrizF[contadorDiaSecDec][contadorDiaSecCre]+" ");
                    contadorDiaSecCre++;
                    contadorDiaSecDec--;
                }
                else{
                System.out.print(matrizF[i][j]+" ");
                }
            }
             System.out.println(" ");
        }
    }
}
