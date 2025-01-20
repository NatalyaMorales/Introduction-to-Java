package actividad6;

public class Queue {
    
    int max;
    char[] queue;
    int tail=0;

    // Constructor
    public Queue(int max) {
        this.max = max;
        queue = new char[max];
        tail = 0;
    }

    
    // Delete
    public char delete() {
        if(tail == 0) {
            System.out.println("Queue is empty"); 
            return ('#'); 
        } else {
            char elemento = queue[0];;
            for (int i=0; i<tail-1;i++) {
                queue[i]=queue[i+1];
            }
            tail--;
        return (elemento);
        }
    }

    // Add
    public void add(char elemento) {
        if (tail < max) {
            queue[tail++] = elemento;
        }
    }
}
