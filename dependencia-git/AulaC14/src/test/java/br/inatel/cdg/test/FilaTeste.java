package br.inatel.cdg.test;

import classes.Fila;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilaTeste {

    @Test
    public void testeFilaSize(){
        Fila<Integer> filaInteiros = new Fila<>();
        filaInteiros.enfileirar(21);
        assertEquals(1, filaInteiros.size());
    }

    @Test
    public void testeFilaVazia(){
        Fila<Integer> filaInteiros = new Fila<>();
        assertTrue(filaInteiros.filaVazia());
    }

    @Test
    public void testeEnfileirar(){
        Fila<Integer> filaInteiros = new Fila<>();
        filaInteiros.enfileirar(21);
        filaInteiros.enfileirar(22);
        assertEquals(22, filaInteiros.getElemento(1).intValue());
    }

    @Test
    public void testeRemoverFila(){
        Fila<Integer> filaInteiros = new Fila<>();
        filaInteiros.enfileirar(21);
        filaInteiros.enfileirar(23);
        filaInteiros.removerFila();
        assertEquals(1, filaInteiros.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testeFilaRemoverFilaException(){
        Fila<Integer> filaInteiros = new Fila<>();
        filaInteiros.removerFila();
    }

    @Test
    public void testeFilaRetorno(){
        Fila<Integer> filaInteiros = new Fila<>();
        int valor = 13;
        filaInteiros.enfileirar(valor);
        int retorno = filaInteiros.removerFila();

        assertEquals(valor, retorno);
    }
}
