import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Marcador {
    private List<Partido> partidos;
    private List<Pronostico> pronosticos;

    // Constructor
    public Marcador() {
        this.partidos = new ArrayList<>();
        this.pronosticos = new ArrayList<>();
    }

    // Método para leer los partidos desde un archivo
    public void leerPartidos(String archivo) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = lector.readLine()) != null) {
            Partido partido = Partido.leerPartido(linea);
            partidos.add(partido);
        }
        lector.close();
    }

    // Método para leer los pronósticos desde un archivo
    public void leerPronosticos(String archivo) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = lector.readLine()) != null) {
            Pronostico pronostico = Pronostico.leerPronostico(linea);
            pronosticos.add(pronostico);
        }
        lector.close();
    }

    // Método para calcular la puntuación de los pronósticos
    public int calcularPuntuacion(int i) {
        int puntuacion = i;
        for (Pronostico pronostico : pronosticos) {
            for (Partido partido : partidos) {
                if (pronostico.getEquipoLocal().equals(partido.getEquipoLocal())
                        && pronostico.getEquipoVisitante().equals(partido.getEquipoVisitante())
                        && pronostico.getGolesLocal() == partido.getGolesLocal()
                        && pronostico.getGolesVisitante() == partido.getGolesVisitante()) {
                    puntuacion++;
                }
            }
        }
        return puntuacion;
    }

    // Método para escribir la puntuación a un archivo
    public void escribirPuntuacion(String archivo) throws IOException {
        FileWriter escritor = new FileWriter(archivo);
        escritor.write("Puntuación: " + calcularPuntuacion(1));
        escritor.close();
    }
}

