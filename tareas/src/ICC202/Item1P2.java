/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICC202;
import java.util.*;

/**
 *
 * @author Administrador
 */
public class Item1P2 {
    public static void main(String[] args){
        
        int alumnos,pruebas,i;
        
        alumnos = solicitaNumero();
        pruebas = solicitaNumero();
        pruebas++;
        float notas[][] = new float[alumnos][pruebas];
        
        ingresarNotas(notas,alumnos,pruebas);
        calcularPromedios(notas,alumnos,pruebas);
        mostrarNotas(notas,alumnos,pruebas);
        for(i=0;i<alumnos;i++){
            if(estado(notas,pruebas,i))
                System.out.println("Alumno aprobado con promedio "+notas[i][pruebas-1]);
            else
                System.out.println("Alumno reprobado con promedio "+notas[i][pruebas-1]);
        }
    }

    private static int solicitaNumero() {
        Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese cantidad");
       int cant=0;
       try{
           cant  = leer.nextInt();
       }catch(Exception e){
           System.out.println("Valor ingresado no valido, reingrese");
       
       }
       
       return cant;
    }

    private static void ingresarNotas(float[][] notas, int alumnos, int pruebas) {
        Scanner leer = new Scanner(System.in);
        for(int i=0;i<alumnos;i++){
            for(int j=0;j<pruebas-1;j++){
                System.out.println("Ingresar notas prueba "+(i+1));
                try{
                    notas[i][j]=leer.nextFloat();
                    while(notas[i][j]<1&&notas[i][j]>7){
                        System.out.println("Nota invalida reingrese");
                        notas[i][j]=leer.nextFloat();
                    }
                }catch(Exception e){
                    System.out.println("Valor ingresado no valido, reintente");
                }
                
            }
        }
    }

    private static void calcularPromedios(float[][] notas, int alumnos, int pruebas) {
        Float prom = 0.0f;
        for(int i=0;i<alumnos;i++){
            for(int j=0;j<pruebas;j++){
                prom+=notas[i][j];
            } 
            notas[i][pruebas-1]=prom/(pruebas-1);
            prom=0.0f;
        }
    }

    private static void mostrarNotas(float[][] notas, int alumnos, int pruebas) {
        for(int i=0;i<alumnos;i++){
            System.out.println("Alumno "+(i+1)+": \n");
            for(int j=0;j<pruebas;j++){
                System.out.print(notas[i][j]+" ");
            }
            System.out.println();
        }        
    }

    private static boolean estado(float[][] notas, int pruebas, int i) {
        if(notas[i][pruebas-1]>=4){
            return true;
        }
        return false;
    }
    
}
