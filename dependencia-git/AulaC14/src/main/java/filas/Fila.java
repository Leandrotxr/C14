package filas;

import musicas.Musica;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Fila<Musica> {

    private List<Musica> playlist = new ArrayList<>();

    public int size() {
        return playlist.size();
    }

    public boolean filaVazia() {
        return playlist.isEmpty();
    }

    public void enfileirar(Musica musica) {
        playlist.add(musica);
    }

    public Musica removerFila()  throws NoSuchElementException {
        if (filaVazia()) {
            throw new NoSuchElementException();
        }
        return playlist.remove(0);
    }

    public Musica getMusica(int index) throws NoSuchElementException {
        if (filaVazia()) {
            throw new NoSuchElementException();
        }
        return playlist.get(index);
    }

    public void showFila() {
        System.out.println("Elementos da fila:");
        for (Musica musica : playlist) {
            System.out.println(musica);
        }
    }
}
