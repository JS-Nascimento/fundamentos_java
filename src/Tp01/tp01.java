package Tp01;

import java.util.Scanner;

public class tp01 {

	public static final int EOF = 100;

	private static String[] nomes;
	private static float[] av1;
	private static float[] av2;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		String menu = "";
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

			

			menu = in.next();

			switch (menu) {
			case "1":

				break;
			case "2":

				break;
			case "3":

				break;
			case "4":

				break;

			default:
				break;
			}

		} while (!"4".equalsIgnoreCase(menu));
		
		
	in.close();

	}

}
