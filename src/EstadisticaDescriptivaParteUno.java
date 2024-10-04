import java.util.Scanner;

public class EstadisticaDescriptivaParteUno {

    
    public static void estadisticaDescriptivaParte1(Scanner scanner, EstadisticaDescriptiva estadistica) {
    // Pedir al usuario que introduzca la cantidad de elementos en la muestra
    System.out.print("Ingrese el tamaño de la muestra m: ");
    int m = scanner.nextInt();

    // Crear un array de tamaño m
    int[] array = new int[m];

    // Pedir al usuario que introduzca los valores de los elementos del array
    for (int i = 0; i < m; i++) {
        System.out.print("Ingrese el valor del X sub " + (i + 1) + ": ");
        array[i] = scanner.nextInt();
    }

    // Mostrar los valores del array en una línea, separados por comas
    System.out.print("Los valores del array son: ");
    for (int i = 0; i < m; i++) {
        System.out.print(array[i]);
        if (i < m - 1) {
            System.out.print(", ");
        }
    }
    System.out.println(); // Salto de línea después de imprimir el array
    


    // Buscar y mostrar el valor MINIMO del array
    int valorMinimo = EstadisticaDescriptiva.encontrarValorMinimo(array);
    System.out.println("El estadístico del mínimo Xmin es: " + valorMinimo);

    // Buscar y mostrar el valor MAXIMO del array
    int valorMaximo = EstadisticaDescriptiva.encontrarValorMaximo(array);
    System.out.println("El  estadístico del máximo Xmax es: " + valorMaximo);
    

    // Calcular y mostrar el recorrido R
    int recorrido = EstadisticaDescriptiva.recorridoR(array);
    System.out.println("El estadistico del Recorrido R que es Xmax-Xmin es: " + recorrido);
    
    // Calcular y mostrar la media muestral
    double media = EstadisticaDescriptiva.mediaMuestral(array);
    System.out.println("La media muestral (x̄) es: " + media);

    // Calcular y mostrar el desvio medio muestral 
    double mediaMuestral = EstadisticaDescriptiva.desvioMedioMuestral(array);
    System.out.println("El desvio medio muestral seria: "+mediaMuestral);
    
    // Calcular y mostrar la varianza muestral S^2
    double varianzaMuestral = EstadisticaDescriptiva.varianzaMuestral(array);
    System.out.println("La varianza muestral (S^2) del array es: " + varianzaMuestral);

    //Calcular estadistico del desvio muestral S 
    double desvioMuestralS = Math.sqrt(varianzaMuestral);
    System.out.println("El estadístico del desvío muestral es: "+desvioMuestralS);
    

}
	
	
	
	
	
}
