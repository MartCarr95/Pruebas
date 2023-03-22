import java.io.IOException;

public class Main2 {

public static void main(String[] args) {
    String rutaPartidos = "D:\\Programas\\GitHub\\Java\\Trabajo Practico 1\\partidos.txt";
    String rutaPronostico = "D:\\Programas\\GitHub\\Java\\Trabajo Practico 1\\pronostico.txt";
    String rutaPuntuacion = "D:\\Programas\\GitHub\\Java\\Trabajo Practico 1\\puntuacion.txt";

    Marcador marcador = new Marcador();

    try {
        marcador.leerPartidos(rutaPartidos);
        marcador.leerPronosticos(rutaPronostico);
        marcador.escribirPuntuacion(rutaPuntuacion);
        System.out.println("La puntuación se ha escrito correctamente en el archivo.");
    } catch (IOException e) {
        System.err.println("Error al leer o escribir archivos: " + e.getMessage());
    }
}
}
