/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Okumura Rinzler
 */
public class MainWindowMethods {
    
    private final DataManager data = new DataManager();
    
    public int buton_Action(){ //Cuando se Presiona Comenzar, este metodo indica con cuantos jugadores se iniciara la partida
        String [] options = {"2","3","4"};
        int n = JOptionPane.showOptionDialog(null,
		"Cuantos jugadores son?",
		"Una Simple Pregunta",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,     //don't use a custom Icon
		options,  //the titles of buttons
		options[0]) + 2;
        return (n);
    } 
    
    public void rules(){ //Al presionar el boton Reglas, Aparecera un mensaje con lo aqui escrito
        JOptionPane.showMessageDialog(null, "Reglas: \n");
    }
    
    public void WinSwitch(int g){ //Indica a la siguiente ventana Cuantos jugadores son, y Escuende las labelsque no se ocuparan
        Gamers game = new Gamers();
        game.setPlayers(g);
        game.LabelsCorrection();
        game.setVisible(true);
        
    }
    
    public void rankDrunks(){
        String drunks = "";
        drunks = data.leerFichero("Ranking.txt");
        JOptionPane.showMessageDialog(null, "Los Mejores Borrachos hasta elmomento: \n" +drunks);
    }
    
    
}
