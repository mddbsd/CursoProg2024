import java.util.Scanner;
/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso
 */
public class EjercicioArrays3 {
    public static void main(String[] args){
        int[] numeros = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.println("Numero " + i + ": ");
            numeros[i] = s.nextInt();
        }
        System.out.println("Numeros inversos");
        for (int i = 9; i >= 0; i--){
            System.out.println(numeros[i]);
        }

    }
}
