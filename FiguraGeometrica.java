/**
 * Clase base para representar una figura geométrica con nombre y color.
 * Complejidad temporal: O(1) Tiempo constante.
 */
public class FiguraGeometrica {
    private String nombre;
    private String color;

    /**
     * Constructor de la clase FiguraGeometrica.
     *
     * @param nombre Nombre de la figura.
     * @param color Color de la figura.
     */
    public FiguraGeometrica(String nombre, String color) { //Constructor de la clase para inicializar el nombre y el color de la figura.
        //El constructor FiguraGeometrica inicializa dos atributos, nombre y `color, lo cual es una cantidad constante de operaciones, sin importar los valores concretos de entrada.

        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Muestra información básica de la figura, incluyendo nombre y color.
     */
    public void mostrarInformacion() { //Método que muestra información básica de la figura, incluyendo nombre y color.
       //El método mostrarInformacion() imprime dos atributos, nombre y color, por ende es una cantidad constante de operaciones.

        System.out.println("Nombre de la figura: " + nombre);
        System.out.println("Color de la figura: " + color);
    }
}
