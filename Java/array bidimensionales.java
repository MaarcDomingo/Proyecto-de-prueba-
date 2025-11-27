/**
     * KATA 2: Two-Dimensional Array Operation
     * https://www.codewars.com/kata/60bcef3c4a3ef30015bc05dd
     * 
     * Calcular el producto de todas las sumas de las filas.
     * - La longitud y anchura del array pueden ser diferentes (de 1 a 5)
     * - Todos los enteros están entre 1 y 9
     * 
     * Ejemplo: [[0,4,8,5]] -> 0+4+8+5 = 17 -> producto = 17
     *          [[1,2],[3,4]] -> (1+2)*(3+4) = 3*7 = 21
     */
public class arraybidimensionales {

    
public static int twoDimensionalArrayOperation(int[][] array) {
        // CONCEPTO CLAVE: Inicializamos el producto en 1 (elemento neutro de la multiplicación)
        int product = 1;
        
        // Recorremos cada fila del array bidimensional
        // array.length nos da el número de filas
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            
            // IMPORTANTE: array[i].length nos da el número de columnas de la fila i
            // Esto es crucial porque las filas pueden tener diferentes longitudes
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            
            // Multiplicamos el producto acumulado por la suma de esta fila
            product *= rowSum;
        }
        
        return product;
    }

public static void printArray (int [][] array) {
    //Ejemplo1: un array de una sola fila 
    for (int i = 0; i < array.length; i++) {
        for(int j = 0; j < array[i].length; j++){
            System.out.print(array[i][j]+"");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        int[][] Ejemplo1 = { {0, 5, 6, 7 }};
        System.out.println("Input: [[0, 5, 6, 7]]");
        System.out.println("Producto de sumas de filas" + twoDimensionalArrayOperation(Ejemplo1));
    }
}