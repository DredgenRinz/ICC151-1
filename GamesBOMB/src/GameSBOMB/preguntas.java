/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameSBOMB;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yojvn
 */
public class preguntas {
    private String [] preguntas = new String [60];
    
    public String [] getpreguntas (){
        return preguntas.clone();
    }
    
    public preguntas(){
        this.preguntas = preguntas;
        preguntas [0] = "Cual es el nivel maximo  en League of Legends?";   
        preguntas [1] = "Como se llama el personaje principal de Minecraft?";
        preguntas [2] = "Nombre de los 3 personajes principales de GTA V";
        preguntas [3] = "Empresa destacada por vender juegos con Bugs";
        preguntas [4] = "Nivel maximo que pueden alcanzar los Pokemon";
        preguntas [5] = "Mario Bros tiene bigote?";
        preguntas [6] = "La saga Starcraft es de Blizzard?";
        preguntas [7] = "Existe God of War IV?";
        preguntas [8] = "Transformice es un juego de gatos?";
        preguntas [9] = "Counter Strike es un juego violento?";
        preguntas [10] = "La princesa peach tiene un vestido celeste?";
        preguntas [11] = "Kirby aplasta o succiona enemigos?";
        preguntas [12] = "Quien es mas grande (edad) Mario o Luigi?";
        preguntas [13] = "Nombre de la princesa de vestido Amarillo en MB2?";
        preguntas [14] = "Como se llama la raza alienigena Mutante en SCII?";
        preguntas [15] = "Juego de futbol con nombre de animal acuatico?";
        preguntas [16] = "Juego de Sega sobre un puercoespin azul?";
        preguntas [17] = "Nombre del hermano del fontanero de gorra roja?";
        preguntas [18] = "Como se llama el personaje principal en RE4?";
        preguntas [19] = "Tipos de juegos que desarrollan la mente?";
        preguntas [20] = "Nombre del raton que crea cosas en Transformice";
        preguntas [21] = "Como se llama el amigo amarillo de Sonic?";
        preguntas [22] = "Tipo que muere y sale del hospital sin marca alguna?";
        preguntas [23] = "Tipo que grita Hadouken?";
        preguntas [24] = "Ninja de traje amarillo con nombre de insecto?";
        preguntas [25] = "Como se llama el protagonista de Adventure Island?";
        preguntas [26] = "Primer Mega Man que permitio cargar los disparos?";
        preguntas [27] = "Como se llaman los 3 Battletoads?";
        preguntas [28] = "Quienes aparecian en la portada de  FIFA 2004?";
        preguntas [29] = "Personaje Oculto en el primer Mortal Kombat?";
        preguntas [30] = "Primer juego en presentar el idioma Simlish?";
        preguntas [31] = "Nombre del Luchador Ruso de Punch-Out?";
        preguntas [32] = "Primera consola en usar CDs?";
        preguntas [33] = "Nombre del juego de cartas de Blizzard";
        preguntas [34] = "Peramelido Antropomorfo Famoso de Sony";
        preguntas [35] = "Juego de pelea 3D de DBz ";
        preguntas [36] = "Nombre de la Bola Rosada de Nintendo";
        preguntas [37] = "Nombra los GOW de Xbox y PS";
        preguntas [38] = "Juego mas vendido de Nintendo 64";
        preguntas [39] = "Primera consola de videojuegos";
        preguntas [40] = "Publicador de las sagas de Harry Potter";
        preguntas [41] = "Hasta que entrega de Burnout va con numeros?";
        preguntas [42] = "Tiempo se tenia para completar Prince of Persia?";
        preguntas [43] = "Videojuego creado por Satoru Iwata(Nintendo)?";
        preguntas [44] = "Compañia de videojuegos donde trabajo Steve Jobs?";
        preguntas [45] = "Que es Raccoon City?";
        preguntas [46] = "la frase Wololo a que juego pertenece?";
        preguntas [47] = "Que es el lag?";
        preguntas [48] = "Que es un niño rata?";
        preguntas [49] = "version mas famosa de Final Fantasy?";
        preguntas [50] = "El jefe maestro es";
        preguntas [51] = "Cuales juegos son exclusivos de Playstation 3?";
        preguntas [52] = "Kinect nacio con cual versión de Xbox?";
        preguntas [53] = "Que es Dreamcast?";
        preguntas [54] = "En que fecha se lanzo el primer Fifa?";
        preguntas [55] = "Que marca tuvo su propio Need for Speed?";
        preguntas [56] = "Primer videojuego de Facebook?";
        preguntas [57] = "Cuantos Pokemon tenian las versiones blue y red?";
        preguntas [58] = "En que pais se inventaron el Tetris?";
        preguntas [59] = "Primera version en 3D de Grand Theft Auto?";
    }
    
    public void writePreguntas(){
        delete();
       File archivo = new File ("preguntas.txt");
       FileWriter fichero = null;
       int [] mezclado;
       mezclado = mezclar();
                
		try {
			fichero = new FileWriter(archivo,true);
                        
			for (int linea : mezclado) {
				fichero.write(linea + "\n");
			}
			fichero.close();
		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
                }
    }
    
   public static int [] readPreguntas(){
        File fichero = new File("preguntas.txt");
		Scanner s = null;
                int [] pregunt = new int [60];
                int cont = 0;

		try {
			s = new Scanner(fichero);
                        
			while (s.hasNextLine()) {
				String linea = s.nextLine();
                                pregunt[cont] = Integer.parseInt(linea);
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
        return pregunt.clone();
    }
   
   public int [] mezclar(){
      int n = 60;  //numeros aleatorios
       int k = n; //auxiliar; 
       int res;
       int [] numeros = new int[n];
       int [] resultado = new int[n];        
        Random rnd=new Random();
        
        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }       
        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);            
            resultado[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
            
        }
   
        return resultado.clone();
   }        

    public void delete() {
        File fichero = new File("preguntas.txt");
        fichero.delete();
    }
 
}
    
	
