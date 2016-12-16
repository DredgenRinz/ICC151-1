package prueba4;

import java.util.Random;
import java.util.Scanner;

public class Prueba4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        String[][] europa= new String[50][2];
        String[][] asiayoceania=new String[62][2];
        String[][] africa=new String[54][2];
        String[][] america=new String[35][2];
        String[]repeu=new String[6];
        String[]repasoc=new String[6];
        String[]repaf=new String[6];
        String[]repam=new String[6];
        
        do{
            menu();
            eleccion = sc.nextInt();
            switch(eleccion){
                case 1:
                    llenarMatriz(1,europa);
                    llenarMatriz(2,asiayoceania);
                    llenarMatriz(3,africa);
                    llenarMatriz(4,america);
                    break;
                case 2:
                    if(repeu[0]==null){
                        System.out.println("Aun no se han seleccionado");
                    } else{
                        System.out.println("Representantes en codigo de Europa");
                        for(int i=0;i<repeu.length;i++){
                            System.out.println(repeu[i]);
                        }
                        System.out.println("Representantes en codigo de Asia y Oceania");
                        for(int i=0;i<repeu.length;i++){
                            System.out.println(repasoc[i]);
                        }  
                        System.out.println("Representantes en codigo de Africa");
                        for(int i=0;i<repeu.length;i++){
                            System.out.println(repaf[i]);
                        }
                        System.out.println("Representantes en codigo de America");
                        for(int i=0;i<repeu.length;i++){
                            System.out.println(repam[i]);
                        }
                    }
                    break;
                case 3:
                    repeu=buscarRepres(europa);
                    repasoc=buscarRepres(asiayoceania);
                    repaf=buscarRepres(africa);
                    repam=buscarRepres(america);                    
                    break;
                case 4:
                    if(repeu[0]==null){
                        System.out.println("Aun no se han realizado los sorteos");
                    }else{
                        for(int i=0;i<repeu.length;i++){
                            System.out.print(repeu[i]+" "+repasoc[i]+" "+repaf[i]+" "+repam[i]+"\n");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Adeu");
                    break;
                default:
                    break;
            }
        }while(eleccion!=5);


    }
    
    public static void llenarMatriz(int cod,String[][] federacion){
        for(int i=0;i<federacion.length;i++){
            federacion[i][0] = (cod+"0"+i);
            if(i>9){
                federacion[i][0] = Integer.toString(cod)+i;
            }
            federacion[i][1] = "pais "+i;
        }
    }
    
    
    public static void menu(){
        System.out.println("1)Registar paises en la lista \n"
                + "2)Imprimir los representantes de cada federacion\n"
                + "3) Realizar Sorteo \n"
                + "4) Imprimir la Formacion de los grupos\n"
                + "5) salir");
    }
    
    public static String[] buscarRepres(String[][] repre){
        
        String [] repres = new String [6];
        int n=repre.length;  //numeros aleatorios
        int k=n;  //auxiliar;
        int[] numeros=new int[n];
        int[] resultado=new int[n];
        Random rnd=new Random();
        int res;        
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }
        
        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);            
            resultado[i]=Integer.parseInt(repre[res][0]);
            repre[res][0]=repre[k-1][0];
            k--;
            
        } 
        for(int i=0;i<6;i++){
            repres[i] = Integer.toString(resultado[i]);
        }
        
        return repres;
    }
    
    
}
