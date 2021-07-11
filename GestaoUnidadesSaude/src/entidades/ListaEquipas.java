package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class ListaEquipas{
	
	//Cria��o de uma Lista
	public ArrayList<ArrayList<Profissional>> listaEquipas = new ArrayList<>();	
	
	private int tamanhoLE;
	private int removerProfIndex;
	
	//cria uma variavel ArrayList � = � lista de equipas (lista de listas)
	private ArrayList<ArrayList<Profissional>> LEquipas = listaEquipas;
	Scanner sc = new Scanner(System.in);
	
	public ListaEquipas() {
		
	}
	
	public void verEquipas() {
		
		for (int i = 0; i <= 100; i++) {
			System.out.println();	
		}
						
		
			if (listaEquipas.size() == 0) {
				System.out.println("N�o existem equipas criadas, usa a op��o 1 do menu Equipas\n");
			} else {
			//cria uma variavel ArrayList � = � lista de equipas (lista de listas)
			ArrayList<ArrayList<Profissional>> LEquipas = listaEquipas;
			System.out.println("               - Lista de Equipas -");
			for (int i = 0; i<LEquipas.size(); i++) {
				int numEquipa = i + 1;
				
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
				System.out.println("|                                             |");
				System.out.println("|                 Equipa " + numEquipa);
				System.out.println("|                                             |");
				
				ArrayList<Profissional> equipa = LEquipas.get(i);
				int numIntegrantes = equipa.size();
				System.out.println("| N�mero de integrantes: " + numIntegrantes);
				
				for (int j = 0; j<equipa.size(); j++) {
				Profissional prof = equipa.get(j); 
				
				System.out.println("|                                             |");
				System.out.println("| N�mero de Profissional: " + prof.getNumProfissional());
				
				System.out.println("| Nome: " + prof.getNomeProfissional());
				
				System.out.println("| Categoria: " + prof.getCategoria());
				
				}
				System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|\n");
		}
			}
			
	}
	
public void verEquipa(int numEquipa) {
		
		for (int i = 0; i <= 100; i++) {
			System.out.println();	
		}

			if (listaEquipas.size() == 0) {
				System.out.println("N�o existem equipas criadas, usa a op��o 1 do menu Equipas\n");
			} else {
			//cria uma variavel ArrayList � = � lista de equipas (lista de listas)
			int indexLEquipa = numEquipa - 1;
			ArrayList<Profissional> equipa = LEquipas.get(indexLEquipa);
			System.out.println("                  Equipa " + numEquipa);
			System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.println("|                                             |");
			int numIntegrantes = equipa.size();
			System.out.println("| N�mero de integrantes: " + numIntegrantes);
			for (Profissional prof : equipa) {
				System.out.println("|                                             |");
				System.out.println("| N�mero de Profissional: " + prof.getNumProfissional());
				System.out.println("| Nome: " + prof.getNomeProfissional());
				System.out.println("| Categoria: " + prof.getCategoria());
				}
				System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|\n");
		}
	}
				
	public void adProfEquipa(int numEquipa, int numProf, Profissional prof) {
		for (int i = 0; i <= 100; i++) {
			System.out.println();	
		}
		
		//Subtrair 1 para dar certo com o index (index come�a em 0 (zero))
		int indexEquipa = numEquipa - 1;
		
		//Escolher a equipa com base no index do Array
		ArrayList<Profissional> Equipa = LEquipas.get(indexEquipa);
		boolean pesquisaEquipa = false;
		for (Profissional listarE : Equipa) {
			if (numProf == listarE.getNumProfissional()) {
				
				System.out.println("O profissional n�mero " + numProf + " j� est� na Equipa " + numEquipa);
			pesquisaEquipa = true;
			}
			
		}
		if (pesquisaEquipa== false) {
			LEquipas.get(indexEquipa).add(prof);
			System.out.println("\nProfissional adicionado � equipa n�mero " + numEquipa );
			System.out.println("com sucesso\n");
		}else { 
			System.out.println("Profissional n�o adicionado � equipa\n");
		}
	}

	public void remProfissional(int numEquipa, int numProf) {
			
		int indexLEquipa = numEquipa - 1;
		ArrayList<Profissional> Equipa = LEquipas.get(indexLEquipa);
		
		boolean removerProf = false;
		boolean pesquisaProf = false;
		
		for (Iterator<Profissional> listarEquipa = Equipa.iterator(); listarEquipa.hasNext();) {
			int indexEquipa = 0;
			
			Profissional prof = listarEquipa.next();
			if (numProf == prof.getNumProfissional()) {
				pesquisaProf = true;
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
				System.out.println("|                                             |");
				System.out.println("  N�mero de Profissional: " + prof.getNumProfissional());
				System.out.println("|                                             |");
				System.out.println("  N�mero Cart�o Cidad�o: " + prof.getNumCCP());
				System.out.println("|                                             |");
				System.out.println("  Nome: " + prof.getNomeProfissional());
				System.out.println("|                                             |");
				System.out.println("  Categoria: " + prof.getCategoria());
				System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|\n ");
				
				System.out.println("\nPretende remover este Profissional?");
				System.out.println("[s/n]? ->");
				String opcaoRemoverProfissional = sc.nextLine();
				for (int i = 0; i <= 100; i++) {
					System.out.println();	
				}
										
				if (opcaoRemoverProfissional.equals("s")) {
					removerProf = true;
					removerProfIndex = indexEquipa;
				}
			} 
			indexEquipa++;
		}
		
		if (pesquisaProf == false) {
			
			System.out.println("O Profissional n�mero " + numProf + " n�o se encontra na Equipa " + numEquipa + "\n");
		}
		
		if (removerProf == true) {		
			System.out.println("\nProfissional removido\n");
			Equipa.remove(removerProfIndex);
		} else if (removerProf == false && pesquisaProf == true){
			System.out.println("\nProfissional n�o removido\n");
		}
	}
	
	public int getTamanhoLista() {	
		tamanhoLE = listaEquipas.size() + 1;
		return tamanhoLE;
	}
}
