/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICC202;

import java.util.Scanner;

/**
 *
 * @author administrador
 */
public class Banco {
    
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    int [] numeroscuentas = new int [50];
    int [] saldos = new int [50];
    int cuentas = 0;
    int opcion = 0;
    boolean lock = false;
    
    do{
        System.out.println("1)Ingresar una nueva cuenta\n"
                + "2) Eliminar una Cuenta\n"
                + "3) mostrar una cuenta\n"
                + "4) depositar dinero a una cuenta\n"
                + "5) Girar dinero a una cuenta\n"
                + "6) Mostar Informacion de cuentas\n"
                + "7) calcular saldo medio, maximo y minimo\n"
                + "8) mostrar todas las cuentas\n"
                + "9) salir");
        opcion = leer.nextInt();
       switch(opcion){
           case 1:
               if(cuentas<50){
                   System.out.println("Ingrese Numero cuenta,Debe estar entre 10000 y 90000");
                   int temp = leer.nextInt();
                   if (temp>10000 && temp<90000){
                       for(int i=0;i<50;i++){
                           if(numeroscuentas[i]==0){
                               if(lock!=true){
                                  numeroscuentas[i]=temp;
                                  cuentas++; 
                                  lock = true;
                               }
                              
                           }
                       }
                       lock = false;
                   } else {
                       System.out.println("La cuenta es invalida");
                   }
                   ordenar(numeroscuentas,saldos);
               }
               break;
           case 2:
               System.out.println("Ingrese numero cuenta a eliminar");
               int temp = leer.nextInt();
               for(int i=0; i<50;i++){
                   if(numeroscuentas[i]==temp){
                       numeroscuentas[i]=0;
                       saldos[i]=0;
                       ordenar(numeroscuentas,saldos);
                       cuentas--;
                   }
               }
               break;
           case 3:
               System.out.println("Ingrese numero cuenta a buscar");
               int tem = leer.nextInt();
               for(int i=0;i<50;i++){
                   if(numeroscuentas[i]==tem){
                       System.out.println("El numero de cuenta "+tem+" tiene "+saldos[i]);
                   }
               }
               
               
               break;
           case 4:
               System.out.println("Ingrese numero cuenta a depositar");
               int tempo = leer.nextInt();
               for(int i=0;i<50;i++){
                   if(numeroscuentas[i]==tempo){
                       System.out.println("Ingrese cantidad a depositar");
                       int dep = leer.nextInt();
                       saldos[i]+=dep;
                   }
               }               
               break;
           case 5: 
               System.out.println("Ingrese numero cuenta a girar");
               int te = leer.nextInt();
               for(int i=0;i<50;i++){
                   if(numeroscuentas[i]==te){
                       System.out.println("Ingrese cantidad a girar");
                       int dep = leer.nextInt();
                       saldos[i]-=dep;
                   }
               }               
               break;
           case 6:
               System.out.println("La cantidad de cuentas activas es: "+cuentas);
               int valor = 0;
               for (int i=0;i<50;i++){
                   valor+=saldos[i];
               }
               System.out.println("El saldo acumulado en ellas es "+valor);
               break;
           case 7:
               int medio=0;
               int maximo =0;
               int minimo=0;
               for (int i=0;i<50;i++){
                   if(saldos[i]<minimo){
                       minimo=saldos[i];
                   }
                   if(saldos[i]>maximo){
                       maximo=saldos[i];
                   }
                   medio+=saldos[i];
               }
               medio/=cuentas;
               System.out.println("El maximo en cuenta es "+maximo+" el minimo es "+minimo+" y el promedio es "+medio);
               
               break;
           case 8:
               for(int i=0;i<50;i++){
                   if(numeroscuentas[i]!=0){
                       System.out.println(numeroscuentas[i]+" "+saldos[i]);
                   }
                   
               }
               break;
           case 9:
               System.out.println("Adios!");
       } 
    }while(opcion!=9);
    }
public static void ordenar(int cuentas[], int saldos[]){

		//Usamos un bucle anidado
		for(int i=0;i<(cuentas.length-1);i++){
			for(int j=i+1;j<cuentas.length;j++){
				if(cuentas[i]>cuentas[j]){
					//Intercambiamos valores
					int variableauxiliar=cuentas[i];
                                        int var2 = saldos[i];
					cuentas[i]=cuentas[j];
					cuentas[j]=variableauxiliar;
                                        saldos[i]=saldos[j];
					saldos[j]=var2;

				}
			}
		}
	}    
    
}
