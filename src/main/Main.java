package main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try {

			System.out.println("Bem Vindo a sua Calculadora Pessoal!");
			double constante, variavel;
			String operacao = "9999999";
			Scanner scan = new Scanner(System.in);
			System.out.println("Como usar:");
			System.out.println("1-Digite seu primeiro valor");
			System.out.println("Digite Enter");
			System.out.println("2-Digite sua operacao");
			System.out.println("Digite Enter");
			System.out.println("3-Digite seu segundo valor (Se houver");
			System.out.println("Digite enter novamente");
			System.out.println("4-Repita quantas vezes quiser");
			System.out.println("5-Quando quiser parar digite sinal de igual(=)");

			System.out.println();
			System.out.println("|| Soma (+) || Subtração (-) || Multiplicação (*) || Divisão (/) ||");
			System.out.println();
			System.out.println("|| Potenciação (^) || Raíz Quadrada (v) || Cosseno (cos) || Seno (sen) || ");
			System.out.println();
			System.out.println("|| Tangente (tan) || Logaritmo (log) || Módulo (mod) ||");
			System.out.println();

			System.out.println("OBS - Para Operações Trigonométricas, Digite o valor considerando em Radianos");
			System.out.println();
			System.out.println("OBS2 - Para Números com Casas Decimais, utilize o Ponto (.) como Separador (ex: 9.1)");

			constante = scan.nextDouble();
			while (operacao.charAt(0) != '=') {
				operacao = scan.next();
				if (operacao.charAt(0) != '=') {

					if (operacao.charAt(0) == '+') {
						variavel = scan.nextDouble();
						constante += variavel;
					} else if (operacao.charAt(0) == '-') {
						variavel = scan.nextDouble();
						constante -= variavel;
					} else if (operacao.charAt(0) == '*') {
						variavel = scan.nextDouble();
						constante *= variavel;
					} else if (operacao.charAt(0) == '/') {
						variavel = scan.nextDouble();
						constante /= variavel;
					} else if (operacao.charAt(0) == '^') {
						variavel = scan.nextDouble();
						Math.pow(constante, variavel);
					} else if (operacao.charAt(0) == 'v') {
						constante = Math.sqrt(constante);
					} else if (operacao.charAt(0) == 'c' && operacao.charAt(1) == 'o' && operacao.charAt(2) == 's') {
						constante = Math.cos(constante);
					} else if (operacao.charAt(0) == 's' && operacao.charAt(1) == 'e' && operacao.charAt(2) == 'n') {
						constante = Math.sin(constante);
					} else if (operacao.charAt(0) == 't' && operacao.charAt(1) == 'a' && operacao.charAt(2) == 'n') {
						constante = Math.tan(constante);
					} else if (operacao.charAt(0) == 'l' && operacao.charAt(1) == 'o' && operacao.charAt(2) == 'g') {
						constante = Math.log(constante);
					} else if (operacao.charAt(0) == 'm' && operacao.charAt(1) == 'o' && operacao.charAt(2) == 'd') {
						constante = Math.abs(constante);
					} else {
						System.out.println("Simbolo de operacao invalido, digite novamente o sinal");
					}
					System.out.println(constante);

				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Simbolo Invalido!");
		}
	}
}
