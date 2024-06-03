/*
 * Los Arrays son estructuras de almacenamiento de datos que, a diferencia de las
 * variables tradicionales, estos almacenan multiples valores con un solo identificador
 * Podemos identificar cada uno de los elementos del array con su correspondiente 
 * sub indice(array[indice]).
 * Los Vectores son arrays unidimencionales con una logitud definida por el programador
 */
public class EjemploArraysVector1{
    public static void main(String[] args){
        
        //int[] n; //Declara el vector con el identificador N
        //n = new int[4]; //Reserva las 4 posiciones del vector
        //n[0] = 20; //Asigna los valores al vector utilizando el subindice
        //n[1] = -30;
        //n[2] = 0;
        //n[3] = 100;

        //Esta notacion llena el array con valores ya definidos,
        //No hace falta reservar las posiciones ya que se crea con
        //los elementos que le enviamos e las llaves
        //         [0] [1] [2] [3]
        int[] n = {20, -30, 0 ,100}; 
        System.out.println("Elementos del array");
        System.out.println(n[0] + " " + n[1] + " " + n[2] + " " + n[3]);
        System.out.println("La suma del primer elemento mas el ultimo");
        System.out.println(n[0] + n[3]);

    }
}