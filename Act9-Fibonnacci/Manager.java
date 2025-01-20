package actividad9;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {

        public static void ejecutar() throws IOException {
            List<Integer> listaFibonacci = Fibonacci.generador();
            List<Integer> listaPares = Splitter.splitPares(listaFibonacci);
            List<Integer> listaImpares = Splitter.splitImpares(listaFibonacci);

            //archivo fibonacci
            FileWriter file1 = new FileWriter("D:/Amigu/Universidad/Fibonacci/fibonacci.txt");
            for (Integer i : listaFibonacci) {
                file1.write(i + ", ");
            }
            file1.close();

            //archivo pares
            FileWriter file2 = new FileWriter("D:/Amigu/Universidad/Fibonacci/pares.txt");
            for (Integer i : listaPares) {
                file2.write(i + ", ");
            }
            file2.close();

            //archivo impares
            FileWriter file3 = new FileWriter("D:/Amigu/Universidad/Fibonacci/impares.txt");
            for (Integer i : listaImpares) {
                file3.write(i + ", ");
            }
            file3.close();
            
            }
        }
        
