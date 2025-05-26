package com.projeto.poo.iPhone.menus;

import com.projeto.poo.iPhone.IPhone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMusica {
    public static void exibir(Scanner scanner, IPhone iphone) {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- Menu de Músicas ---");
            System.out.println("1 - Tocar");
            System.out.println("2 - Pausar");
            System.out.println("3 - Selecionar Música");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1 -> iphone.tocar();
                    case 2 -> iphone.pausar();
                    case 3 -> {
                        System.out.print("Digite o nome da música: ");
                        String musica = scanner.nextLine().trim();
                        if (musica.isEmpty()) {
                            System.out.println("Nome da música não pode ser vazio!");
                        } else {
                            iphone.selecionarMusica(musica);
                        }
                    }
                    case 0 -> System.out.println("Voltando ao menu principal...");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.nextLine();
            }
        }
    }
}
