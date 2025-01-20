package arreys;

public class Arreglos {
    
    // 6. Escribe un metodo para mostrar los contenidos de un arreglo
        public void imprimirArreglos(int enteros[], String nombres[]) {
        int i;
        System.out.println("Arreglo de enteros: ");
        for(i=0;i<enteros.length;i++) {
            System.out.println("Entero "+i);
            System.out.println(enteros[i]);
        }
                System.out.println("Arreglo de nombres: ");
        for(i=0;i<nombres.length;i++) {
            System.out.println("Nombre "+i);
            System.out.println(nombres[i]);
        }
    } 
    
    // 7. Escribe un metodo para buscar un valor en el arreglo
        public int buscarElementosEnteros(int enteros[], int valor) {
            int i;
            int elemento=0;
            for(i=0;i<enteros.length;i++){
                if(enteros[i]==valor) {
                i = elemento;
                }  else {
                    continue;
                }
            }
            return elemento;    
        } 
        public int buscarElementosNombres(String nombres[], String nombre) {
            int i;
            int elemento=0;
            for(i=0;i<nombres.length;i++){
                if(nombres[i]==nombre) {
                i = elemento;
                }  else {
                    continue;
                }
            } 
            return elemento;   
        }
        
    // 8. Escribe un metodo para eliminar un valor en un arreglo    
        public int[] eliminarValorEnteros (int enteros[], int valor){
            int posicion;
            posicion = buscarElementosEntero(enteros, valor);
            if (posicion == -1) {
                return enteros;
            }
            for(int i = posicion; i< enteros.length -1; i++) {
                enteros[i] = enteros[i+1];
            }
            enteros[enteros.length -1 ]=0;
            for(int i = 0; i< enteros.length -1; i++) {
                System.out.println(enteros[i]);
            }
            return enteros;
        }
        public String[] eliminarValorString (String[] nombres, int nombre){
            int posicion;
            posicion = buscarElementosNombres(nombres, nombre);
            if (posicion == -1) {
                return nombres;
            }
            for(int i = posicion; i< nombres.length -1; i++) {
                nombres[i] = nombres[i+1];
            }
            nombres[nombres.length -1 ]= null;
            for(int i = 0; i< nombres.length -1; i++) {
                System.out.println(nombres[i]);
            }
            return nombres;
        }
        
}
    

