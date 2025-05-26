package com.projeto.poo.iPhone.menus;

import com.projeto.poo.iPhone.IPhone;

import java.util.Scanner;

public class MenuChamadas {

    public static void exibir(Scanner scanner, IPhone iphone) {
        int opcao;
        do {
            System.out.println("\n--- Menu de Chamadas ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Correio de Voz");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.nextLine();
                    iphone.ligar(numero);
                }
                case 2 -> iphone.atender();
                case 3 -> iphone.iniciarCorreioVoz();
                case 0 -> System.out.println("Voltando ao menu principal...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
}
