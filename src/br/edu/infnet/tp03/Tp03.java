package br.edu.infnet.tp03;


import java.io.EOFException;
import java.util.Locale;
import java.util.Scanner;

import br.edu.infnet.tp03.domain.entities.Aluno;
import br.edu.infnet.tp03.domain.entities.Professor;
import br.edu.infnet.tp03.domain.enums.Sexo;
import br.edu.infnet.tp03.exceptions.InvalidFillmentException;


public class Tp03 {



	public static final int EOF = 100;

	private static Aluno[] aluno;
	private static Professor[] professor;



	public static void main(String[] args) throws InvalidFillmentException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String menu = "";
		aluno = new Aluno[EOF];
		professor = new Professor[EOF];
		int ponteiroAluno = 0;
		int ponteiroProfessor = 0;

		try {


			do {

				System.out.println("--------------------------------------------------");
				System.out.println("Selecione a opção desejada.");
				System.out.println(" ");
				System.out.println("[1] Cadastrar Aluno");
				System.out.println("[2] Cadastrar Professor");
				System.out.println("[3] Consultar situação de um docente/discente.");
				System.out.println("[4] Sair.");
				System.out.println(" ");
				System.out.println("--------------------------------------------------");

				menu = sc.next();

				switch (menu) {
				case "1":

					try {


						if (ponteiroAluno < EOF) {



							aluno[ponteiroAluno] = new Aluno();

							aluno[ponteiroAluno].setId(ponteiroAluno);

							sc.nextLine();

							System.out.printf("\nEntre com o Nome do Aluno : ");
							aluno[ponteiroAluno].setNome(sc.nextLine())  ;



							System.out.printf("Entre com o numero do Cpf do Aluno : ");
							aluno[ponteiroAluno].setCpf(sc.nextLine())  ;



							System.out.printf("Entre com o sexo do Aluno : M (masculino) ou  F (feminino) ");

							String sexoString = sc.nextLine();


							if("M".equalsIgnoreCase(sexoString)){
								aluno[ponteiroAluno].setSexo(Sexo.MASCULINO);
							}else if("F".equalsIgnoreCase(sexoString)) {
								aluno[ponteiroAluno].setSexo(Sexo.FEMININO);
							}else {
								throw new InvalidFillmentException("Preencha corretamente a informação solicitada");

							};


							System.out.printf("Entre com a Disciplina matriculada:");
							aluno[ponteiroAluno].setCurso(sc.nextLine())  ;



							System.out.printf("Informe se o Aluno é monitor da Classe: S (sim) ou N (não)");


							String monitoria= sc.nextLine();

							if("S".equalsIgnoreCase(monitoria)){
								aluno[ponteiroAluno].setMonitor(true) ;
							}else if("N".equalsIgnoreCase(monitoria)) {
								aluno[ponteiroAluno].setMonitor(false);
							}else {
								throw new InvalidFillmentException("Preencha corretamente a informação solicitada");

							}



							System.out.println(aluno[ponteiroAluno]);


						} else {

							throw new EOFException("Não é possível novo cadastramento - EOF");

						};

						ponteiroAluno++;
						break;

					} catch (Exception e) {
						System.out.printf(">>>>>>>>> Error <<<<<<<<<<<" + e.getMessage());
						break;
					}

				case "2":

					try {



						if (ponteiroProfessor < EOF) {

							sc.nextLine();

							System.out.printf("\nEntre com o Nome do Professor : ");
							String nome = sc.nextLine() ;



							System.out.printf("Entre com o numero do Cpf do Professor : ");
							String cpf =sc.nextLine();



							System.out.printf("Entre com o sexo do Professor : M (masculino) ou  F (feminino) ");

							String sexoString = sc.nextLine();


							Sexo typeSexo = null;

							if("M".equalsIgnoreCase(sexoString)){
								typeSexo  = Sexo.MASCULINO;
							}else if("F".equalsIgnoreCase(sexoString)) {
								typeSexo  = Sexo.FEMININO;
							}else {
								throw new InvalidFillmentException("Preencha corretamente a informação solicitada");
							};


							System.out.printf("Entre com a Especialidade do Professor : ");
							String especialidade = sc.nextLine();



							System.out.printf("Informe o salário do Professor : ");

							Double salario = sc.nextDouble();


							professor[ponteiroProfessor] = new Professor(ponteiroProfessor, nome , cpf, typeSexo , especialidade, salario);

							System.out.println(professor[ponteiroProfessor]);


						} else {

							throw new EOFException("Não é possível novo cadastramento - EOF");



						}

						ponteiroProfessor++;
						break;

					} catch (Exception e) {
						System.out.printf(">>>>>>>>> Error <<<<<<<<<<<" + e.getMessage());
						break;
					}

				case "3":
					try {

						System.out.printf("O que deseja consultar? digite 1 para Aluno e 2 para Professor : ");

						int opcao = sc.nextInt();

						if (opcao == 1) {

							sc.nextLine();

							System.out.printf("Digite o Código do Aluno : ");
							System.out.println(aluno[sc.nextInt()]);
							break;

						}else if(opcao == 2) {

							sc.nextLine();

							System.out.printf("Digite o Código do Professor : ");
							System.out.println(professor[sc.nextInt()]);
							break;

						}else {
							throw new InvalidFillmentException("Preencha corretamente a informação solicitada");
						}
					} catch (Exception e) {
						System.out.printf(">>>>>>>>> Error <<<<<<<<<<<" + e.getMessage());
						break;
					}

				case "4":
					System.out.println("Obrigado e até logo.");
					break;

				default:
					break;
				}

			} while (!"4".equalsIgnoreCase(menu));

			sc.close();


		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("Até a próxima Rodribot !!!");
		}



	}
}




