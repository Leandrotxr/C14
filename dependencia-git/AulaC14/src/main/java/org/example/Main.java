package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

import filas.Fila;
import musicas.Musica;

public class Main {
    public static void main(String[] args) {
        // Lista de músicas
        Fila<Musica> fila = new Fila<>();
        Musica m1 = new Musica("Bohemian Rhapsody", "5:55");
        Musica m2 = new Musica("Hotel California", "6:30");
        Musica m3 = new Musica("Smells Like Teen Spirit", "5:01");
        Musica m4 = new Musica("Scar Tissue", "3:35");
        Musica m5 = new Musica("Stairway to Heaven", "8:00");

        fila.enfileirar(m1);
        fila.enfileirar(m2);
        fila.enfileirar(m3);
        fila.enfileirar(m4);
        fila.enfileirar(m5);

        // Criar objeto Gson (com indentação bonita)
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Converter lista para JSON
        String json = gson.toJson(fila);

        // Salvar em arquivo
        try (FileWriter writer = new FileWriter("musicas.json")) {
            writer.write(json);
            System.out.println("Arquivo musicas.json gerado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 👉 Mostrar o JSON na tela
        System.out.println("Conteúdo do JSON gerado:");
        System.out.println(json);
    }
}
