/**
 * Clase que representa un círculo heredando de FiguraGeometrica.
 * Complejidad temporal: O(1) Tiempo constante.
 */
public class Circulo extends FiguraGeometrica {
    private double radio;

    /**
     * Constructor de la clase Circulo.
     *
     * @param nombre Nombre del círculo.
     * @param color Color del círculo.
     * @param radio Radio del círculo.
     */
    public Circulo(String nombre, String color, double radio) { // Constructor de la clase para inicializar el nombre, color y radio del círculo.
       //El constructor Circulo de la clase Circulo inicializa tres atributos (nombre, color y radio), lo cual es una cantidad constante de operaciones.

        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Muestra información específica del círculo, incluyendo su radio.
     */
    @Override
    public void mostrarInformacion() { //Método que muestra información específica del círculo, incluyendo su radio.
        //El método mostrarInformacion() imprime tres atributos (nombre, color y radio), nuevamente siendo una cantidad constante de operaciones.

        super.mostrarInformacion();
        System.out.println("Tipo de figura: Círculo");
        System.out.println("Radio del círculo: " + radio);
    }
}


