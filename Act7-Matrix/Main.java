package matrices;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("\nPrograma que realiza operaciones entre dos matrices\n");
        int[][] A = {{1,2}, {5,4}};
        int[][] B = {{7,9}, {5,2}};
        Matriz matriz = new Matriz();

        int n = A.length;
        int m = A[0].length;
        
        // Imprimir las matrices declaradas
        System.out.println("\nMatriz A:");
        matriz.imprimir(A, n, m);
        System.out.println("\nMatriz B:");
        matriz.imprimir(B, n, m);

        // 1. Multiplicacion
        if (A[0].length == B.length) {
            System.out.println("\nLa multiplicacion de las matrices es: ");
            int[][] C1 = matriz.multiplicacion(A, B);
            matriz.imprimir(C1, n, m);
        } else {
            System.out.println("\nNo se puede realizar la multiplicacion  entre las matrices");
        }

        // 2. Transposicion
        System.out.println("\nLa matriz A transpuesta es: ");
        int[][] C2 = matriz.transp(A, n, m);
        matriz.imprimir(C2, n, m);

        // 3. Diagonal
        int suma = matriz.diagonal(A, n, m);
        System.out.println("\nLa diagonal de la matriz A es: "+suma);

        // 4. Maximo
        int maximo = matriz.maximo(A, n, m);
        System.out.println("\nEl maximo de la matriz A es: "+maximo);   

        // 5. Suma
        if (A.length == B.length && A[0].length == B[0].length) {
            System.out.println("\nLa suma de las matrices es: ");
            int[][] C5 = matriz.suma(A, B, n, m);
            matriz.imprimir(C5, n, m);
        } else {
            System.out.println("\nNo se puede realizar la suma  entre las matrices");
        }

        // 6. Multiplicacion (Escalar)
        int escalar = 2;
        System.out.println("\nLa matriz A multiplicada por " + escalar);
        int[][] C6 = matriz.multEscalar(A, n, m, escalar);
        matriz.imprimir(C6, n, m);
    }
}
