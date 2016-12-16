package ICC202;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TablaPeriodica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double peso[] = new double[121];
        String nombre[] = new String[121];
        String simbolo[] = new String[121];
        int opcion;
        do {
            System.out.println("1.- Llenar");
            System.out.println("2.- Listar");
            System.out.println("3.- Mostrar por nombre");
            System.out.println("4.- Mostrar por simbolo");
            System.out.println("5.- Salir");
            System.out.println("");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad: ");
                    int cantidad = leer.nextInt();
                    int n_atomico;
                    String nomb,
                     simb;
                    double pes;
                    for (int i = 1; i <= cantidad; i++) {
                        System.out.println("Elemento " + i + ":");
                        do {
                            System.out.print("Ingrese numero atomico: ");
                            n_atomico = leer.nextInt();
                        } while (n_atomico < 1 || n_atomico > 120);

                        System.out.print("Nombre: ");
                        nomb = leer.next();

                        do {
                            System.out.print("Simbolo ");
                            simb = leer.next();
                        } while ((simb.length() > 2 || simb.length() < 1)
                                || (simb.charAt(0) < 65 || simb.charAt(0) > 90)
                                || (simb.length() == 2 && (simb.charAt(1) < 97 || simb.charAt(1) > 122)));
                        do {
                            System.out.print("Ingrese peso atomico: ");
                            pes = leer.nextDouble();
                        } while (pes <= 0);
                        nombre[n_atomico] = nomb;
                        peso[n_atomico] = pes;
                        simbolo[n_atomico] = simb;
                    }
                    break;
                case 2:
                    System.out.println("N_at\tNombre\tSimb\tPeso");
                    for (int i = 1; i < 121; i++) {
                        if (nombre[i] != null) {
                            System.out.println(i + "\t" + nombre[i] + "\t" + simbolo[i] + "\t" + peso[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese nombre: ");
                    nomb = leer.next();
                    for (int i = 1; i < 121; i++) {
                        if (nombre[i] != null) {
                            if (nombre[i].equals(nomb)) {
                                System.out.println("Numero = " + i);
                                System.out.println("Simbolo = " + simbolo[i]);
                                System.out.println("Peso = " + peso[i]);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.print("Ingrese simbolo: ");
                    simb = leer.next();
                    for (int i = 1; i < 121; i++) {
                        if (simbolo[i] != null) {
                            if (simbolo[i].equals(simb)) {
                                System.out.println("Numero = " + i);
                                System.out.println("Nombre = " + nombre[i]);
                                System.out.println("Peso = " + peso[i]);
                            }
                        }
                    }
                    break;
            }

        } while (opcion != 5);
        guardartabla(peso,nombre,simbolo);
    }
    
    public static void guardartabla(double [] peso, String [] nombre, String [] simbolo){
        File archivo = new File ("tabla.txt");
        FileWriter fichero = null;
        	
		try {
			fichero = new FileWriter(archivo,true);
			for (int i=0;i<121;i++) {
                            if(simbolo[i]!=null){
				fichero.write(simbolo[i]+"\n" +nombre[i]+"\n"+peso[i]+"\n \n");
                            }
			}
			fichero.close();
		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
    }
}
