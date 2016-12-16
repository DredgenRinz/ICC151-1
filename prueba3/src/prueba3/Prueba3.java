/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3;

import java.util.Scanner;
/**
 *
 * @author 
 */
public class Prueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int nocero = 0;
        int igual1 = 0;
        int cont = 1;
        int cont2=1;
        int columnas = 0;
        int fila=0;
        int sumadatos = 0;
        String matriz2 ="";
        String matriztrans2 = "";
        System.out.println("indique valor de filas");
        x=sc.nextInt();
        System.out.println("Ingrese valor de Columnas");
        y=sc.nextInt();
        
        int [][] matriz = new int [x][y];
        int [][] matriztrans = new int [y][x];
        
        for(int i=0; i<x; i++){ //se rellena la matriz
            for(int j=0;j<y;j++){
                matriz[i][j] = (int)Math.floor(Math.random()*((-100)-100)+100);
            }
        }
        
        for(int i=0; i<x; i++){
            for(int j=0;j<y;j++){
                if(matriz[i][j] != 0){ //si es diferente de 0
                    nocero++;
                }
                if(matriz[i][j] ==1 || matriz[i][j] == -1 ){ //si es gual a 1 o -1
                    igual1++;
                }   
                cont2*=matriz[i][j];
                if(i==j){
                    sumadatos+=matriz[i][j];
                }
            }
            if(cont2<0){ //si la multiplicacion de comuna es menor a 1
                columnas++;
            }
            cont2 = 1;
        }   
        
        
        for(int i=0; i<y; i++){
            for(int j=0;j<x;j++){
                cont *= matriz[j][i];
                matriz2 += matriz[j][i] +" ";
                matriztrans[i][j] = matriz[j][i];
                matriztrans2 += matriztrans[i][j] + " ";
            }
            matriz2 += "\n";
            matriztrans2 += "\n";
            if(cont>10000){
                fila++;
            }
            cont=1;
        } 
        
        
    System.out.println("La cantidad de datos que son diferentes a cero son "+nocero);
    System.out.println("La cantidad de datos que son iguales a 1 o -1 son "+igual1);
    System.out.println("La cantidad de datos cuya multiplicacion es mayor a 10000 son "+fila);
    System.out.println("La cantidad de columnas que su multiplicacion es menor a cero son "+columnas);
    System.out.println("La suma de los datos de la diagonal de la matriz es "+sumadatos);
    System.out.println("La matriz es \n" +matriz2+"\n");
    System.out.println("La matriz transpuesta es \n "+matriztrans2);
    
    }
    
}
