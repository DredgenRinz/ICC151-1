package proyecto;

import java.util.ArrayList;

public class GameMethods {        
 
        protected ArrayList<String> preguntas = new ArrayList<String>();
	protected ArrayList<String> ranking = new ArrayList<String>();
        protected final ArrayList <Player> Players = new ArrayList<>();
        private Game Play = new Game();
        private DataManager file = new DataManager();
        
        private int players;

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
        switch(p){
            case 2:
                Play.J1.setText(playName[0]);
                Play.J1Score.setText("0");
                Play.J2.setText(playName[1]);
                Play.J2Score.setText("0");
                Play.J3.setVisible(false);
                Play.J3Score.setVisible(false);
                Play.J4.setVisible(false);
                Play.J4Score.setVisible(false);
                break;
            case 3:
                Play.J1.setText(playName[0]);
                Play.J1Score.setText("0");
                Play.J2.setText(playName[1]); 
                Play.J2Score.setText("0");
                Play.J3.setText(playName[2]);
                Play.J3Score.setText("0");
                Play.J4.setVisible(false);
                Play.J4Score.setVisible(false);
                break;
            case 4:
                Play.J1.setText(playName[0]);
                Play.J1Score.setText("0");
                Play.J2.setText(playName[1]);
                Play.J2Score.setText("0");
                Play.J3.setText(playName[2]);
                Play.J3Score.setText("0");
                Play.J4.setText(playName[3]);
                Play.J4Score.setText("0");
                break;
        }
        Play.Dado.setVisible(false);
        Play.Next.setText("Entendido! Continuar!");
        Play.Question.setText("Recuerden tener el Stock \nsuficiente para jugar");
    }        
    
        public void fillPlayersCollection(String [] playName){ //Agrega los Players a la ArrayList
            Player j1 = new Player(playName[0]);
            Player j2 = new Player(playName[1]);
            Player j3 = new Player(playName[2]);
            Player j4 = new Player(playName[3]);
            
            Players.add(j1);
            Players.add(j2);
            switch(players){
                case 3: Players.add(j3);
                    break;
                case 4: Players.add(j3);
                        Players.add(j4);
                    break;
            }            
        }
    void setGameVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
	

}