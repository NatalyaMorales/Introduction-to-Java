package arreys;

public class Main {
    public static void main(String[] args) {
        // 1. Declarar un arreglo de 15 enteros
        int[] enteros = new int [15];

        // 2. Declarar un arreglo que guarde 20 nombres
        String[] nombres = new String [20];
        
        // 3. Declara un arreglo de 100 objetos de la clase Estudiante.
        Circulo[] objetos = new Circulo[100];
        
        Circulo circulo = new Circulo();
        objetos[0]= circulo;

        // 4. Asigna un valor de 5 a la décima posición del arreglo enteros
        enteros[9]= 5;

        // 5. Inserta "Francisco" en la primera posción del arreglo nombres
        nombres[0]= "Francisco";

    }
}
