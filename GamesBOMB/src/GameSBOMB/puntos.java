/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameSBOMB;

import java.io.File;
import java.io.FileWriter;
import java.text.Collator;
import java.util.Scanner;

/**
 *
 * @author yojvn
 */
public class puntos {
    
    public int [] readPuntos(){
        File fichero = new File("puntos.txt");
		Scanner s = null;
                int [] puntos = new int [4];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				puntos[cont] = Integer.parseInt(linea);
                                cont++;
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
        return puntos.clone();
    }

    public void writePuntos(int [] puntos){
        delete();
        File archivo = new File ("puntos.txt");
        FileWriter fichero = null;
        	
		try {
			fichero = new FileWriter(archivo,true);
			for (int linea : puntos) {
				fichero.write(linea + "\n");
			}
			fichero.close();
		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
    }
    
    public void delete() {
        File fichero = new File("puntos.txt");
        fichero.delete();
    }
    public int mayor(){
        File fichero = new File("puntos.txt");
        int mayor = 0;
        int puntosmay = 0;
		Scanner s = null;
                int [] puntos = new int [4];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				puntos[cont] = Integer.parseInt(linea);
                                cont++;
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
        for(int i = 0; i < puntos.length; i++){
            if(puntos[i]> puntosmay){
                puntosmay = puntos[i];
                mayor = i;
            }
        }        
        return (mayor+1);
    }    
    
}
