import java.util.Random;

public class Array2 {

    public static void main(String[] args) {
        //Crea una array y suma todos sus elementos y saca la media.

        //Creación de variables
        int[] matriz = new int[10];
        int suma = 0;
        float media;

        //Asignación de valores a la matriz y sumatorio
        for(int i = 0; i < matriz.length; i++){
            matriz[i] = new Random().nextInt(101);
            suma += matriz[i];
        }
        System.out.println("La suma de los " + matriz.length + " números creados aleatoriamente es: " + suma);

        //Cálculo de la media.
        media = (float) suma/matriz.length;
        System.out.println("La media da: " + media);

    }
}
