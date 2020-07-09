import java.util.Scanner;

public class MostrandoDivisores {

    //Solicita un número entero no negativo, y muestra por pantalla los divisores de
    //dicho número en el caso que no sea cero. Si dicho número es cero muestra el
    //mensaje “Todos los números son divisores de cero”.

    public static void main(String[] args) {

        //Solicitar nº
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nº entero no negativo y hallaremos sus divisores.");
        int num = sc.nextInt();

        //Comprobación de que el nº introducido no es negativo.
        while(num<0){
            System.out.println("Un nº entero no negativo, por favor: ");
            num = sc.nextInt();
        }

        //Cálculo de los divisores e impresión:
        if(num == 0){
            System.out.println("Todos los números son divisores de cero.");
        }else{
            System.out.println("Los divisores del nº "+ num +" son: ");
            for(int i = 1; i<=num; i++){
                if(num%i == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
