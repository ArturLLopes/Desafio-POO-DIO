package com.projeto.poo.iPhone;

import com.projeto.poo.iPhone.interfaces.IPhoneInterface.ReprodutorMusical;

import static com.projeto.poo.iPhone.interfaces.IPhoneInterface.*;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String musicaSelecionada;

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void tocar() {
        if (musicaSelecionada == null || musicaSelecionada.isEmpty()) {
            System.out.println("Nenhuma música selecionada. Selecione uma música antes de tocar.");
        } else {
            System.out.println("Tocando: " + musicaSelecionada);
        }
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaSelecionada = musica;
        System.out.println("Selecionando a música: " + musica);
    }
}
