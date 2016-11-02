package proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Game {        
 
        private ArrayList<String> preguntas = new ArrayList<>();
	private ArrayList<String> ranking = new ArrayList<>();
        private ArrayList <Player> Players = new ArrayList<>();
        private final DataManager file = new DataManager();
        
        private int players;
        private boolean dado_lock = true;
        private int turn = -1;        

	public void preguntaAzar() {
		int azar =(int)(Math.random()*39+0);

	}
        
        public void armarPreguntas(){ //Crea la lista de preguntas y las agrega al arraylist
            preguntas = file.listaPreguntas("Preguntas.txt");
        }
        
        public void setPlayers(int p){
            this.players = p;
        }
        
        
    public void setWindowReady(String [] playName, int p){ //Prepara la ventana con la cantidad de jugadores establecida en la anterior clase
        frameGame game = new frameGame();
        System.out.print(p);
        switch(p){
            case 2:
                game.setJ1(playName[0]);
                game.setJ1Score("0");
                game.setJ2(playName[1]);
                game.setJ2Score("0");
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
        game.Mech.fillPlayersCollection(playName, players);
        game.Mech.setPlayers(p);
        game.Dado.setVisible(false);
        game.Next.setText("Entendido! Continuar!");
        game.Question.setText("Recuerden tener el Stock \nsuficiente para jugar");
        game.setVisible(true);
    }        
    
        public void fillPlayersCollection(String [] playName, int g){ //Agrega los Players a la ArrayList
            Player j1 = new Player(playName[0]);
            Player j2 = new Player(playName[1]);
            Player j3 = new Player(playName[2]);
            Player j4 = new Player(playName[3]);
            
            Players.add(j1);
            Players.add(j2);
            switch(g){
                case 3: Players.add(j3);
                    break;
                case 4: Players.add(j3);
                        Players.add(j4);
                    break;
            }            
        }
        
    protected void dado_number(JButton Dado, JTextArea Question) { //Simula el lanzamiento del dado, y muestra la accion en la ventana (ademas del numero del dado)
        if(dado_lock == false){
            int cara = (int)Math.floor(Math.random()*(1-6)+6);
            Dado.setText(Integer.toString(cara));
            Dado.setIcon(null);
            dado_lock = true;
            int pregunta = Players.get(turn).getScore() + cara;
            if(pregunta >= preguntas.size()){
                Question.setText("Usted Es un Gran DRUNK!");
            } else{
                Question.setText(preguntas.get(pregunta));
            }
        } else{
            JOptionPane.showMessageDialog(null, "ya lanzaste el dado!!!");
        }
    }

    protected void next_turn(JLabel J1, JLabel J2, JLabel J3, JLabel J4, JButton Dado, JTextArea Question) { //Avanza al siguiente turno, Resalta en rojo el nombre jugador del turno actual
        turn++;
        if(turn==players) turn = 0;
        
        Question.setText("");
        Dado.setVisible(true);
        dado_lock = false;
        
        J1.setForeground(new java.awt.Color(0, 0, 0));
        J2.setForeground(new java.awt.Color(0, 0, 0));
        J3.setForeground(new java.awt.Color(0, 0, 0));
        J4.setForeground(new java.awt.Color(0, 0, 0));
        
        switch(turn){
            case 0: J1.setForeground(new java.awt.Color(255, 0, 51));
                break;
            case 1: J2.setForeground(new java.awt.Color(255, 0, 51));
                break;
            case 2: J3.setForeground(new java.awt.Color(255, 0, 51));
                break;
            case 3: J4.setForeground(new java.awt.Color(255, 0, 51));
                break;
        }
        
    }

    protected void score_update(JLabel J1Score, JLabel J2Score, JLabel J3Score, JLabel J4Score, JButton Dado) { //Actualiza el Score del jugador actual.
    if (turn != -1){
        Players.get(turn).addScore(Integer.parseInt(Dado.getText()));
        switch(turn){
            case 0: J1Score.setText(Integer.toString(Players.get(turn).getScore()));
                break;
            case 1: J2Score.setText(Integer.toString(Players.get(turn).getScore()));
                break;
            case 2: J3Score.setText(Integer.toString(Players.get(turn).getScore()));
                break;
            case 3: J4Score.setText(Integer.toString(Players.get(turn).getScore()));
                break;
        }
        }
    }
    
    protected boolean ScoreCheck(){ //Checkea el Score del Jugador actual, si supera el limite establecido, muestra la pantalla final.
        if(turn != -1){
            if((Players.get(turn).getScore()) > 10 ){
                frameWinner endFrame = new frameWinner();
                endFrame.setWiner(Players.get(turn).getPlayerName());
                endFrame.setVisible(true);
                return false;
            }
        }
        return true;
    }

    protected void checkStateAndGoNext(JLabel J1, JLabel J2, JLabel J3, JLabel J4, JLabel J1Score, JLabel J2Score, JLabel J3Score, JLabel J4Score, JButton Dado, JButton Next, JTextArea Question) { //Checkea es estado de la partida, si el dado no fue lanzado no avanzara.
    if(dado_lock == false){
        JOptionPane.showMessageDialog(null,"Lanza el dado Primero!!!");
    } else{
        Dado.setText("");
        next_turn( J1,  J2,  J3,  J4, Dado, Question);
    }
    }    
        
	

}