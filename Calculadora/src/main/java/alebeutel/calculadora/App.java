package alebeutel.calculadora;

public class App {

    public static void main(String[] args) {
        try {
            Calculadora calculadora = new Calculadora(12, 12, '+');
            System.out.println("Resultado: " + calculadora.getResultado());

            double resultado = calculadora.ejecucionInteractiva();
            System.out.println("Resultado: " + resultado);

        } catch (CalculadoraException e) {
            System.out.println("Datos ingresados incorrectos");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
