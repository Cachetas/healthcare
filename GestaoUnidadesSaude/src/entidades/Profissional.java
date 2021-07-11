package entidades;


import java.util.Scanner;

public class Profissional {
	
	private int numCCP; //Numero de CCP (Cartão de Cidadão Profissional) 
	private int numProfissional;

	private String nomeProfissional;
	private String categoria;
	
	int numEquipa;
	int numIntegrantes;
	
	
	Scanner sc = new Scanner(System.in);
	
	/* Construtores */
	public Profissional(/*String nomeProfissional, int numProfissional*/) {
		//super();
		//this.nomeProfissional = nomeProfissional;
		//this.numProfissional = numProfissional;
	}

	
	public void adProfissional(int numCCP, int numProfissional) {
		//Valores de atributos recebidos pela aplicação 
				this.numCCP = numCCP; //atributo numero de cartao de cidadao
				this.numProfissional = numProfissional; //atributo numero de Profissinal
					
					
				//Inicio de registo de Profissional
				System.out.println("\n- Resgisto de Profissional -");
				System.out.println("Número de Profissional: " + numProfissional + "\n");
					
				System.out.println("Nome do Profissional");
				System.out.println("Introduza o Primeiro Nome: ");
				String primeiroNome;
				primeiroNome = sc.next();
				System.out.println("Introduza o Último Nome: ");
				String ultimoNome;
				ultimoNome = sc.next();
				nomeProfissional = primeiroNome + " " + ultimoNome;
					
					
				//Introducao da Categoria de Profissional
				boolean escolhaCategoria = false;
				while (escolhaCategoria == false) {
					System.out.println("Escolha entre [1,2,3] apenas:");
					System.out.println("1 -> Médico");
					System.out.println("2 -> Enfermeiro");
					System.out.println("3 -> Auxiliar");
					System.out.println("Introduza a categoria do Profissional: ");
					int opcaoCategoria = sc.nextInt();	
					
					
					//Condições para atribuir Faixa Etaria
					if (opcaoCategoria == 1) {
						categoria = "Médico";
						escolhaCategoria = true;
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						System.out.println("Profissional criado\n");
						
					
					} else if( opcaoCategoria == 2) {	
						categoria = "Enfermeiro";
						escolhaCategoria = true;
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						System.out.println("Profissional criado\n");
						
					
					} else if (opcaoCategoria == 3){
						categoria = "Auxiliar";
						escolhaCategoria = true;
						
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						
						System.out.println("Profissional criado\n");
						
					}else if (opcaoCategoria != 1 && opcaoCategoria != 2 && opcaoCategoria != 3){
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						System.out.println("Opção " + opcaoCategoria + " é inválida\n");

					}

				}
					

		
	}
	/* Getter and Setters */

	public int getNumProfissional() {
		return numProfissional;
	}

	public int getNumCCP() {
		return numCCP;
	}
	public String getNomeProfissional() {
		return nomeProfissional;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public int getNumEquipa(){
		return numEquipa;
	}
	
	public int getNumIntegrantes() {
		return numIntegrantes;
	}


	

}
