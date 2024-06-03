public class EjemploArraysVector5 {
    public static void main(String[] args){
        double[] nota = new double[4];
        System.out.println("Ingrese las notas de los alumnos");
        //Cargamos el array con 4 notas
        for(int i = 0; i < nota.length; i++){
            System.out.println("Nota " + (i + 1) + ": ");
            nota[i] = Double.parseDouble(System.console().readLine());
        }
        double acumulador = 0;
        //Mostramos cada una de las posiciones del array
        //Y al mismo tiempo acumulamos sus valores
        for(int i = 0; i < nota.length; i++){
            System.out.println("Nota " + (i + 1) + ": " + nota[i]);
            //El operador += acumula el valor de la variable de la izquierda con
            //el valor de la variable a la derecha
            //Es lo mismo que hacer acumulador = acumulador + nota[i]
            acumulador += nota[i];
        }
        System.out.println("El prmoedio es: " + (acumulador / 4));
    }
}
