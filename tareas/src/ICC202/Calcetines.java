/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICC202;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Calcetines {
    private static final Scanner leer=new Scanner(System.in);
    public static void main(String[] args){
        
        int [][] hilo = new int [3][4];
        int [][] lana = new int [3][4];
        int opcion =0;
        do{
        
        menu();
        opcion = leer("",1,2);
        if(opcion==1){
            ventas(hilo,lana);
        }
        }while(opcion!=2);
        resumen(hilo,lana);
        
    }
    
    public static void menu(){
        System.out.println("1) vender");
        System.out.println("2)Salir");
    }
    public static int leer(String aux,int min,int max){
        System.out.println(aux);
        int temp =0;
        boolean lock;
        do{
        try{
           temp = leer.nextInt();
           lock=false;
           if(temp<min || temp>max){
               System.out.println("Valor fuera de rango, reingrese");
               lock=true;
           }
        }catch(Exception e){
            System.out.println("Valor Ingresado no valido, reintente");
            lock=true;
        }
        }while(lock==true);
        
        return temp;
    }
    
    public static void ventas(int [][] hilo, int [][] lana){
        int vendedor=leer("ingrese cod. vendedor",1,15);
        int categoria =leer("Seleccione categoria: 1)niño 2)Hombre 3)mujer",1,3);
        int material =leer("Seleccione material: 1)hilo 2)lana",1,2);
        int color=leer("Seleccione color: 1)blanco 2)negro 3)gris 4)amarillo",1,4);
        int cant=leer("Ingrese cantidad a vender",1,100);
        switch (material){
            case 1:
                hilo[categoria][color]+=cant;
                break;
            case 2:
                lana[categoria][color]+=cant;
                break;
        }
        
    }
    
    public static void resumen(int [][] hilo, int [][] lana){
        String [] colores = {"blanco","negro","gris","amarillo"};
        String [] categ = {"niño","hombre","mujer"};
        int [] categoria=new int [3];
        int [] color=new int [4];
        int dinero =0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println("La categoria "+categ[i]+" con el color "+colores[j]+" vendio "+hilo[i][j]+" calcetines de hilo");
                categoria[i]+=hilo[i][j];
                color[j]=hilo[i][j];
                if(i==0){
                    dinero += hilo[i][j]*1000;
                }
                if(i==1){
                    dinero+=hilo[i][j]*1800;
                }
                if(i==2){
                    dinero+=hilo[i][j]*1700;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println("La categoria "+categ[i]+" con el color "+colores[j]+" vendio "+lana[i][j]+" calcetines de lana");
                categoria[i]+=lana[i][j];
                color[j]=lana[i][j];                
                if(i==0){
                    dinero += hilo[i][j]*800;
                }
                if(i==1){
                    dinero+=hilo[i][j]*1500;
                }
                if(i==2){
                    dinero+=hilo[i][j]*1400;
                }                
            }
        }
        
        System.out.println("La recaudacion del dia fue "+dinero);
        ordenar(categoria);
        ordenar(color);
        System.out.println("La categoria que mas vendio fue "+categoria[2]);
        System.out.println("El color que menos vendio fue "+color[0]);
        
    }
    
public static void ordenar(int[] tipo){

		//Usamos un bucle anidado
		for(int i=0;i<(tipo.length-1);i++){
			for(int j=i+1;j<tipo.length;j++){
				if(tipo[i]>tipo[j]){
					//Intercambiamos valores
					int variableauxiliar=tipo[i];
					tipo[i]=tipo[j];
					tipo[j]=variableauxiliar;
				}
			}
		}
	}    
    
    
}
