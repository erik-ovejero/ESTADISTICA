
public class EstadisticaDescriptiva {
	
		// Método para encontrar el valor mínimo en un array
		public static int encontrarValorMinimo(int[] array) {
        int min = array[0]; // Inicializar el valor mínimo con el primer elemento del array
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Actualizar el valor mínimo si se encuentra un valor menor
            }
        }
        return min; // Devolver el valor mínimo encontrado
    }
        
        // Método para encontrar el valor máximo en un array
        public static int encontrarValorMaximo(int[] array) {
            int max = array[0]; // Inicializar el valor máximo con el primer elemento del array
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i]; // Actualizar el valor máximo si se encuentra un valor mayor
                }
            }
            return max; // Devolver el valor máximo encontrado
            
    }
        // Método para calcular el recorrido R (valor máximo - valor mínimo)
        public static int recorridoR(int[] array) {
            int min = encontrarValorMinimo(array); // Encontrar el valor mínimo
            int max = encontrarValorMaximo(array); // Encontrar el valor máximo
            return max - min; // Calcular y devolver la diferencia
        }
   
     // Método para calcular la media muestral (x̄)
        public static double mediaMuestral(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i]; // Sumar todos los valores del array
            }
            return (double) sum / array.length; // Dividir la suma por el número de elementos
        }   
        
        // Método para calcular el desvío medio muestral
        public static double desvioMedioMuestral(int[] array) {
            double media = mediaMuestral(array); // Calcular la media muestral
            double sumDesvios = 0;
            for (int i = 0; i < array.length; i++) {
                sumDesvios += Math.abs(array[i] - media); // Calcular el desvío absoluto y sumar
            }
            return sumDesvios / array.length; // Dividir la suma de los desvios por el número de elementos
        }
        
        // Método para calcular la varianza muestral (S^2)
        public static double varianzaMuestral(int[] array) {
            double media = mediaMuestral(array); // Calcular la media muestral
            double sumCuadrados = 0;
            for (int i = 0; i < array.length; i++) {
                sumCuadrados += Math.pow(array[i] - media, 2); // Elevar al cuadrado la diferencia con la media
            }
            return sumCuadrados / (array.length - 1); // Dividir por n - 1 para obtener la varianza muestral
        }
        
        
        
        
}

