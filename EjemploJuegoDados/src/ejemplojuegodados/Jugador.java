/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojuegodados;

/**
 *
 * @author Okumura Rinzler
 */
public class Jugador {
    Dado d1 = new Dado();
    Dado d2 = new Dado();
    int wins = 0;
    
    public int RolarDados(){
        d1.rodar();
        d2.rodar();
        return (d1.Getlado()+d2.Getlado());
    }
    
    public int getwins(){
        return this.wins;
    }
    
    public void addWin(){
        this.wins++;
    }
}
