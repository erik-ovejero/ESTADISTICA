import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Crear una instancia de EstadisticaDescriptiva
        EstadisticaDescriptiva estadistica = new EstadisticaDescriptiva();
        
        // crear una instancia de EstadisticaDescriptivaParteUno
        EstadisticaDescriptivaParteUno estadisticaParteUno = new EstadisticaDescriptivaParteUno();
        
        // Crear una instancia de EstadisticaFrecuencias
        EstadisticaDescriptivaParteDos estadisticaParteDos = new EstadisticaDescriptivaParteDos();
        
        while (true) {
            // Mostrar el menú
            System.out.println("Seleccione una opción:");
            System.out.println("1. Estadística Descriptiva Parte 1");
            System.out.println("2. Estadística Descriptiva Parte 2" );
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Llamar al método para Estadística Descriptiva Parte 1
                	estadisticaParteUno.estadisticaDescriptivaParte1(scanner, estadistica);
                    break;
                case 2:
                    // Llamar al método para Estadística Descriptiva Parte 1
                	estadisticaParteDos.estadisticaDescriptivaParte2(scanner, estadistica);
                    break;
                case 3:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        }
        

    

    
}