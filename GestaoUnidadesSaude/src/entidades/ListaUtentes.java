package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaUtentes extends Utente {
	
	//Criação de uma Lista
	public ArrayList<Utente> listaUtentes = new ArrayList<>();	
	private int tamanhoLU;

	Scanner sc = new Scanner(System.in);
	
	/* Construtor */
	public ListaUtentes() {
	}

	public ArrayList<Utente> getListaUtentes() {
			for (int i = 0; i <= 100; i++) {
				System.out.println();	
			}
			int contador = 0;
			for (Utente listar: listaUtentes) {
			contador = contador + 1;
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println("|                                             |");
			System.out.println("  Número de Utente: " + listar.getNumUtente());
			System.out.println("|                                             |");
			System.out.println("  Número Cartão Cidadão: " + listar.getNumCCU());
			System.out.println("|                                             |");
			System.out.println("  Nome: " + listar.getNomeUtente());
			System.out.println("|                                             |");
			System.out.println("  Faixa Etária: " + listar.getFaixaEtaria());
			System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");
			}
			System.out.println("\n" + contador + " Utente(s) registado(s)\n");
		
			return listaUtentes;
	}
	
	public void setListaUtentes(Utente novoUtente) {
		listaUtentes.add(novoUtente);
	}
	
	public int getTamanhoLista() {
		
		tamanhoLU = listaUtentes.size() + 1;
			return tamanhoLU;
		}
}