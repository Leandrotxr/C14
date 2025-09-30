package br.inatel.cdg.calculadora;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteCalculadora {

    private Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora = new Calculadora();
    }

    @Test
    public void testeSoma(){
        int result = calculadora.soma(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testeSubtrair(){
        int result = calculadora.subtracao(5, 4);
        assertEquals(1, result);
    }

    @Test
    public void testeMultiplicar(){
        int result = calculadora.multiplicacao(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void testeDividir(){
        double result = calculadora.divisao(3, 4);
        assertEquals(0.75, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testeDividirPorZero(){
        double result = calculadora.divisao(3, 0);
    }
}
