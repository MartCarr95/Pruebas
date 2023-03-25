package alebeutel.calculadora;

public class CalculadoraException extends Exception {
    
    public CalculadoraException(String mensaje) {
        System.out.println("Error: " + mensaje);
    }

}
