/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3pc;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class estadoCentrosAsistenciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cant = 0;
        int desnutridorango1=0;
        int desnutridorango2=0;
        int desnutridorango3=0;
        String edades="";
        int desnutridos=0;
        int normales=0;
        int sobrepeso=0;
        int mayorcentro=0;
        int atenciones=0;
        cant = validacion("Ingrese la cantidad de Centros Asistenciales a los que se le hara Seguimiento: ");
        int [][] centrosAsistenciales = new int [cant][4];
        for(int i=0;i<cant;i++){
            centrosAsistenciales[i][0] = (validacion("Ingrese la cantidad de atenciones del centro "+(i+1)));
        }
        for (int i=0;i<cant;i++){
            for(int j=0; j<(centrosAsistenciales[i][0]);j++);
            int edad = validacion("ingrese edad del niño");
            double peso = (validacionD("Ingrese Peso del niño"));
            int rango1 = (3*edad + 7) - 4;
            int rango2=(3*edad + 7) + 4;
            if(peso>rango1&&peso<rango2){
                centrosAsistenciales[i][2]++;
            }else if(peso<rango1){
                centrosAsistenciales[i][1]++;
                if(edad<=3){
                    desnutridorango1++;
                }else if(edad>3&&edad<=6){
                    desnutridorango2++;
                }else if(edad>6&&edad<=9){
                    desnutridorango3++;
                }
            }else if(peso>rango2){
                centrosAsistenciales[i][3]++;
            } 
        }
        
        for(int i=0;i<cant;i++){
            if(atenciones<centrosAsistenciales[i][0]){
                mayorcentro = i+1;
            }
        }
        for(int i=0;i<cant;i++){
            desnutridos += centrosAsistenciales[i][1];
            normales += centrosAsistenciales[i][2];
            sobrepeso +=centrosAsistenciales[i][3];
        }
        
        if(desnutridorango1>desnutridorango2 && desnutridorango1>desnutridorango3){
            edades="Entre 1 y 3";
        }else if(desnutridorango2>desnutridorango1&&desnutridorango2>desnutridorango3){
            edades="Entre 4 y 6";
        }else if(desnutridorango3>desnutridorango1&&desnutridorango3>desnutridorango2){
            edades="Entre 5 y 9";
        }
    
        System.out.println("La cantidad de niños desnutridos en total es: "+desnutridos);
        System.out.println("La cantidad de niños en rango es: "+normales);
        System.out.println("La cantidad de niños con sobrepeso es: "+sobrepeso);
        System.out.println("El centro de Salud con mas Atenciones es el centro de salud codigo "+mayorcentro);
        System.out.println("La mayor cantidad de desnutridos se encuentra "+edades+" años.");
        
    }
    
    
    public static int validacion(String out){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println(out);
        boolean control;
        do{
        try{
            num = sc.nextInt();
            control = false;
        } catch(Exception e){
            System.out.println("Ingrese solo numeros!!!!");
            sc.nextLine();
            control = true;
        }
        }while (control);
        
        return num;
    }

    private static double validacionD(String out) {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        System.out.println(out);
        boolean control;
        do{
        try{
            num = sc.nextInt();
            control = false;
        } catch(Exception e){
            System.out.println("Ingrese solo numeros!!!!");
            sc.nextLine();
            control = true;
        }
        }while (control);
        
        return num;  
    }
    
}
