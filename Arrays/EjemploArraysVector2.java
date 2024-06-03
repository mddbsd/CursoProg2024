public class EjemploArraysVector2 {
    public static void main(String[] args){
        int[] x = new int[5];
        x[0] = 8;
        x[1] = 33;
        x[2] = 200;
        x[3] = 150;
        x[4] = 11;
        System.out.println("Ingrese un indice (0 - 4)");
        //Solicitamos al usuario que ingrese el indice del vector
        int indice = Integer.parseInt(System.console().readLine());
        System.out.println("El elemento en la posicion " + indice);
        //Mostramos la posicion definida por la variable indice que cargo el usuario
        System.out.println("es: " + x[indice]);

    }
}
