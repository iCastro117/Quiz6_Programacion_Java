     /**
     * Clase que representa un triángulo heredando de FiguraGeometrica.
      * Complejidad temporal: O(1) Tiempo constante.
     */
    public class Triangulo extends FiguraGeometrica {
        private double base;
        private double altura;

        /**
         * Constructor de la clase Triangulo.
         *
         * @param nombre Nombre del triángulo.
         * @param color Color del triángulo.
         * @param base Base del triángulo.
         * @param altura Altura del triángulo.
         */
        public Triangulo(String nombre, String color, double base, double altura) { //Constructor de la clase para inicializar el nombre, color, base y altura del triángulo.
            //l constructor Triangulo de la clase Triangulo inicializa cuatro atributos (nombre, color, base y altura), lo cual es una cantidad constante de operaciones.

            super(nombre, color);
            this.base = base;
            this.altura = altura;
        }

        /**
         * Muestra información específica del triángulo, incluyendo su base y altura.
         */
        @Override
        public void mostrarInformacion() {// Método que muestra información específica del triángulo, incluyendo su base y altura.
          //El método mostrarInformacion() imprime cuatro atributos (nombre, color, base y altura), que sigue siendo una cantidad constante de operaciones.

           super.mostrarInformacion();
            System.out.println("Tipo de figura: Triángulo");
            System.out.println("Base del triángulo: " + base);
            System.out.println("Altura del triángulo: " + altura);
        }
    }

