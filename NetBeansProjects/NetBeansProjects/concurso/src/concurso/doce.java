
package concurso;

public class doce {

  
    public static void main(String[] args) {
            // Definir dos vectores para probar
        int[] vector1 = {1, 2};
        int[] vector2 = {2, -2};

        // Verificar si los vectores son ortogonales
        if (sonOrtogonales(vector1, vector2)) {
            System.out.println("Los vectores son ortogonales.");
        } else {
            System.out.println("Los vectores no son ortogonales.");
        }
    }
    public static boolean sonOrtogonales(int[] vector1, int[] vector2) {
        int productoEscalar = 0;

        // Calcular el producto escalar
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        // Los vectores son ortogonales si el producto escalar es 0
        return productoEscalar == 0;
    }
    
}
