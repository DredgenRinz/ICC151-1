/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Okumura Rinzler
 */
public class GamersMethods {
    private final GameMethods game = new GameMethods();
    private final Gamers Play = new Gamers();
    
    private int players;
    
    public void setPlayers(int p){ //Setea la cantidad de jugadores
        this.players = p;
    }

    public void setPlayersGame(int p){ //Setea la cantidad de jugadores
        game.setPlayers(p);
    }
    
    public void setWindowPrepared(String G1, String G2, String G3, String G4,int p) { //Recibe los nombres de los jugadores, para cambiarlos en la siguiente ventana.
        String [] Gamers = {G1, G2, G3, G4};
        game.setWindowReady(Gamers,p);
        game.fillPlayersCollection(Gamers);
    }
    public void setVisibleGame(){
        game.setGameVisible();
    }
    
    public void LabelsCorrection(){ //Corrige las JLabels de Gamers segun el numero de jugadores
        switch (players){
            case 2:
                Play.G3_setVisible(false);
                Play.G4_setVisible(false);
                break;
            case 3:
                Play.G4_setVisible(false);
                break;            
        }
    } 
    
    public void setVisiblePlay(){ //Muestra la pantalla de juego
        Play.setVisible(true);
    }
}
