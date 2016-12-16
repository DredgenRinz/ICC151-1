/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareasayudantia;

import javax.swing.JOptionPane;

/**
 *
 * @author Okumura Rinzler
 */
public class TareasAyudantia01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "";
        str = leerString();
        procesarString(str);
        
    }
    
    public static String leerString(){ // Permite leer y retorna la cadena leída por teclado.
        String palabras = "";
        try{
        palabras = (JOptionPane.showInputDialog(null, "Ingrese la operacion para continuar:"));
        } catch(NullPointerException ex){
            System.exit(0);
        }
        return palabras;
    }
    
    public static void procesarString(String operacion){
        String num1 = "";
        String num2 = "";
        String operator = "";
        int control = 0;
        int opControl = 0;
        operacion = operacion.replaceAll("\\s","");
        
        for(int i = 0; i < operacion.length(); i++){
            if(Character.isDigit(operacion.charAt(i))){
                if(control == 0){
                    num1 += operacion.charAt(i);
                } else {
                    num2 += operacion.charAt(i);
                }
                
            } else if(opControl == 0){
                switch(operacion.charAt(i)){
                case '+': operator = "+";
                          control++;
                    break;
                case '-': operator = "-";
                    control++;
                    break;
                case '*': operator = "*";
                    control++;
                    break;
                case '/': operator = "/";
                    control++;
                    break;
                case '^': operator = "^";
                    control++;
                    break;
                default: JOptionPane.showMessageDialog(null, "el operador es invalido, Solo se tomara en cuenta el primer operador valido.");
                    break;
            }
            }
            
        }
        resultado(num1,num2,operator);
        
    }
    
    public static int suma(int num1, int num2) {
        return (num1+num2);
    }

    public static int resta(int num1, int num2) {
        return (num1-num2);
    }

    public static double division(double num1, double num2) {
        return (num1 / num2);
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static int potencia(int num1, int num2) {
        int poten = num1;

        for (int i = 0; i < num2; i++) {
            poten = poten * num1;
        }

        return (poten);
    }

    private static void resultado(String num1, String num2, String operator) {
        String resultado = "";
        switch(operator){
                case "+": resultado = Integer.toString(suma(Integer.parseInt(num1),Integer.parseInt(num2)));
                    break;
                case "-": resultado = Integer.toString(resta(Integer.parseInt(num1),Integer.parseInt(num2)));
                    break;
                case "*": resultado = Integer.toString(multiplicacion(Integer.parseInt(num1),Integer.parseInt(num2)));
                    break;
                case "/": resultado = Double.toString(division(Integer.parseInt(num1),Integer.parseInt(num2)));
                    break;
                case "^": resultado = Integer.toString(potencia(Integer.parseInt(num1),Integer.parseInt(num2)));
                    break;
            }
        
        JOptionPane.showMessageDialog(null, "El resultaod de la Operacion es : "+resultado);
        
    }
    
}
