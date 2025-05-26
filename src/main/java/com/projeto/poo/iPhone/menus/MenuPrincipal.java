package com.projeto.poo.iPhone.menus;

import com.projeto.poo.iPhone.IPhone;

import java.util.Scanner;

public class MenuPrincipal {
    public static void exibir(IPhone iphone) {

    Scanner scanner = new Scanner(System.in);
    int opcao;

        do {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1 - Músicas");
        System.out.println("2 - Chamadas de Voz");
        System.out.println("3 - Navegador");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1 -> MenuMusica.exibir(scanner, iphone);
            case 2 -> MenuChamadas.exibir(scanner, iphone);
            case 3 -> MenuNavegador.exibir(scanner, iphone);
            case 0 -> System.out.println("Encerrando o programa...");
            default -> System.out.println("Opção inválida!");
        }

    } while (opcao != 0);
}
}
