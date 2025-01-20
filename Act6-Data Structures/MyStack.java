package actividad6;

public class MyStack {
    
    int max;
    char[] stack = new char[max];
    int top=0;

    // Push
    public void push(char elemento) {
        if(top == max) {
            System.out.println("Stack is full"); 
        } else {
            stack[top] = elemento;
            top++;
        }   
    }

    // Pop
    public char pop() { 
        if(top == 0) {
        System.out.println("Stack is empty"); 
        return ('#'); 
        } else { 
        top--; /* decreases top */ 
        char elemento = stack[top];
        return (elemento); /*returns eliminated element*/ 
        } 
    }

    // Invertir arreglo
    public char[] invertir(char[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            push(arreglo[i]);
        }
        char[] arregloInvertido = new char[arreglo.length];
        for (int i = arreglo.length - 1; i >= 0; i--) {
            arregloInvertido[i] = pop();
        }
        return arregloInvertido;
    }

    // Palindromo
    public boolean palindromo(String cadena) {
        char[] arreglo = cadena.toCharArray();
        for (int i = 0; i < arreglo.length; i++) {
            push(arreglo[i]);
        }
        for (int i = 0; i < arreglo.length/2; i++) {
            char elemento = pop();
            if (arreglo[i] != elemento) {
                return false;
            }
        }
        return true;
    }

}
