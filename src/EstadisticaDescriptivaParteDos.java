import java.util.Scanner;

public class EstadisticaDescriptivaParteDos {
	
	
	public static void estadisticaDescriptivaParte2(Scanner scanner, EstadisticaDescriptiva estadistica) {
	    // Pedir al usuario que introduzca la cantidad de elementos en la muestra
	    System.out.print("Ingrese el tamaño de la muestra m: ");
	    int m = scanner.nextInt();

	    // Crear arrays de tamaño m para Xi y Fi
	    int[] xi = new int[m];
	    int[] fi = new int[m];

	    // Pedir al usuario que introduzca los valores Xi y sus frecuencias Fi
	    for (int i = 0; i < m; i++) {
	        System.out.print("Ingrese el valor del X sub " + (i + 1) + ": ");
	        xi[i] = scanner.nextInt();
	        System.out.print("Ingrese la frecuencia F sub " + (i + 1) + ": ");
	        fi[i] = scanner.nextInt();
	    }

	    // Mostrar los valores Xi y Fi en una línea, separados por comas
	    System.out.print("Los valores del array Xi son: ");
	    for (int i = 0; i < m; i++) {
	        System.out.print(xi[i]);
	        if (i < m - 1) {
	            System.out.print(", ");
	        }
	    }
	    System.out.println(); // Salto de línea después de imprimir los valores Xi

	    System.out.print("Las frecuencias del array Fi son: ");
	    for (int i = 0; i < m; i++) {
	        System.out.print(fi[i]);
	        if (i < m - 1) {
	            System.out.print(", ");
	        }
	        
	        
	    }

	    System.out.println(); // Salto de línea después de imprimir las frecuencias Fi

        // Calcular y mostrar las frecuencias acumuladas usando la clase Frecuencias
        int[] frecuenciasAcumuladas = Frecuencias.calcularFrecuenciasAcumuladas(fi);
        Frecuencias.mostrarFrecuenciasAcumuladas(frecuenciasAcumuladas);
        
        // Calcular y mostrar las frecuencias relativas usando la clase Frecuencias
        double[] frecuenciasRelativas = Frecuencias.calcularFrecuenciasRelativas(fi);
        Frecuencias.mostrarFrecuenciasRelativas(frecuenciasRelativas);
        
        // Calcular y mostrar las frecuencias relativas acumuladas usando la clase Frecuencias
        double[] frecuenciasRelativasAcumuladas = Frecuencias.calcularFrecuenciasRelativasAcumuladas(frecuenciasRelativas);
        Frecuencias.mostrarFrecuenciasRelativasAcumuladas(frecuenciasRelativasAcumuladas);
        
    }
}