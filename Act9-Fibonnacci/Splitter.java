package actividad9;
import java.util.List;
import java.util.ArrayList;

public class Splitter {
    
    public static List<Integer> splitPares(List<Integer> listaFibonacci) {
        List<Integer> listaPares = new ArrayList<>();
        for (int i=0; i<listaFibonacci.size(); i++){
            int a = listaFibonacci.get(i);
            int j = a % 2;
            if (j==0) {
                listaPares.add(listaFibonacci.get(i));
            } else {
                continue;
            }
        }
        return listaPares;
    }

    public static List<Integer> splitImpares(List<Integer> listaFibonacci) {
        List<Integer> listaImpares = new ArrayList<>();
        for (int i=0; i<listaFibonacci.size(); i++){
            int a = listaFibonacci.get(i);
            int j = a % 2;
            if (j==0) {
                continue;
            } else {
                listaImpares.add(listaFibonacci.get(i));
            }
        }
        return listaImpares;
    }

}
