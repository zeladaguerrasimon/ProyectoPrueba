public class Main {
    public static void main(String[] args) {
        // Crear el arreglo con los registros de cantidad de platos, capacidad de mesa y subtotal
        int[][] registros = {
                {6, 5, 60},
                {4, 3, 40},
                {12, 6, 120},
                {20, 8, 200},
                {3, 2, 30}
        };

        // Procesar y mostrar los resultados
        for (int[] registro : registros) {
            int cantidadPlatos = registro[0];
            int capacidadMesa = registro[1];
            int subtotal = registro[2];

            double descuentoCalculo1 = calcularDescuentoPlatos(cantidadPlatos, subtotal);
            double descuentoCalculo2 = calcularDescuentoComensales(cantidadPlatos, capacidadMesa, subtotal);

            System.out.println("Cantidad de Platos: " + cantidadPlatos);
            System.out.println("Capacidad de Mesa: " + capacidadMesa + " personas");
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento (Cálculo 1): " + descuentoCalculo1 + "%");
            System.out.println("Descuento (Cálculo 2): " + descuentoCalculo2 + "%");
            System.out.println("Total a pagar: $" + (subtotal - (subtotal * descuentoCalculo1 / 100) - (subtotal * descuentoCalculo2 / 100)));
            System.out.println("----------------------");
        }
    }

    public static double calcularDescuentoPlatos(int cantidadPlatos, int subtotal) {
        if (cantidadPlatos <= 5) {
            return 0;
        } else if (cantidadPlatos < 10) {
            return 3;
        } else if (cantidadPlatos <= 15) {
            return 5;
        } else {
            return 30;
        }
    }

    public static double calcularDescuentoComensales(int cantidadPlatos, int capacidadMesa, int subtotal) {
        if (cantidadPlatos > 5 && capacidadMesa < 4) {
            return 15;
        } else if (cantidadPlatos >= 5 && cantidadPlatos <= 15 && capacidadMesa >= 4 && capacidadMesa <= 6) {
            return 20;
        } else if (cantidadPlatos > 15 && capacidadMesa > 6) {
            return 30;
        } else if (capacidadMesa == 2 && cantidadPlatos > 5) {
            return 15;
        } else if (capacidadMesa <= 4 && cantidadPlatos < 5) {
            return 0;
        } else {
            return 0;
        }
    }
}
