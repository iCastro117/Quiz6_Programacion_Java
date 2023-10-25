/**
 * Clase que permite al usuario crear y mostrar información sobre figuras geométricas.
 * Complejidad temporal: O(1) Tiempo constante.
 */
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {//Este método es la función principal que permite al usuario crear y mostrar información sobre figuras geométricas. Solicita datos al usuario, crea una instancia de la figura seleccionada y muestra información.
      //  El método main no depende de la cantidad de figuras a procesar. Realiza un número constante de operaciones para cada figura, independientemente de cuántas se ingresen.


        Scanner scanner = new Scanner(System.in);
        boolean figuraValida = false;

        // Solicitar datos de la figura al usuario
        System.out.print("Ingrese el nombre de la figura: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el color de la figura: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo): ");
        int tipoFigura = scanner.nextInt();

        FiguraGeometrica figura = null;

        // Crear una instancia de la figura seleccionada por el usuario
        switch (tipoFigura) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                figura = new Circulo(nombre, color, radio);
                figuraValida = true;
                break;
            case 2:
                System.out.print("Ingrese el valor del lado 1 del rectángulo: ");
                double lado1 = scanner.nextDouble();
                System.out.print("Ingrese el valor del lado 2 del rectángulo: ");
                double lado2 = scanner.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                figuraValida = true;
                break;
            case 3:
                System.out.print("Ingrese el valor de la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese el valor de la altura del triángulo: ");
                double altura = scanner.nextDouble();
                figura = new Triangulo (nombre, color, base, altura);
                figuraValida = true;
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        // Mostrar información de la figura seleccionada o indicar que no es válida
        if (!figuraValida) {
            System.out.println("La figura seleccionada no corresponde a ninguno de los tipos de figuras válidos.");
        } else {
            figura.mostrarInformacion();
        }
    }
}
