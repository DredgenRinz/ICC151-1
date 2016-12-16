/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICC202;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Administrador
 */
public class Tablero2 {
    public static void main(String[] args) {
File archivo=null;
FileReader fr=null;
BufferedReader br=null;
try {
archivo = new File ("tablero.txt");

fr = new FileReader (archivo);

br = new BufferedReader(fr);

String linea;
String delimiter = "#" ;
String matriz[][]= new String[8][8];
int h=0;
String a[]=new String[8];
while(((linea=br.readLine())!=null)) {

a=linea.split(delimiter);
for(int j=0;j<a.length;j++)
{
matriz[h][j]=a[j];
}
h++;
}

System.out.print ("MATRIZ\n\n");
for (int j= 0; j <matriz.length; j++) {

for(int o= 0; o <matriz[0].length; o++) {
    

System.out.print(matriz[j][o] + " ");

}
System.out.println();
}
}
catch(IOException e){

System.out.println(e);
}
    
    
    
    
    
}




}


