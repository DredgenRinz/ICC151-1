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
    private final Game game = new Game();
    
    public void setPlayersGame(int p){ //Setea la cantidad de jugadores
        game.setPlayers(p);
    }
    
    public void setWindowPrepared(String G1, String G2, String G3, String G4,int p) { //Recibe los nombres de los jugadores, para cambiarlos en la siguiente ventana.
        String [] Gamers = {G1, G2, G3, G4};
        setWindowReady(Gamers,p);
        game.fillPlayersCollection(Gamers);
     }
    
    public void setWindowReady(String [] playName, int p){ //Prepara la ventana con la cantidad de jugadores establecida en la anterior clase
        switch(p){
            case 2:
                game.J1.setText(playName[0]);
                game.J1Score.setText("0");
                game.J2.setText(playName[1]);
                game.J2Score.setText("0");
                game.J3.setVisible(false);
                game.J3Score.setVisible(false);
                game.J4.setVisible(false);
                game.J4Score.setVisible(false);
                break;
            case 3:
                game.J1.setText(playName[0]);
                game.J1Score.setText("0");
                game.J2.setText(playName[1]);
                game.J2Score.setText("0");
                game.J3.setText(playName[2]);
                game.J3Score.setText("0");
                game.J4.setVisible(false);
                game.J4Score.setVisible(false);
                break;
            case 4:
                game.J1.setText(playName[0]);
                game.J1Score.setText("0");
                game.J2.setText(playName[1]);
                game.J2Score.setText("0");
                game.J3.setText(playName[2]);
                game.J3Score.setText("0");
                game.J4.setText(playName[3]);
                game.J4Score.setText("0");
                break;
        }
        game.Dado.setVisible(false);
        game.Next.setText("Entendido! Continuar!");
        game.Question.setText("Recuerden tener el Stock \nsuficiente para jugar");
    }    
    
    public void setVisibleGame(){ //Muestra la pantalla de juego
        game.setVisible(true);
    }
}
