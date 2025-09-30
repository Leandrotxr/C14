package br.inate.cdg.test;

import br.inatel.cdg.busca.BuscaInimigo;
import br.inatel.cdg.model.Inimigo;
import br.inatel.cdg.service.InimigoService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//não estamo utilizando mockito
public class TesteBuscaInimigo {

    //cria-se o mock
    InimigoService service;
    BuscaInimigo buscaInimigo;

    @Before
    public void setup(){
        //injeta o mock
        service = new MockInimigoService();
        buscaInimigo = new BuscaInimigo(service);
    }

    @Test
    public void testBuscaInimigoSkeleton(){
        //Skeleton tem id 10
        Inimigo skeleton = buscaInimigo.buscaInimigo(10);

        //fazendo as assertivas
        assertEquals("Skeleton", skeleton.getNome());
        assertEquals(200.0, skeleton.getQtdVida());
        assertEquals("Espada do Skeleton", skeleton.getArma());
    }

    @Test
    public void testeBuscaInimigoDragao(){
        Inimigo dragao = buscaInimigo.buscaInimigo(20);

        assertEquals("Dragao", dragao.getNome());
        assertEquals(100.0, dragao.getQtdVida(), 0.1);
        assertEquals("Fogo", dragao.getArma());
    }

    @Test
    public void testeBuscaInimigoPadrao(){
        Inimigo dragao = buscaInimigo.buscaInimigo(9);

        assertEquals("Aranha", dragao.getNome());
        assertEquals(20.0, dragao.getQtdVida(), 0.1);
        assertEquals("Teia", dragao.getArma());
    }

    @Test
    public void testeBuscaInimigoValido(){
        boolean inimigoValido = buscaInimigo.verificaArrayListExistente(10);

        assertTrue(inimigoValido);
    }

    @Test
    public void testeBuscaInimigoInValido() {
        boolean inimigoValido = buscaInimigo.verificaArrayListExistente(-8);

        assertFalse(inimigoValido);
    }
}
