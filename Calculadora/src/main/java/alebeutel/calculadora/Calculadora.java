package alebeutel.calculadora;

import java.util.Scanner;

public class Calculadora {

    private double numero1;
    private double numero2;
    private char operacion;

    private static Scanner scanner = new Scanner(System.in);

    public Calculadora() {

    }

    public Calculadora(double num1, double num2, char op) {
        this.numero1 = num1;
        this.numero2 = num2;
        this.operacion = op;
    }

    public double getResultado() throws CalculadoraException {
        double result;
        switch (this.operacion) {
            case '+':
                result = this.numero1 + this.numero2;
                break;
            case '-':
                result = this.numero1 - this.numero2;
                break;
            case '*':
                result = this.numero1 * this.numero2;
                break;
            case '/':
                if (this.numero2 == 0) {
                    throw new CalculadoraException("División por cero");
                }
                result = this.numero1 / this.numero2;
                break;
            default:
                throw new CalculadoraException("Operador Incorrecto");
        }

        return result;
    }

    public double ejecucionInteractiva() throws CalculadoraException {
        this.numero1 = this.leerNumero();
        this.numero2 = this.leerNumero();
        this.operacion = this.leerOperador();

        return this.getResultado();
    }

    public double leerNumero() {
        System.out.println("Introduzca un número:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Número incorrecto. Inténtalo de nuevo.");
            scanner.next();
            num = this.leerNumero();
        }
        return num;
    }

    public char leerOperador() {
        System.out.println("Introduzca la operación:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Operador incorrecto. Inténtalo de nuevo.");
            scanner.next();
            operation = this.leerOperador();
        }

        return operation;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

}
