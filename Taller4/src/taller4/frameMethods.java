/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

import java.util.ArrayList;

/**
 *
 * @author Okumura Rinzler
 */
public class frameMethods {
    
    private DataManager datos = new DataManager();
    public ArrayList<Estudiantes> Alumnos = new ArrayList<>();
    
    
    
    public void leerEstudiantes(){
        Alumnos = datos.listaEstudiantes("ICC151.txt");
    }
    
    public String [] mat(){
        String [] matriculas = new String [Alumnos.size()];
    
        for(int i = 0; i < Alumnos.size(); i++){
            matriculas[i] = Alumnos.get(i).getMat();
        }
        return (matriculas);
    }
    
    
}
