package ejemplocalculadora;
import java.util.*;
/**
 *
 * @author yojvn
 */
public class EjemploCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        Calculadora calc = new Calculadora();
        int opcion = 0;
        boolean salir = false;

        while (salir == false) {

            calc.menu();
            do {
                try {
                    System.out.println("Número opcion: ");
                    opcion = sc.nextInt();

                    salir = false;
                } catch (InputMismatchException exc) {
                    sc.nextLine();
                    System.out.println("Debe introducir solo numeros. \n Intente nuevamente\n");
                    salir = true;
                }
            } while (salir);
            if (opcion != 7) {
                num1 = calc.leer();
                num2 = calc.leer();
            }
            switch (opcion) {

                case 1:
                    calc.mostrar(Integer.toString(calc.suma(num1, num2)));
                    break;
                case 2:
                    calc.mostrar(Integer.toString(calc.rest(num1, num2)));
                    break;
                case 4: if(num2 != 0){
                            calc.mostrar(Double.toString(calc.div(num1, num2)));
                        } else {
                            System.out.println("El Dividendo no puede ser cero!!!");
                        }
                    break;
                case 3:
                    calc.mostrar(Integer.toString(calc.mult(num1, num2)));
                    break;
                case 5:
                    calc.mostrar(Integer.toString(calc.may(num1, num2)));
                    break;
                case 6:
                    calc.mostrar(Long.toString(calc.pot(num1, num2)));
                    break;
                case 7:
                    salir = calc.salir(salir);
                    break;
                default:
                    System.out.println("Opciín no valida, Reingrese");
            }
        }
        
        
    }
    
}
