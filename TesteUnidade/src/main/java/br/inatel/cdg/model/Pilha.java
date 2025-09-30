package br.inatel.cdg.model;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {

    private List<T> elementos = new ArrayList<>();
    private int tamanho = 0;

    public int size(){
        return tamanho;
    }

    //verifica se a pilha está vazia
    public boolean isEmpty(){
        return (tamanho == 0);
    }

    //faz o push na pilha
    public void push(T elemento){
        elementos.add(elemento);
        tamanho++;
    }

    //faz o pop na pilha. Caso esteja vazia, lança uma exception
    public T pop() throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T elemento = elementos.remove(tamanho - 1);
        tamanho--;
        return elemento;
    }
}
