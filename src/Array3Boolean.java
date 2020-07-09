import java.util.Random;
import java.util.Scanner;

public class Array3Boolean {
    //Haz una array de booleanos y cuenta cuantas veces ha salido false y true
    //Moneda: false = cruz, true = cara.

    public static void main(String[] args) {

        //Preguntar cuántas veces quiere tirar las monedas
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas veces quieres tirar las monedas? ");
        int tiradas = sc.nextInt();


        //Creación de la matriz de boolean:
        boolean[] moneda = new boolean[tiradas];
        for (int i = 0; i < moneda.length; i++){
            int j = new Random().nextInt(2);
            if(j == 0){
                moneda[i] = true;
            }else{
                moneda[i] = false;
            }
        }

        //Contar cuantos falses y tries hay (traducir a cara o cruz)
        int contadorCruz = 0;
        int contadorCara = 0;
        for (int i = 0; i < moneda.length; i++){
            if(moneda[i] == true){
                contadorCara++;
            }else{
                contadorCruz++;
            }
        }

        //Impresión resultado:
        System.out.println("De " + moneda.length + " tiaradas a cara o cruz han salido: \n" +
                contadorCara + " caras. " + (float)contadorCara/moneda.length*100 + " % \n" +
                contadorCruz + " cruces. " + (float)contadorCruz/moneda.length*100 + " %");

    }
}
