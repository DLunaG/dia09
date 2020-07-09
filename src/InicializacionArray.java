import java.util.Random;

public class InicializacionArray {

    //Inicializar un array de valores int de tamaño 500 con números aleatorios
    public static void main(String[] args) {

        //Creación de array
        int miArray[] = new int[50];

        //Introducción de valores a cada elementos de la array
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = new Random().nextInt(101);
        }
        //Impresión
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
        }

        //Extra porqué sí
        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] > 50) {
                cont1++;
            } else {
                cont2++;
            }
        }
        System.out.println("Se han generado " + cont1 + " números mayores que 50 y " + cont2 + " números menores que 50.");


        //+Vamos a crear otra array igual, con nº aleatorios y vamos a comparar las sumas de cada array

        int[] miArray2 = new int[50];
        int suma1 = 0;
        int suma2 = 0;

        //Creación de la segunda array y sumatorio de la misma.
        for (int i = 0; i < miArray2.length; i++) {
            miArray2[i] = new Random().nextInt(101);
            suma2 += miArray2[i];
        }
        //Sumatorio de la primera array ya creada.
        for (int i = 0; i < miArray.length; i++){
            suma1 += miArray[i];
        }
        //Impresión del resultado.
        System.out.println("La suma de la primera matriz es: " + suma1 + "\n" +
                "La suma de la segunda matriz es: " + suma2);

        //+Ahora la suma de los mismos índices de cada array

        for(int i = 0; i < miArray.length; i++){
            int total = miArray[i] + miArray2[i];
            System.out.println(miArray[i] + " + " + miArray2[i] + " = " + total);
        }
    }

}
