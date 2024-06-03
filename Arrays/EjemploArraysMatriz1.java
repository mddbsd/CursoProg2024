/*
 * Las matrices son arrays bidimencionales
 * Podemos visualizarlas como un conjunto de vectores
 * para ello necesitamos 2 indices, uno que controle las filas y otro 
 * que controle las columnas
 * array[filas][columnas]
 */
public class EjemploArraysMatriz1 {
    public static void main(String[] args){
        int[][] n = new int[3][2];
        n[0][0] = 20;
        n[1][0] = 67;
        n[1][1] = 33;
        n[2][1] = 7;
        int fila, columna;
        //Utilizamos un bucle anidado para controlar
        //filas y columnas
        for(fila = 0; fila < 3; fila ++){
            System.out.print("fila: " + fila);
            for(columna = 0; columna < 2; columna++){
                System.out.printf("%10d", n[fila][columna]);
            }
            System.out.println("");
        }
    }
}
