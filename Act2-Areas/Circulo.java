package actividad2;

public class Circulo {
    public double radio;
    
    //Constructor que asigna el ID como radio
    public Circulo() {
        this(0);
}
    Circulo(double id) {
        this.radio=id;
    }

    //Metodos que realizan las operaciones necesarias
    public double CalcularArea(){
        double area = 3.14 * Math.pow(radio, 2);
        return area;
    }
    public double CalcularCircunferencia(){
        double circunferencia = 3.14*2*radio;
        return circunferencia;
    }
    
}
