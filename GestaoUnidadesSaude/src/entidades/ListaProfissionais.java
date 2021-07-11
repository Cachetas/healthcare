package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaProfissionais extends Profissional{
	
		//Criação de uma Lista
		public ArrayList<Profissional> listaProfissionais = new ArrayList<>();	
		private int tamanhoLP;

		Scanner sc = new Scanner(System.in);
		
		public ListaProfissionais() {
		}

		public ArrayList<Profissional> getListaProfissionais() {
				for (int i = 0; i <= 100; i++) {
					System.out.println();	
				}
				int contador = 0;
				for (Profissional listar: listaProfissionais) {
				contador = contador + 1;
				
				System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
				System.out.println("|                                             |");
				System.out.println("  Número de Profissional: " + listar.getNumProfissional());
				System.out.println("|                                             |");
				System.out.println("  Número Cartão Cidadão: " + listar.getNumCCP());
				System.out.println("|                                             |");
				System.out.println("  Nome: " + listar.getNomeProfissional());
				System.out.println("|                                             |");
				System.out.println("  Categoria: " + listar.getCategoria());
				System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");
				}
				System.out.println("\n" + contador + " Profissionais registados\n");
			
				return listaProfissionais;
		}
		
		public void setListaProfissionais(Profissional novoProfissional) {
			listaProfissionais.add(novoProfissional);
		}
		
		public void remProfissional(int numCCP){
			boolean pesquisaProfissional = false;
			for (Iterator<Profissional> listarP = listaProfissionais.iterator(); listarP.hasNext();) {
				
				//Iteração da lista "listaServicos" e verifica se o numero de CC existe na lista
					Profissional elemento = listarP.next();
					int comparaU = elemento.getNumCCP();
					if (comparaU == numCCP) {
						//Servico elemento = listaServicos;
						pesquisaProfissional = true;
						
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						
						System.out.println("            - Profissional encontrado -            ");
						System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
						System.out.println("|                                             |");
						System.out.println("  Nº de Profissional: " + elemento.getNumProfissional());
						System.out.println("|                                             |");
						System.out.println("  Número de Cartão de Cidadão: " + elemento.getNumCCP());
						System.out.println("|                                             |");
						System.out.println("  Nome de Profissional: " + elemento.getNomeProfissional());
						System.out.println("|                                             |");
						System.out.println("  Categoria: " + elemento.getCategoria());
						System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _| ");
						
						System.out.println("\nPretende remover este Profissional?");
						System.out.println("[s/n]? ->");
						String opcaoRemoverProfissional = sc.nextLine();
												
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						
						if (opcaoRemoverProfissional.equals("s")) {
							listarP.remove();
							System.out.println("\nProfissional removido");
						} else {
							System.out.println("Profissional não foi removido\n");
						}
					}
					
				}
			
				if (pesquisaProfissional != true) {
					
					System.out.println("Profissional não está registado.\n");
				}
		}
		
		public int getTamanhoLista() {
			
			tamanhoLP = listaProfissionais.size() + 1;
				return tamanhoLP;
			}
}