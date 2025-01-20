package actividad2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    
            boolean bandera = true;
            while (bandera) {
            System.out.println("\nPrograma que calcula operaciones de: \n1. Cuadrado\n2. Circulo\n3. Salir");
            System.out.println("\nIngrese el numero de la figura:");
            int figura = sc.nextInt();
            //int figura = Integer.parseInt(sc.nextLine());

            
            if (figura == 1){
                System.out.println("\nIngrese la medida del lado:");
                int id = sc.nextInt();
                Cuadrado cuadrado = new Cuadrado(id);

                System.out.println("\nOperaciones que puede realizar: \n1. Area\n2. Perimetro \n3. Diagonal");
                System.out.println("\nIngrese el numero de la operacion a realizar:");
                int op = sc.nextInt();
                System.out.println("\nPara el cuadrado con lado "+id);
                switch (op){
                    case 1:
                    //double areaCuadrado = (int)cuadrado.CalcularArea();
                    //System.out.println("Area = " +areaCuadrado );
                    System.out.println(cuadrado.CalcularArea());
                    break;

                    case 2:
                    double perimetroCuadrado = (int)cuadrado.CalcularPerimetro();
                    System.out.println("Perimetro = " +perimetroCuadrado );
                    break;

                    case 3:
                    double diagonalCuadrado =(int)cuadrado.CalcularDiagonal();
                    System.out.println("Diagonal = " +diagonalCuadrado );
                    break;
                }
                
            } else {

                System.out.println("\nIngrese la medida del radio:");
                int id = sc.nextInt();
                Circulo circulo = new Circulo(id);
                System.out.println(",\nOperaciones que puede realizar: \n1. Area\n2. Circunferencia");
                System.out.println("\nIngrese el numero de la operacion a realizar:");
                int op = sc.nextInt();
                System.out.println("\nPara el circulo con radio "+id);
                switch (op){
                    case 1:
                    double areaCirculo = (int)circulo.CalcularArea();
                    System.out.println("Area = " +areaCirculo );
                    break;
                    
                    case 2:
                    double circunferenciaCirculo = (int)circulo.CalcularCircunferencia();
                    System.out.println("Area = " +circunferenciaCirculo );
                    break;
                }
                sc.close();
            }
            System.out.println("Programa que calcula operaciones de: \n1. Cuadrado\n2. Circulo\n3. Salir");
            System.out.println("\nIngrese el numero de la figura:");
            figura = sc.nextInt();

            } 
        } 
    } 