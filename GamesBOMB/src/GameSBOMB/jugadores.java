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
public class jugadores {
    
    public boolean [] readPlayers(){
        File fichero = new File("players.txt");
		Scanner s = null;
                boolean [] jugadores = new boolean [4];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine();
                                if(linea.equals("true")){
                                   jugadores[cont] = true; 
                                } else {
                                   jugadores[cont] = false;
                                }
				
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
        return jugadores.clone();
    }
    
    public int cantPlayers(){
        File fichero = new File("players.txt");
        Collator comparador = Collator.getInstance();
        comparador.setStrength(Collator.PRIMARY);
		Scanner s = null;
                boolean [] jugadores = new boolean [4];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 
                                if(linea.equals("true")){
                                   jugadores[cont] = true; 
                                } else {
                                   jugadores[cont] = false;
                                }
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
                cont = 0;
        for(int i = 0; i < 4; i++){
            if(jugadores[i]){
                cont++;
            }
        }
        return cont;
    }
      
    public void writePlayers(int players){
        delete();
        File archivo = new File ("players.txt");
        FileWriter fichero = null;
        
        boolean [] cantPlayers = new boolean [4];
        cantPlayers[0] = true;
        if(players == 2){
            cantPlayers[1] = true;
            cantPlayers[2] = false;
            cantPlayers[3] = false;
        } else if(players == 3){
            cantPlayers[1] = true;
            cantPlayers[2] = true;
            cantPlayers[3] = false;
        }else if(players == 4){
            cantPlayers[1] = true;
            cantPlayers[2] = true;
            cantPlayers[3] = true;
        }
        	
		try {
			fichero = new FileWriter(archivo,true);
			for (boolean linea : cantPlayers) {
				fichero.write(linea + "\n");
			}
			fichero.close();
		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
    }
    
    public void deletePlayer(int player){
        File fichero = new File("players.txt");
		Scanner s = null;
                boolean [] jugadores = new boolean [4];
                int cont = 0;
                
		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 
                                if(linea.equals("true")){
                                   jugadores[cont] = true; 
                                } else {
                                   jugadores[cont] = false;
                                }
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
                
                jugadores[player] = false;
        	FileWriter fichero2 = null;
             
		try {
			fichero2 = new FileWriter("players.txt");
			for (boolean linea : jugadores) {
				fichero2.write(linea + "\n");
			}
			fichero2.close();
		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}                  
    }
    
    public int winner(){
        int cont = 0;
        File fichero = new File("players.txt");
        Scanner s = null;
        
        try {
            s = new Scanner(fichero);          
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 
                if(linea.equals("true")){
                    return (cont);        
                }
                cont++;
            }
        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
        return (0);
    }

    public void delete() {
        File fichero = new File("players.txt");
        fichero.delete();
    }
    
}
