package com.projeto.poo;

import com.projeto.poo.iPhone.IPhone;
import com.projeto.poo.iPhone.menus.MenuPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Telefone {

	public static void main(String[] args) {
		SpringApplication.run(Telefone.class, args);
		IPhone iphone = new IPhone();
		MenuPrincipal.exibir(iphone);

	}
}



