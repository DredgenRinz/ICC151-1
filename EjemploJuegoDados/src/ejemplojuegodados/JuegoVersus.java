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
public class JuegoVersus {
    
    Jugador j1 = new Jugador();
    Jugador j2 = new Jugador();
    
    private int modoJuego = 0;
    private int matches = 0;
    private int MatchControl = 0;
    
    public void SetGameMode(int GM){
        this.modoJuego = GM;
        MatchControl = 0;
    }
    
    public void SetMatches(){
        switch(modoJuego){
            case 0: this.matches = 1;
                break;
            case 1: this.matches = 3;
                break;
            case 2: this.matches = 5;
                break;
        }
    }
    
    public void match(){
        
        while(MatchControl < matches){
            int j1_pts = j1.RolarDados();
            JOptionPane.showMessageDialog(null,"Jugador 1 Tiro el dado y saco "+ j1_pts);
            int j2_pts = j2.RolarDados();
            JOptionPane.showMessageDialog(null,"Jugador 2 Tiro el Dado y saco "+j2_pts);
            
            if(j1_pts == 7 && j2_pts!=7){
                j1.addWin();
                JOptionPane.showMessageDialog(null,"Jugador 1 gana el Match");
            } else if (j2_pts == 7 && j1_pts != 7){
                j2.addWin();
                JOptionPane.showMessageDialog(null,"Jugador 2 gana el Match ");
            } else{
                JOptionPane.showMessageDialog(null,"Ningun Jugador a Ganado el Match");
            }
            MatchControl++;
        }
    }
}
