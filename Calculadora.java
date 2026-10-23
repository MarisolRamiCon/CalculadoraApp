import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double num1, num2;
        do {
            System.out.println();
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
            System.out.println("Ingresa tu opción");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.printf("La suma de los numeros es %.2f ", num1 + num2);
                    break;

                case 2:
                    System.out.println("Ingresa el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.printf("La resta de los numeros es %.2f ", num1 - num2);
                    break;

                case 3:
                    System.out.println("Ingresa el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.printf("La multiplicación de los numeros es %.2f ", num1 * num2);
                    break;

                case 4:
                    System.out.println("Ingresa el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.printf("La división de los numeros es %.2f ", num1 / num2);
                    break;

                default:
                    System.out.println("Esa no es una opción");
                    break;
            }

              if(opcion==5){
                    System.out.println("Gracias por utilizar la calculadora");
                }

        } while (opcion != 5);

    }
}
