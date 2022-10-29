package br.edu.infnet.tp01;

import java.util.Locale;
import java.util.Scanner;

public class tp01 {

	public static final int EOF = 100;

	private static String[] nomes;
	private static float[] av1;
	private static float[] av2;
	private static int ponteiro = 0;

	public static String resultado(float media) {
		String mensagem = "";

		if (media >= 7) {
			mensagem = " DML ";

		} else if (media >= 4 && media < 7) {
			mensagem = " ND ";
		} else {
			mensagem = " Reprovado por aproveitamento";
		}

		return mensagem;

	}

	public static float media(float nota1, float nota2) {
		return (nota1 + nota2) / 2;

	}

	public static void imprimir(int id) {
		float media = media(av1[id], av2[id]);

		System.out.printf("Aluno ID # " + id + " - Nome: " + nomes[id] + " - Notas: Av1: " + av1[id] + " - Av2: "
				+ av2[id] + " - Média das Notas: " + media + " - Resultado >>>>> " + resultado(media) + " <<<<<");
		System.out.println();

	}

	public static void imprimir() {
		

		for (int i = 0; i < ponteiro; i++) {
			imprimir(i);
		}
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String menu = "";
		nomes = new String[EOF];
		av1 = new float[EOF];
		av2 = new float[EOF];

		do {

			System.out.println("--------------------------------------------------");
			System.out.println("Selecione a opção desejada.");
			System.out.println(" ");
			System.out.println("[1] Registrar as notas de um novo aluno.");
			System.out.println("[2] Consultar boletim de um aluno.");
			System.out.println("[3] Consultar notas da turma.");
			System.out.println("[4] Sair.");
			System.out.println(" ");
			System.out.println("--------------------------------------------------");

			menu = sc.next();

			switch (menu) {
			case "1":
				if (ponteiro < EOF) {
					sc.nextLine();
					System.out.printf("\nEntre com o Nome do Aluno : \n");
					nomes[ponteiro] = sc.nextLine();

					System.out.printf("Entre com a nota da Av1 : \n");
					av1[ponteiro] = sc.nextFloat();

					System.out.printf("Entre com a nota da Av2 : \n");
					av2[ponteiro] = sc.nextFloat();

				} else {

					System.out.println("Não é possível novo cadastramento - EOF");

				}

				ponteiro++;
				break;

			case "2":
				System.out.print("Entre com o ID# do Aluno :");
				int aluno = sc.nextInt();

				if (aluno >= 0 && aluno <= ponteiro) {
					imprimir(aluno);
				} else {
					System.out.println("Forneça corretamente o ID# do Aluno!");
				}
				break;
			case "3":
				imprimir();
				break;
			case "4":
				System.out.println("Até a próxima Rodribot !!!");
				break;

			default:
				break;
			}

		} while (!"4".equalsIgnoreCase(menu));

		sc.close();

	}

}
