package taller4;

import java.io.*;
import java.util.ArrayList;



public class DataManager {
	
	//lee los archivos de los jugadores y las preguntas	
	
	 public void crear(String nombre, String texto){
	        
	        File f = new File(nombre);
	        try{
	        FileWriter w = new FileWriter(f);
	        BufferedWriter bw = new BufferedWriter(w);
	        PrintWriter wr = new PrintWriter(bw);	
	        wr.write(texto);
	        bw.newLine();
	       
	        wr.close();
	        bw.close();
	        }catch(IOException e){};
	        
	 }
	 
	 public void agregar(String archivo, String texto){
		    
		    String aux =leerFichero(archivo);
		    String cadenaIntroduciada = aux +"\n"+texto;
		    crear(archivo, cadenaIntroduciada);
		}
	 
	 public String [] arrayEstudiantes(String tipoFichero){
	     String ficheroCompleto = leerFichero(tipoFichero);
	        String[] arrayFichero = ficheroCompleto.split("#");
	        return(arrayFichero);
	}
         
	 public int largo(String tipoFichero){
	     String ficheroCompleto = leerFichero(tipoFichero);
	        String[] arrayFichero = ficheroCompleto.split(",");
	        return(arrayFichero.length/4);
	}	
	
	public ArrayList<Estudiantes> listaEstudiantes(String listaPreguntas){
		//Las preguntas estan separadas por "#" aqui se separa la cadena completa en un ArrayList
		
	     String ficheroPreguntas = leerFichero(listaPreguntas);
	        String [] arrayFichero = ficheroPreguntas.split(",");
	        ArrayList<Estudiantes> Alumnos = new ArrayList<>();
	        System.out.println(arrayFichero.length);
	        for (int i = 0; i < arrayFichero.length; i++) {
                    for(int j = 0; j < 3; j++){
                      Estudiantes temp = new Estudiantes();
                        temp.setMat(arrayFichero[i]);
                        temp.setRut(arrayFichero[i]);
                        temp.setName(arrayFichero[i+1]);
                        temp.setName2(arrayFichero[i+2]);
                        temp.setMail(arrayFichero[i+3]);
                        
                        i+=3;
                        j = 4;
                        
                        Alumnos.add(temp);  
                    }  
		}
	       
	       
	        return (Alumnos);
	}
	
	
	public String leerFichero(String nombre){
		// lee un archivo y devuelve la cadena completa
		
		try{
		    File f;
		    FileReader lectorArchivo;
		    f = new File(nombre);
		    lectorArchivo = new FileReader(f);
		    BufferedReader br = new BufferedReader(lectorArchivo);
		    String l = "";
		    String aux = "";
		    while(true){
		        aux = br.readLine();
		        if(aux != null)
		            l += aux +",";
		        else
		            break;
		    }
		    br.close();
		    lectorArchivo.close();
		   
		    return l;
		}catch(IOException e){
		System.out.println("Error:" + e.getMessage());
		}
		return null;
		}
	
}
