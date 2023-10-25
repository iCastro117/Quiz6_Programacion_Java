/**
 * Clase que representa un rectángulo heredando de FiguraGeometrica.
 * Complejidad temporal: O(1) Tiempo constante.
 */
public class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    /**
     * Constructor de la clase Rectangulo.
     *
     * @param nombre Nombre del rectángulo.
     * @param color Color del rectángulo.
     * @param lado1 Lado 1 del rectángulo.
     * @param lado2 Lado 2 del rectángulo.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) { //Constructor de la clase para inicializar el nombre, color y lados del rectángulo.
       //El constructor Rectangulo de la clase Rectangulo inicializa cuatro atributos (nombre, color, lado1 y lado2), lo cual es una cantidad constante de operaciones.

        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Muestra información específica del rectángulo, incluyendo sus lados.
     */
    @Override
    public void mostrarInformacion() { // Método que muestra información específica del rectángulo, incluyendo sus lados.
       //El método mostrarInformacion() imprime cuatro atributos (nombre, color, lado1 y lado2), lo que sigue siendo una cantidad constante de operaciones.

        super.mostrarInformacion();
        System.out.println("Tipo de figura: Rectángulo");
        System.out.println("Lado 1 del rectángulo: " + lado1);
        System.out.println("Lado 2 del rectángulo: " + lado2);
    }
}

