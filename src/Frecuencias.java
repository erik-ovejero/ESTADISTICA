public class Frecuencias {

    // Método para calcular las frecuencias absolutas acumuladas
    public static int[] calcularFrecuenciasAcumuladas(int[] fi) {
        int[] frecuenciasAcumuladas = new int[fi.length];
        frecuenciasAcumuladas[0] = fi[0]; // La primera frecuencia acumulada es igual a la primera frecuencia absoluta

        for (int i = 1; i < fi.length; i++) {
            frecuenciasAcumuladas[i] = frecuenciasAcumuladas[i - 1] + fi[i];
        }

        return frecuenciasAcumuladas;
    }

    // Método para mostrar las frecuencias acumuladas
    public static void mostrarFrecuenciasAcumuladas(int[] frecuenciasAcumuladas) {
        System.out.print("Las frecuencias absolutas acumuladas son: ");
        for (int i = 0; i < frecuenciasAcumuladas.length; i++) {
            System.out.print(frecuenciasAcumuladas[i]);
            if (i < frecuenciasAcumuladas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Salto de línea después de imprimir las frecuencias acumuladas
    }


    // Método para calcular las frecuencias relativas
    public static double[] calcularFrecuenciasRelativas(int[] fi) {
        int sumaFrecuencias = 0;
        for (int frecuencia : fi) {
            sumaFrecuencias += frecuencia;
        }

        double[] frecuenciasRelativas = new double[fi.length];
        for (int i = 0; i < fi.length; i++) {
            frecuenciasRelativas[i] = (double) fi[i] / sumaFrecuencias;
        }

        return frecuenciasRelativas;
    }

    // Método para mostrar las frecuencias relativas
    public static void mostrarFrecuenciasRelativas(double[] frecuenciasRelativas) {
        System.out.print("Las frecuencias relativas son: ");
        for (int i = 0; i < frecuenciasRelativas.length; i++) {
            System.out.printf("%.4f", frecuenciasRelativas[i]);
            if (i < frecuenciasRelativas.length - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println(); // Salto de línea después de imprimir las frecuencias relativas
    }
        // Método para calcular las frecuencias relativas acumuladas
        public static double[] calcularFrecuenciasRelativasAcumuladas(double[] frecuenciasRelativas) {
            double[] frecuenciasRelativasAcumuladas = new double[frecuenciasRelativas.length];
            frecuenciasRelativasAcumuladas[0] = frecuenciasRelativas[0]; // La primera frecuencia relativa acumulada es igual a la primera frecuencia relativa

            for (int i = 1; i < frecuenciasRelativas.length; i++) {
                frecuenciasRelativasAcumuladas[i] = frecuenciasRelativasAcumuladas[i - 1] + frecuenciasRelativas[i];
            }

            return frecuenciasRelativasAcumuladas;
        }

        // Método para mostrar las frecuencias relativas acumuladas
        public static void mostrarFrecuenciasRelativasAcumuladas(double[] frecuenciasRelativasAcumuladas) {
            System.out.print("Las frecuencias relativas acumuladas son: ");
            for (int i = 0; i < frecuenciasRelativasAcumuladas.length; i++) {
                System.out.printf("%.4f", frecuenciasRelativasAcumuladas[i]);
                if (i < frecuenciasRelativasAcumuladas.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // Salto de línea después de imprimir las frecuencias relativas acumuladas
        }
    }
    