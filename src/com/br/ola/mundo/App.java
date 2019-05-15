package com.br.ola.mundo;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("ola mundo");
		Scanner entrada = new Scanner(System.in);
		int max = entrada.nextInt();
		int min = entrada.nextInt();
		
		int total = (max + min)/ entrada.nextInt();
		System.out.println("a media segura e:" + total);

	}
}
