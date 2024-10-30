package com.exemplo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoramediaTest {

    private final Calculadoramedia calculadora = new Calculadoramedia();

    @Test
    public void testTodasNotasZero() {
        double resultado = calculadora.calcularMedia(0.0, 0.0, 0.0);
        assertEquals(0.0, resultado, "A média de todas as notas zero deve ser zero.");
    }

    @Test
    public void testTodasNotasMaximas() {
        double resultado = calculadora.calcularMedia(10.0, 10.0, 10.0);
        assertEquals(10.0, resultado, "A média de todas as notas máximas deve ser o valor máximo.");
    }

    @Test
    public void testDuasNotasMaximasEUmaZero() {
        double resultado = calculadora.calcularMedia(10.0, 10.0, 0.0);
        assertEquals(6.67, resultado, 0.01, "A média de duas notas máximas e uma nota zero deve ser aproximadamente 6.67.");
    }

    @Test
    public void testNotasDecimais() {
        double resultado = calculadora.calcularMedia(7.5, 8.2, 9.3);
        assertEquals(8.33, resultado, 0.01, "A média de notas decimais deve ser aproximadamente 8.33.");
    }

    @Test
    public void testNotasDiferentes() {
        double resultado = calculadora.calcularMedia(5.0, 7.0, 8.0);
        assertEquals(6.67, resultado, 0.01, "A média de 5, 7 e 8 deve ser aproximadamente 6.67.");
    }
}
