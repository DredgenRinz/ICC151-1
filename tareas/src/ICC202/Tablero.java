/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICC202;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Administrador
 */
public class Tablero {
    public static void main(String[] args){
        
        String [][] tablero= new String [8][8];
        
        tablero[(int) (Math.random()*8+0)][(int) (Math.random()*8+0)] = "Rey_N";
        tablero[(int) (Math.random()*8+0)][(int) (Math.random()*8+0)] = "Reina_B";
        tablero[(int) (Math.random()*8+0)][(int) (Math.random()*8+0)] = "Peon_A";
        tablero[(int) (Math.random()*8+0)][(int) (Math.random()*8+0)] = "Peon_B";
        
        guardartabla(tablero);
        
    }
        
    public static void guardartabla(String [][]tabla){
        File archivo = new File ("tabla.txt");
        FileWriter fichero = null;
        	
		try {
			fichero = new FileWriter(archivo,true);
			for (int i=0;i<8;i++) {
                            for (int j=0;j<8;j++){
				fichero.write(tabla[i][j]+"#");
                                
                            }
                            fichero.write("\n");
			}
			fichero.close();
		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
    }
}



