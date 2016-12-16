package ejemplojuegodados;

/**
 *
 * @author yojvn
 */
public class Dado {
    private static int side;
    public Dado(){
        side = 1;
    }
    
    public static int rodar(){
        int lado = (int)Math.floor(Math.random()*(1-6)+6);
        side = lado;
        return lado;
    }
    
    public int Getlado(){
    return this.side;
    }
}
