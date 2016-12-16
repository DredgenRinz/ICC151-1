/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojuegodados;

import javax.swing.JOptionPane;

/**
 *
 * @author Okumura Rinzler
 */
public class TestVersus {
    
    static JuegoVersus Game = new JuegoVersus();
    
    public static void main(String[] args) {
        
        boolean exit = false;
        
        while (exit != true){
            
            Game.SetGameMode(matchIn());
            Game.SetMatches();
            Game.match();
            winner();
            exit = salir();
            }
        } 
    
    private static int matchIn(){
        String [] options = {"1","3","5"};
        String [] optionsS = {"Bo1","Bo3","Bo5"};
        
        int m = JOptionPane.showOptionDialog(null,
		"De Cuantos Matchs sera el juego? \n Bo = Best Of x Matches",
		"Una Simple Pregunta",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,     //don't use a custom Icon
		optionsS,  //the titles of buttons
		options[0]); //the title of the default button
        System.out.println(m);
        return m;
    }
    
    private static void winner(){
        int j1 = Game.j1.getwins();
        int j2 = Game.j2.getwins();
        
        if(j1 > j2){
            JOptionPane.showMessageDialog(null,"Jugador 1 gana el Juego ");
        } else if (j2 > j1){
            JOptionPane.showMessageDialog(null,"Jugador 2 gana el Juego ");
        } else {
            JOptionPane.showMessageDialog(null,"Los Jugadores Empatan el Juego");
        }
    }
    
    
    private static boolean salir(){
        String [] salir = {"0","1"};
        String [] salir1 = {"no","si"};
        int s = JOptionPane.showOptionDialog(null,
		"Desean Salir del Juego?",
		"Una Simple Pregunta",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,     //don't use a custom Icon
		salir1,  //the titles of buttons
		salir[0]); //the title of the default button
        System.out.println(s);
        if(s == 1){
            return true;
        } else{
            return false;
        }
    }
}
