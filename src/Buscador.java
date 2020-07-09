import java.util.Random;
import java.util.Scanner;

public class Buscador {

    public static void main(String[] args) {
        //+Dado un array de valores enteros aleatorios, buscar el entero que introduzca el usuario o -1 si no existe

        //Creación de la array
        int[] miArray = new int[100];

        //Asignación aleatoria de valores
        for(int i = 0; i < miArray.length; i++){
            miArray[i] = new Random().nextInt(101);
        }

        //Preguntar que nº quiere buscar. Hacer el programa de tal forma que se pueda ejecutar todas las veces que quieras
        //hasta que se introduzca -1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Matriz creada.");
        int numABuscar = 0;

        //Bucle que ejecuta el programa (buscador de la posición de un nº dado)
        while(numABuscar >= 0 && numABuscar <= 100) {
            System.out.println("¿Qué número quieres buscar? (del 0 al 100). Introduce -1 si quieres terminar el programa.");
            numABuscar = sc.nextInt();

            //Comprobación de que es un nº válido
            while (numABuscar < -1 || numABuscar > 100) {
                System.out.println("Número inválido. Introduce un nº del 0 al 100 o -1 si quieres finalizar el programa.");
                numABuscar = sc.nextInt();
            }
            //Comprobación de si se ha introducido el -1, para salir del bucle del programa
            if(numABuscar == -1){
                break;
            }

            //Conteo de veces que sale el nº introducido en la matriz
            int cantidad = 0;
            for (int i = 0; i < miArray.length; i++) {
                if (miArray[i] == numABuscar) {
                    cantidad++;
                }
            }

            //Impresión del resultado
            if (cantidad == 0) {
                System.out.println("El nº " + numABuscar + " no se ha generado en la matriz.");
            } else if (cantidad == 1) {
                System.out.println("El número " + numABuscar + " ha salido " + cantidad + " vez.");
            } else {
                System.out.println("El número " + numABuscar + " ha salido " + cantidad + " veces.");
            }

            //¿En qué posiciones de la matriz ha salido ese valor?
            if (cantidad == 1) {
                System.out.println("Aparece en la posición: ");
                for (int i = 0; i < miArray.length; i++) {
                    if (miArray[i] == numABuscar) {
                        System.out.println(i);
                    }
                }
            }else if(cantidad > 1){
                System.out.println("Aparece en las posiciones: ");
                for (int i = 0; i < miArray.length; i++) {
                    if (miArray[i] == numABuscar) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Hasta pronto!");
    }
}
