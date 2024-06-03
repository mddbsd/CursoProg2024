public class EjemploArraysMatriz2 {
    public static void main(String[] args){
        //Esta notacion es para cargar la matriz de manera directa
        //Prestar atencion a cada una de las llaves, estan representada como
        //3 vectores diferentes
        //{{valores vector1},{valores vector2},{valores vector3}} 
        int[][] n = {{20,4},{67,33},{0,7}};

        int fila, columna;
        for(fila = 0; fila < 3; fila ++){
            System.out.print("fila: " + fila);
            for(columna = 0; columna < 2; columna++){
                System.out.printf("%10d", n[fila][columna]);
            }
            System.out.println("");
        }
    }
}
