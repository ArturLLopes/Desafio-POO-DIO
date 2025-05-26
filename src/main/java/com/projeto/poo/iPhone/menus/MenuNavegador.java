package com.projeto.poo.iPhone.menus;

import com.projeto.poo.iPhone.IPhone;

import java.util.Scanner;

public class MenuNavegador {

    public static void exibir(Scanner scanner, IPhone iphone) {
        int opcao;
        do {
            System.out.println("\n--- Menu do Navegador ---");
            System.out.println("1 - Exibir Página");
            System.out.println("2 - Nova Aba");
            System.out.println("3 - Atualizar Página");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    iphone.exibirPagina(url);
                }
                case 2 -> iphone.adicionarNovaAba();
                case 3 -> iphone.atualizarPagina();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
