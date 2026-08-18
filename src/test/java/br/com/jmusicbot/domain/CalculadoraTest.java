package br.com.jmusicbot.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    void somaTest() {

        Calculadora calculadora = new Calculadora();

        int soma = calculadora.calculo(10,10);

        assertEquals(20,soma);
    }

}
