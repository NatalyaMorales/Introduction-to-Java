package actividad9;
import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
    
    public static List<Integer> generador(){
        List<Integer> listaFibonacci = new ArrayList<>();
        listaFibonacci.add(0);
        listaFibonacci.add(1);
        int a=0, b=0, i=0, x=0;
        while (x<1000000) {
            a = listaFibonacci.get(i);
            b = listaFibonacci.get(i+1);
            x = a + b;
            listaFibonacci.add(x);
            i++;
        }
        return listaFibonacci;
    }
    
}
