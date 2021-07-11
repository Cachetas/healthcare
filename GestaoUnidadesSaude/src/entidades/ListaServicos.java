package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaServicos extends Servico {

	//Criação de uma Lista
	public ArrayList<Servico> listaServicos = new ArrayList<>();	
	private int tamanhoLS;
	private int contadorSU = 0;
	private int contadorSP = 0;

	Scanner sc = new Scanner(System.in);

	/* Construtor */
	public ListaServicos() {
	}

public ArrayList<Servico> getListaServicos() {

	for (int i = 0; i <= 100; i++) {
		System.out.println();	
	}
	int contador = 0;

	for (Servico listar: listaServicos) {
		contador = contador + 1;
		System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("|                                             |");
		System.out.println("  Nº de Serviço: " + listar.getIdServico());
		System.out.println("|                                             |");
		System.out.println("  Nome Serviço: " + listar.getNomeServico());
		System.out.println("|                                             |");
		String nomeProfissional = listar.getNomeProfissional();
		int numProfissional = listar.getNumProfissional();
		String categoria = listar.getCategoria();
		if (nomeProfissional != null) {
			//incompleto
			System.out.println("  Nº de Profissional: " + numProfissional);
			System.out.println("|                                             |");

			System.out.println("  Nome de Profissional: " + nomeProfissional);
			System.out.println("|                                             |");
			System.out.println("  Categoria: " + categoria);
			System.out.println("|                                             |");

		}

		System.out.println("  Nº Utente: " + listar.getNumUtente());
		System.out.println("|                                             |");
		System.out.println("  Nome Utente: " + listar.getNomeUtente());
		System.out.println("|                                             |");
		System.out.println("  Faixa Etária: " + listar.getFaixaEtaria());
		System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");
	}
	System.out.println("\n" + contador + " Serviço(s) registado(s)\n");

	return listaServicos;
}

public void setListaServicos(Servico novoServico) {
	listaServicos.add(novoServico);
}

//public void remServico(int idServico, String nomeServico, int numUtente, int numCCU, String nomeUtente, String faixaEtaria, int numProfissional, String nomeProfissional, String categoria) {
public void remServico(int numCCU) {
	boolean pesquisaServico = false;
	for (Iterator<Servico> listarS = listaServicos.iterator(); listarS.hasNext();) {

		//Iteração da lista "listaServicos" e verifica se o numero de CC existe na lista
		Servico elemento = listarS.next();
		int comparaU = elemento.getNumCCU();
		if (comparaU == numCCU) {
			pesquisaServico = true;

			for (int i = 0; i <= 100; i++) {
				System.out.println();	
			}

			System.out.println("            - Serviço encontrado -            ");
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println("|                                             |");
			System.out.println("  Nº de Serviço: " + elemento.getIdServico());
			System.out.println("|                                             |");
			System.out.println("  Nome Serviço: " + elemento.getNomeServico());
			System.out.println("|                                             |");
			System.out.println("  Nº de Profissional: " + elemento.getNumProfissional());
			System.out.println("|                                             |");
			System.out.println("  Nome de Profissional: " + elemento.getNomeProfissional());
			System.out.println("|                                             |");
			System.out.println("  Nº Utente: " + elemento.getNumUtente());
			System.out.println("|                                             |");
			System.out.println("  Nome Utente: " + elemento.getNomeUtente());
			System.out.println("|                                             |");
			System.out.println("  Faixa Etária: " + elemento.getFaixaEtaria());
			System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");

			System.out.println("\nPretende remover este servico?");
			System.out.println("[s/n]? ->");
			String opcaoRemoverServico = sc.nextLine();

			for (int i = 0; i <= 100; i++) {
				System.out.println();	
			}
			int contador = 0;
			if (opcaoRemoverServico.equals("s")) {
				contador = contador + 1;
				listarS.remove();
				
			}else if(contador == 0){
				System.out.println("Nenhum Serviço não foi removido");
			}
			System.out.println("\n" + contador + " Serviço(s) removido(s)");
		}
	}

	if (pesquisaServico != true) {

		System.out.println("Utente sem serviços registados.");
	}
}

public void listarServicosU(int numCCU) {

	for (Iterator<Servico> listarSU = listaServicos.iterator(); listarSU.hasNext();) {

		//Iteração da lista "listaServicos" e verifica se o numero de CC existe na lista
		Servico elementoSU = listarSU.next();
		int comparaU = elementoSU.getNumCCU();
		if (comparaU == numCCU) {

			System.out.println("            - Serviço encontrado -            ");
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println("|                                             |");
			System.out.println("  Nº de Serviço: " + elementoSU.getIdServico());
			System.out.println("|                                             |");
			System.out.println("  Nome Serviço: " + elementoSU.getNomeServico());
			System.out.println("|                                             |");
			System.out.println("  Nº de Profissional: " + elementoSU.getNumProfissional());
			System.out.println("|                                             |");
			System.out.println("  Nome de Profissional: " + elementoSU.getNomeProfissional());
			System.out.println("|                                             |");
			System.out.println("  Nº Utente: " + elementoSU.getNumUtente());
			System.out.println("|                                             |");
			System.out.println("  Nome Utente: " + elementoSU.getNomeUtente());
			System.out.println("|                                             |");
			System.out.println("  Faixa Etária: " + elementoSU.getFaixaEtaria());
			System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");

			contadorSU = contadorSU + 1;
		}
	}

	if (contadorSU != 0) {

		System.out.println("\n" + contadorSU + " Serviço(s) registado(s)\n");
		contadorSU = 0;
	} else {
		System.out.println("Utente sem serviços registados.\n");
	}
}

public void listarServicosP(int numCCP) {

	for (Iterator<Servico> listarSP = listaServicos.iterator(); listarSP.hasNext();) {

		//Iteração da lista "listaServicos" e verifica se o numero de CC existe na lista
		Servico elementoSP = listarSP.next();
		int comparaP = elementoSP.getNumCCP();
		if (comparaP == numCCP) {

			System.out.println("            - Serviço encontrado -            ");
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println("|                                             |");
			System.out.println("  Nº de Serviço: " + elementoSP.getIdServico());
			System.out.println("|                                             |");
			System.out.println("  Nome Serviço: " + elementoSP.getNomeServico());
			System.out.println("|                                             |");
			System.out.println("  Nº de Profissional: " + elementoSP.getNumProfissional());
			System.out.println("|                                             |");
			System.out.println("  Nome de Profissional: " + elementoSP.getNomeProfissional());
			System.out.println("|                                             |");
			System.out.println("  Nº Utente: " + elementoSP.getNumUtente());
			System.out.println("|                                             |");
			System.out.println("  Nome Utente: " + elementoSP.getNomeUtente());
			System.out.println("|                                             |");
			System.out.println("  Faixa Etária: " + elementoSP.getFaixaEtaria());
			System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");

			contadorSP = contadorSP + 1;
		}
	}

	if (contadorSP != 0) {

		System.out.println("\n" + contadorSP + " Serviço(s) registado(s)\n");
		contadorSP = 0;
	} else {
		System.out.println("Profissional sem serviços registados.\n");
	}
}

public int getTamanhoLista() {	
	tamanhoLS = listaServicos.size() + 1;
	return tamanhoLS;
}

}

