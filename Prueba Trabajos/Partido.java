public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    // Constructor
    public Partido(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    // Getters y setters
    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    // Método para calcular el resultado del partido
    public String resultado() {
        if (golesLocal > golesVisitante) {
            return equipoLocal + " ganó";
        } else if (golesVisitante > golesLocal) {
            return equipoVisitante + " ganó";
        } else {
            return "Empate";
        }
    }

    // Método para leer un partido desde un archivo
    public static Partido leerPartido(String linea) {
        String[] partes = linea.split(",");
        String equipoLocal = partes[0];
        String equipoVisitante = partes[1];
        int golesLocal = Integer.parseInt(partes[2]);
        int golesVisitante = Integer.parseInt(partes[3]);
        return new Partido(equipoLocal, equipoVisitante, golesLocal, golesVisitante);
    }

    // Método para escribir un partido a un archivo
    public String escribirPartido() {
        return equipoLocal + "," + equipoVisitante + "," + golesLocal + "," + golesVisitante;
    }
}
