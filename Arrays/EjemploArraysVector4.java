public class EjemploArraysVector4 {
    public static void main(String[] args){
        char[] caracter = new char[6];
        caracter[0] = 'R';
        caracter[1] = '%';
        caracter[2] = '&';
        caracter[3] = '+';
        caracter[4] = 'A';
        caracter[5] = '2';
        System.out.println("longitud del array: " + caracter.length);
        System.out.println("Elementos del array");
        for (int i = 0; i < caracter.length; i++){
            System.out.println(caracter[i]);
        }
    }
}
