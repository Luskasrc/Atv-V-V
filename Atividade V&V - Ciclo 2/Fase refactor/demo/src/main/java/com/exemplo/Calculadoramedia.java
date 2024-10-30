package com.exemplo;

public class Calculadoramedia {

    // Método para calcular média com validação de limites de nota
    public double calcularMedia(double nota1, double nota2, double nota3) {
        validarNota(nota1);
        validarNota(nota2);
        validarNota(nota3);

        double media = (nota1 + nota2 + nota3) / 3.0;

        return Math.round(media * 100.0) / 100.0; // Arredondando para duas casas decimais
    }

    // Método auxiliar para validar nota
    private void validarNota(double nota) {
        if (nota < 0.0 || nota > 10.0) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        }
    }
}
