package com.projeto.poo;

import com.projeto.poo.iPhone.IPhone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Telefone {

	public static void main(String[] args) {
		SpringApplication.run(Telefone.class, args);
		IPhone iphone = new IPhone();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n=== MENU iPhone ===");
			System.out.println("1 - Tocar música");
			System.out.println("2 - Pausar música");
			System.out.println("3 - Selecionar música");
			System.out.println("4 - Ligar para um número");
			System.out.println("5 - Atender chamada");
			System.out.println("6 - Iniciar correio de voz");
			System.out.println("7 - Exibir página da internet");
			System.out.println("8 - Adicionar nova aba");
			System.out.println("9 - Atualizar página");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
				case 1:
					iphone.tocar();
					break;
				case 2:
					iphone.pausar();
					break;
				case 3:
					System.out.print("Digite o nome da música: ");
					String musica = scanner.nextLine();
					iphone.selecionarMusica(musica);
					break;
				case 4:
					System.out.print("Digite o número para ligar: ");
					String numero = scanner.nextLine();
					iphone.ligar(numero);
					break;
				case 5:
					iphone.atender();
					break;
				case 6:
					iphone.iniciarCorreioVoz();
					break;
				case 7:
					System.out.print("Digite a URL: ");
					String url = scanner.nextLine();
					iphone.exibirPagina(url);
					break;
				case 8:
					iphone.adicionarNovaAba();
					break;
				case 9:
					iphone.atualizarPagina();
					break;
				case 0:
					System.out.println("Encerrando o programa...");
					break;
				default:
					System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		scanner.close();
	}
		}



