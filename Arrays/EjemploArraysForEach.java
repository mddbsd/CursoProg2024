public class EjemploArraysForEach {
    public static void main(String[] args){
        double[] nota = new double[4];
        System.out.println("Ingrese las notas de los alumnos");
        for(int i = 0; i < nota.length; i++){
            System.out.println("Nota " + (i + 1) + ": ");
            nota[i] = Double.parseDouble(System.console().readLine());
        }
        double acumulador = 0;
        //La estructura for each trabaja como el ciclo for, pero sin un contador
        //Cada elemento del array, se va guardando en la variable temporal n
        //y luego se trabaja con dicha variable temporal
        //for(variable temporal : array)
        //El array se recorre desde la primera posicion del array hasta la ultima 
        for(double n : nota){
            System.out.println(n);
            acumulador += n;
        }
        System.out.println("El prmoedio es: " + (acumulador / 4));
    }
}
