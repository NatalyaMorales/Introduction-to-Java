package actividad9;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class MainFibonacchi {
    public static void main(String[] args) throws IOException {
        List<Integer> listaFibonacci = new ArrayList<Integer>();
        List<Integer> listaPares = new ArrayList<Integer>();
        List<Integer> listaImpares = new ArrayList<Integer>();

        listaFibonacci = Fibonacci.generador();
        System.out.println("La lista de Fibonacci es:");
        System.out.println(listaFibonacci);
        
        listaPares = Splitter.splitPares(listaFibonacci);
        System.out.println("\nLa lista de Fibonacci pares es:");
        System.out.println(listaPares);

        listaImpares = Splitter.splitImpares(listaFibonacci);
        System.out.println("\nLa lista de Fibonacci impares es:");
        System.out.println(listaImpares);
        
        Manager.ejecutar();
        System.out.println("\nSe han guardado las listas en sus archivos...");
    }
}
