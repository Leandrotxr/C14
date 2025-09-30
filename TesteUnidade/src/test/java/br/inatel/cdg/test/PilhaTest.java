package br.inatel.cdg.test;

import br.inatel.cdg.model.Pilha;
import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PilhaTest {

    @Test
    public void testIsEmpty() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        boolean empty = pilhaInteiros.isEmpty();
        assertTrue(empty); //verifica se a variavel é true
    }

    @Test
    public void testPilhaPush() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(12);
        pilhaInteiros.push(10);
        int tamanho = pilhaInteiros.size();
        assertEquals(2, tamanho); //verifica se tamanho é igual ao valor esperado
    }

    @Test
    public void testPilhaPop() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(12);
        pilhaInteiros.pop();
        int tamanho = pilhaInteiros.size();
        assertEquals(0, tamanho);
    }

    @Test (expected = EmptyStackException.class)
    public void testPilhaPopException() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.pop();
    }

    @Test
    public void testPilhaRetorno() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        int valor = 10;
        pilhaInteiros.push(valor);
        int retorno = pilhaInteiros.pop();
        assertEquals(valor, retorno);
    }
}
