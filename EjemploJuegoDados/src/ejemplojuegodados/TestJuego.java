/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojuegodados;

/**
 *
 * @author yojvn
 */
public class TestJuego {

    public static void main(String[] args) {
        
        JuegoDados juegoTest = new JuegoDados();
        
        int score = juegoTest.jugar();
        
        if(score == 7){
            System.out.println("Muy bien Ganaste, tus dados dieron " + score);
        } else {
            System.out.println("Perdiste, Intenta nuevamente tus dados dieron " + score);
        }
    }
    
}
