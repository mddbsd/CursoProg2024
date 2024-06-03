import java.util.Scanner;
public class EjemploArraysVector6GeneradorBanderas {
    public static void main(String[] args){
        int franjas;
        Scanner s = new Scanner(System.in);
        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};
        System.out.println("Ingrese cantidad de franjas");
        franjas = s.nextInt();

        System.out.println("----------------------");
        for (int i = 0; i < franjas; i++){
            //Con la funcion Math.random() generamos un numero
            //entre 0 y 5.99999. Como es un valor con decimales
            //lo convertimos a entero mediante el casting
            System.out.println(color[(int)(Math.random() * 6)]);
            System.out.println("----------------------");
        }
        
    
    
    
    }
}
