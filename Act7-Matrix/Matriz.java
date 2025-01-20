package matrices;

public class Matriz {
    
    // Imprimir Matriz C
    public void imprimir(int C[][], int n, int m) {
        for (int i=0; i<n; i++) {
                for(int j=0; j<m; j++){
                    System.out.print("\t"+C[i][j]);
                } System.out.print("\n");
            }
    }
    
    // Multiplicacion de matrices
    public int[][] multiplicacion(int A[][], int B[][]) {
        int a = A.length;
        int b = B[0].length;
        int[][] C = new int[a][b];
        for (int i=0; i<a; i++) {
            for(int j=0;j<b;j++) {
                int temp = 0;
                for (int k=0; k<b; k++) {
                    temp += A[i][k] * B[k][j];
                }
                C[i][j] = temp;
            }
        }
        return C;
    }    

    // Matriz transpuesta
    public int[][] transp(int A[][], int n, int m) {
    int[][] C = new int[m][n];
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            C[j][i] = A[i][j];
        }
    }
    return C;
    }

    // Suma de la diagonal principal
    public int diagonal(int A[][], int n, int m) {
        int suma = 0;
        for (int i=0; i<n; i++) {
            for(int j=0;j<m;j++) {
                if (i == j) {
                  suma += A[i][j] ;  
                }
            }
        }
        return suma;
    }

    // Maximo de una matriz
    public int maximo(int A[][], int n, int m){
    int maximo = 0;
    for (int i=0; i<n; i++) {
        for(int j=0;j<m;j++) {
            if (A[i][j] > maximo) {
                maximo = A[i][j] ;  
            }
        }
    }
        return maximo;
    }

    // Suma de matrices
    public int[][] suma(int A[][], int B[][], int n, int m) {
    int[][] C = new int[n][m];
    for (int i=0; i<n; i++) {
        for(int j=0;j<m;j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
    return C;
    }

    // Matriz multiplicada por un escalar
    public int[][] multEscalar(int A[][], int n, int m, int escalar) {
    int[][] C = new int[n][m];
    for (int i=0; i<n; i++) {
        for (int j=0; j<m; j++) {
            C[j][i] = A[i][j] * escalar;
        }
    }
    return C;
    }
}
