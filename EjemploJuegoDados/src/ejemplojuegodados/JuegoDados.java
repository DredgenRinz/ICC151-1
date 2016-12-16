package ejemplojuegodados;

/**
 *
 * @author yojvn
 */
public class JuegoDados {
    Dado d1 = new Dado();
    Dado d2 = new Dado();
    
    public int jugar(){
    int puntos = (d1.rodar() + d2.rodar());
    return puntos;
    }
}




