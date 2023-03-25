package alebeutel.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;

public class AppTest 
{
    private Calculadora calculadora;
    
    @Before
    public void inicializar() {
        this.calculadora = new Calculadora();
        this.calculadora.setNumero1(4);
        this.calculadora.setNumero2(2);
    }
    
    @Test
    public void sumaCorrecta() throws CalculadoraException
    {
        this.calculadora.setOperacion('+');
        double esperado = 6;

        assertEquals(this.calculadora.getResultado(),esperado, 0.002);
    }
    
    @Test
    public void sumaIncorrecta() throws CalculadoraException
    {
        this.calculadora.setOperacion('+');
        double esperado = 8;
        assertNotEquals(this.calculadora.getResultado(),esperado, 0.002);
    }    
}
