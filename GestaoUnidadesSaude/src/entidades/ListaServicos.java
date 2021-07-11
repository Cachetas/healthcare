package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaServicos extends Servico {

	//Cria��o de uma Lista
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
		System.out.println("  N� de Servi�o: " + listar.getIdServico());
		System.out.println("|                                             |");
		System.out.println("  Nome Servi�o: " + listar.getNomeServico());
		System.out.println("|                                             |");
		String nomeProfissional = listar.getNomeProfissional();
		int numProfissional = listar.getNumProfissional();
		String categoria = listar.getCategoria();
		if (nomeProfissional != null) {
			//incompleto
			System.out.println("  N� de Profissional: " + numProfissional);
			System.out.println("|                                             |");

			System.out.println("  Nome de Profissional: " + nomeProfissional);
			System.out.println("|                                             |");
			System.out.println("  Categoria: " + categoria);
			System.out.println("|                                             |");

		}

		System.out.println("  N� Utente: " + listar.getNumUtente());
		System.out.println("|                                             |");
		System.out.println("  Nome Utente: " + listar.getNomeUtente());
		System.out.println("|                                             |");
		System.out.println("  Faixa Et�ria: " + listar.getFaixaEtaria());
		System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");
	}
	System.out.println("\n" + contador + " Servi�o(s) registado(s)\n");

	return listaServicos;
}

public void setListaServicos(Servico novoServico) {
	listaServicos.add(novoServico);
}

//public void remServico(int idServico, String nomeServico, int numUtente, int numCCU, String nomeUtente, String faixaEtaria, int numProfissional, String nomeProfissional, String categoria) {
public void remServico(int numCCU) {
	boolean pesquisaServico = false;
	for (Iterator<Servico> listarS = listaServicos.iterator(); listarS.hasNext();) {

		//Itera��o da lista "listaServicos" e verifica se o numero de CC existe na lista
		Servico elemento = listarS.next();
		int comparaU = elemento.getNumCCU();
		if (comparaU == numCCU) {
			pesquisaServico = true;

			for (int i = 0; i <= 100; i++) {
				System.out.println();	
			}

			System.out.println("            - Servi�o encontrado -            ");
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println("|                                             |");
			System.out.println("  N� de Servi�o: " + elemento.getIdServico());
			System.out.println("|                                             |");
			System.out.println("  Nome Servi�o: " + elemento.getNomeServico());
			System.out.println("|                                             |");
			System.out.println("  N� de Profissional: " + elemento.getNumProfissional());
			System.out.println("|                                             |");
			System.out.println("  Nome de Profissional: " + elemento.getNomeProfissional());
			System.out.println("|                                             |");
			System.out.println("  N� Utente: " + elemento.getNumUtente());
			System.out.println("|                                             |");
			System.out.println("  Nome Utente: " + elemento.getNomeUtente());
			System.out.println("|                                             |");
			System.out.println("  Faixa Et�ria: " + elemento.getFaixaEtaria());
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
				System.out.println("Nenhum Servi�o n�o foi removido");
			}
			System.out.println("\n" + contador + " Servi�o(s) removido(s)");
		}
	}

	if (pesquisaServico != true) {

		System.out.println("Utente sem servi�os registados.");
	}
}

public void listarServicosU(int numCCU) {

	for (Iterator<Servico> listarSU = listaServicos.iterator(); listarSU.hasNext();) {

		//Itera��o da lista "listaServicos" e verifica se o numero de CC existe na lista
		Servico elementoSU = listarSU.next();
		int comparaU = elementoSU.getNumCCU();
		if (comparaU == numCCU) {

			System.out.println("            - Servi�o encontrado -            ");
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println("|                                             |");
			System.out.println("  N� de Servi�o: " + elementoSU.getIdServico());
			System.out.println("|                                             |");
			System.out.println("  Nome Servi�o: " + elementoSU.getNomeServico());
			System.out.println("|                                             |");
			System.out.println("  N� de Profissional: " + elementoSU.getNumProfissional());
			System.out.println("|                                             |");
			System.out.println("  Nome de Profissional: " + elementoSU.getNomeProfissional());
			System.out.println("|                                             |");
			System.out.println("  N� Utente: " + elementoSU.getNumUtente());
			System.out.println("|                                             |");
			System.out.println("  Nome Utente: " + elementoSU.getNomeUtente());
			System.out.println("|                                             |");
			System.out.println("  Faixa Et�ria: " + elementoSU.getFaixaEtaria());
			System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");

			contadorSU = contadorSU + 1;
		}
	}

	if (contadorSU != 0) {

		System.out.println("\n" + contadorSU + " Servi�o(s) registado(s)\n");
		contadorSU = 0;
	} else {
		System.out.println("Utente sem servi�os registados.\n");
	}
}

public void listarServicosP(int numCCP) {

	for (Iterator<Servico> listarSP = listaServicos.iterator(); listarSP.hasNext();) {

		//Itera��o da lista "listaServicos" e verifica se o numero de CC existe na lista
		Servico elementoSP = listarSP.next();
		int comparaP = elementoSP.getNumCCP();
		if (comparaP == numCCP) {

			System.out.println("            - Servi�o encontrado -            ");
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println("|                                             |");
			System.out.println("  N� de Servi�o: " + elementoSP.getIdServico());
			System.out.println("|                                             |");
			System.out.println("  Nome Servi�o: " + elementoSP.getNomeServico());
			System.out.println("|                                             |");
			System.out.println("  N� de Profissional: " + elementoSP.getNumProfissional());
			System.out.println("|                                             |");
			System.out.println("  Nome de Profissional: " + elementoSP.getNomeProfissional());
			System.out.println("|                                             |");
			System.out.println("  N� Utente: " + elementoSP.getNumUtente());
			System.out.println("|                                             |");
			System.out.println("  Nome Utente: " + elementoSP.getNomeUtente());
			System.out.println("|                                             |");
			System.out.println("  Faixa Et�ria: " + elementoSP.getFaixaEtaria());
			System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");

			contadorSP = contadorSP + 1;
		}
	}

	if (contadorSP != 0) {

		System.out.println("\n" + contadorSP + " Servi�o(s) registado(s)\n");
		contadorSP = 0;
	} else {
		System.out.println("Profissional sem servi�os registados.\n");
	}
}

public int getTamanhoLista() {	
	tamanhoLS = listaServicos.size() + 1;
	return tamanhoLS;
}

}

