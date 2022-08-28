package app;

import java.util.Locale;
import java.util.Scanner;

import util.AtualConversao;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Valor do dólar: ");
		double valorDolar = sc.nextDouble();
		System.out.printf("Valor para ser convertido: ");
		double valor = sc.nextDouble();
		
		System.out.println("Valor convertido para real: "+String.format("%.2f", AtualConversao.conversao(valorDolar, valor)));

	}

}
