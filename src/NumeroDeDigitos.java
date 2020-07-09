import java.util.Scanner;

public class NumeroDeDigitos {

    //Solicita un nº entero no negativo y muestra por pantalla la cantidad de cifras que tiene.
    //mete un while que no deje meter más de 4 cifras.

    public static void main(String[] args) {

        //Se pide un nº
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº entero no negativo de hasta 4 cifras y te diré cuantas cifras tiene: ");
        int num = sc.nextInt();

        //Comprobación de si se ha introducido un nº entero de 1 a 4 cifras.
        while(num < 0 || num > 9999){
            System.out.println("Número inválido.\n" +
                    "Por favor, introduce un nº entero no negativo de hasta 4 cifras: ");
            num = sc.nextInt();
        }

        //Cálculo de nº de cifras.
        if(num>999){
            System.out.println("El nº introducido contiene 4 cifras.");
        }else if(num>99){
            System.out.println("El nº introducido contiene 3 cifras.");
        }else if(num>9){
            System.out.println("El nº introducido contiene 2 cifras.");
        }else{
            System.out.println("El nº introducido es de una sola cifra.");
        }


    }
}
