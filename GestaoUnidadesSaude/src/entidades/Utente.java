package entidades;

import java.util.Scanner;

public class Utente extends Servico{
	
	private int numUtente;
	private int numCCU; //Numero de CCU (Cartão de Cidadao Utente) 
	private String nomeUtente;
	private int idade;
	private String faixaEtaria;

	private Scanner sc = new Scanner(System.in);
	
	
	/* Construtor */

	public Utente() {
		
	}
	
	public void adUtente(int numCCU, int numUtente) {
		//Valores de atributos recebidos pela aplicação 
		this.numCCU = numCCU; //atributo numero de cartao de cidadao
		this.numUtente = numUtente; //atributo numero de utente
			
		//Inicio de registo de Utente
		System.out.println("\n- Resgisto de Utente -");
		System.out.println("Número de Utente: " + numUtente + "\n");
			
		System.out.println("Nome do Utente");
		System.out.println("Introduza o Primeiro Nome: ");
		String primeiroNome;
		primeiroNome = sc.next();
		System.out.println("Introduza o Último Nome: ");
		String ultimoNome;
		ultimoNome = sc.next();
		nomeUtente = primeiroNome + " " + ultimoNome;
			
		//Introducao da idade de Utente
		System.out.println("Introduza idade do Utente: ");
		idade = sc.nextInt();	
			
		//Condições para atribuir Faixa Etaria
		if (idade<18) {
			faixaEtaria = "Jovem";
				
		} else if( idade > 64) {	
			faixaEtaria = "Idoso";
				
		} else {
			faixaEtaria = "Adulto";						
		}

		for (int i = 0; i <= 100; i++) {
			System.out.println();	
		}
		System.out.println("Utente criado\n");			
	}//Fim de registo de Utente
	
	
	//Getter para obter valores dos atributos
	public int getNumCCU() {
		return numCCU;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public int getNumUtente() {
		return numUtente;
	}
		
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
}