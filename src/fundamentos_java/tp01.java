package fundamentos_java;

import java.util.Scanner;

public class tp01 {

	public static final int EOF = 100;

	private static String[] nomes;
	private static float[] av1;
	private static float[] av2;

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String menu = "";
		nomes = new String[EOF];
		av1 = new float[EOF];
		av2 = new float[EOF];
		
		int ponteiro = 0;
		
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
				if(ponteiro < EOF) {
					
					System.out.print("Entre com o Nome do Aluno : ");
					nomes[ponteiro] = in.next();
					
					System.out.print("Entre com a nota da Av1 : ");
					av1[ponteiro] = in.nextFloat();
					
					System.out.print("Entre com a nota da Av2 : ");
					av2[ponteiro] = in.nextFloat();
					
					
				}else {
					
					System.out.println("Não é possível novo cadastramento - EOF");
					
				}
				
				ponteiro++;
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
