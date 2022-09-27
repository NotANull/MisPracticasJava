import PaqueteLectura.*;

public class MatrizArray {

    public static void main(String[] args) {
        
        GeneradorAleatorio.iniciar();
        
        ArrayNumeritos[][] matrizArrays = new ArrayNumeritos[3][3];
        ArrayNumeritos arrayNumeritos;
        
        for (int i = 0; i < 3; i++) { //Para cada fila
            for (int j = 0; j < 3; j++) { //Para cada columna de la fila
                arrayNumeritos = new ArrayNumeritos(GeneradorAleatorio.generarInt(10)+1/*Random entre 1 y 10*/);
                for (int k = 0; k < arrayNumeritos.getDimF(); k++) {
                    arrayNumeritos.insertarNumero(GeneradorAleatorio.generarInt(11)/*Random entre 0 y 10*/);
                }
                matrizArrays[i][j] = arrayNumeritos;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("[" + i + "][" + j + "] Posición de la matriz");
                matrizArrays[i][j].mostrarArray();
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
}
