package entidades;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Scanner;

public class aplicacao {

	//Criação de variavel "lista" do tipo das classes Lista(...)
	private static ListaUtentes listaU = new ListaUtentes();
	private static ListaProfissionais listaP = new ListaProfissionais();
	private static ListaServicos listaS = new ListaServicos();
	protected static ListaEquipas listaE = new ListaEquipas();
	public static void main(String[] args) {
		String nomeServico = null;
		int numProfissional = 0;
		String nomeProfissional = null;
		String categoria = null;
		Scanner sc = new Scanner(System.in);

		
		boolean menuPrincipal = true;

		while (menuPrincipal == true) {
			for (int i = 0; i <= 100; i++) {
				System.out.println();	
			}
			System.out.println("- Menu Principal -\n");
			System.out.println("1 -> Serviços");
			System.out.println("2 -> Utentes");
			System.out.println("3 -> Familias");
			System.out.println("4 -> Profissionais");
			System.out.println("5 -> Equipas");
			System.out.println("0 -> Sair");

			System.out.print("\nIntroduza uma opção: ");
			int opcaoMenu = sc.nextInt();
			for (int i = 0; i <= 100; i++) {
				System.out.println();	
			}

			//Menu Serviços 
			if (opcaoMenu == 1) {
				for (int i = 0; i <= 100; i++) {
					System.out.println();	
				}

				boolean menuServico = true;

				while (menuServico == true) {

					System.out.println("- Menu Serviços -\n");
					System.out.println("1 -> Adicionar Serviço");
					System.out.println("2 -> Ver Serviços");
					System.out.println("3 -> Remover Serviço");
					System.out.println("0 -> Voltar ao menu anterior");

					System.out.print("\nIntroduza uma opção: ");
					int opcaoServico = sc.nextInt();

					//Opção Adicionar Serviço
					if (opcaoServico == 1) {
						Servico novoServico = new Servico();
						for (int i = 0; i <= 100; i++) {
							System.out.println();
						}

						//Introduçao de numero de cartão de cidadão de Utente
						System.out.println("\nIntroduza o número do cartão de cidadão do Utente:");
						int numCCU = sc.nextInt();

						boolean pesquisaUtente = false;
						//Iteração da lista "listaUtentes" e verifica se o numero de CC existe na lista
						for (Utente listarU : listaU.listaUtentes) {

							int comparaU = listarU.getNumCCU();
							if (comparaU == numCCU) {
								pesquisaUtente = true;
								int numUtente = listarU.getNumUtente();
								String nomeUtente = listarU.getNomeUtente();
								String faixaEtaria = listarU.getFaixaEtaria();
								System.out.println("" );
								System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" );
								System.out.println("|                                             |");
								System.out.println("  Número de Utente: " + numUtente				);
								System.out.println("|                                             |");
								System.out.println("  Nome: " + nomeUtente							);
								System.out.println("|                                             |");
								System.out.println("  Faixa Etária: " + faixaEtaria					);
								System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|\n");
								boolean menuTipoServico = true;
								while (menuTipoServico == true) {
									System.out.println("- Tipo de Serviço -\n");
									System.out.println("1 -> Consulta");
									System.out.println("2 -> Cirurgia");
									System.out.println("3 -> Enfermagem");
									System.out.println("\n Introduza uma opção: ");
									int opcaoTipoServico = sc.nextInt();

									if (opcaoTipoServico == 1) {
										nomeServico = "Consulta";
										menuTipoServico = false;
									} else if(opcaoTipoServico == 2) {
										nomeServico = "Cirurgia";
										menuTipoServico = false;
									} else if (opcaoTipoServico == 3) {
										nomeServico = "Enfermagem";
										menuTipoServico = false;
									} else if (menuTipoServico == true) {
										for (int i = 0; i <= 100; i++) {
											System.out.println();
										}
										System.out.println("A opção " + opcaoTipoServico + " não é valida");
									}
									//Fim de While para escolha de tipo de Serviço
								}
								//Introduçao de numero de cartão de cidadão de Profissional
								System.out.println("\nIntroduza o número do cartão de cidadão do Profissional:");
								int numCCP = sc.nextInt();

								boolean pesquisaProfissional = false;
								//Iteração da lista "listaProfissionais" e verifica se o numero de CC existe na lista
								for (Profissional listarP : listaP.listaProfissionais) {
									int comparaP = listarP.getNumCCP();

									if (comparaP == numCCP) {
										pesquisaProfissional = true;
										numProfissional = listarP.getNumProfissional();
										nomeProfissional = listarP.getNomeProfissional();
										categoria = listarP.getCategoria();
									}
								}

								if (pesquisaProfissional != true){
									System.out.println("\nProfissional não está registado");
									System.out.println("Registe o Profissional na opção 3 (Profissionais) do Menu Principal\n");
								}

								if (pesquisaUtente == true && pesquisaProfissional == true) {
									int tamanhoLista = listaS.getTamanhoLista();
									int idServico = tamanhoLista;
									novoServico.adServico(idServico, nomeServico, numUtente, numCCU, nomeUtente, faixaEtaria, numProfissional, numCCP, nomeProfissional, categoria);

									//adicionar Utente à lista
									listaS.setListaServicos(novoServico);	
								}
								//Fim IF de pesquisa de Utente	
							} 
							//Fim de ciclo FOR para novo Serviço	
						}
						if (pesquisaUtente != true){
							System.out.println("\nUtente não está registado");
							System.out.println("Registe o Utente na opção 2 (Utentes) do Menu Principal\n");
						}

						//Opção Ver Serviço
					} else if (opcaoServico == 2) {

						if (listaS.getTamanhoLista() == 0) {
							for (int i = 0; i <= 100; i++) {
								System.out.println();	
							}

							System.out.println("Ainda não foram registados Serviços\n");
							System.out.println("Use a opção 1 do Menu Serviços\n");
						}else {
							listaS.getListaServicos();
						}

						//Opção Remover Serviço
					} else if (opcaoServico == 3) {

						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						//Introduçao de numero de cartão de cidadão de Utente para pesquisa de Serviços a Remover
						System.out.println("\nIntroduza o número do cartão de cidadão do Utente:");
						int numCCU = sc.nextInt();

						listaS.remServico(numCCU);

						//Voltar ao menu anterior
					} else if (opcaoServico == 0) {

						menuServico = false;
					} //Fecha IF Opção 0 Voltar ao Menu Principal  


				}// Fecha While do Menu Servico
			} //Fecha If opção 1 Menu Principal

			//Opção Utente - Inicio Menu Utente
			if (opcaoMenu == 2) {
				for (int i = 0; i <= 100; i++) {
					System.out.println();	
				}

				boolean menuUtente = true;

				while (menuUtente == true) {
					System.out.println("- Menu Utentes -\n");

					System.out.println("1 -> Registar Utente");
					System.out.println("2 -> Listar Utentes");
					System.out.println("3 -> Listar Serviços de Utente");
					System.out.println("0 -> Voltar ao menu anterior");

					System.out.print("\nIntroduza uma opção: ");
					int opcaoUtente = sc.nextInt();

					if (opcaoUtente == 1) {

						//Criação de novo Objecto Utente
						Utente novoUtente = new Utente();
						
						for (int i = 0; i <= 100; i++) {
							System.out.println();
						}
						
						//Introduçao de numero de cartão de cidadão de Utente
						System.out.println("\nIntroduza o número do cartão de cidadão do Utente:");
						int numCCU = sc.nextInt();

						//Iteração da lista "listaUtentes" e verifica se o numero de CC existe na lista
						for (Utente listar : listaU.listaUtentes) {
							int compara = listar.getNumCCU();
							if (compara == numCCU) {
								for (int i = 0; i <= 100; i++) {
									System.out.println();
								}

								System.out.println("O número de cartão de cidadão - " + numCCU + " - já existe\n");
								System.out.println("Utente não criado\n");
								numCCU = 0;
							}

						}
						if (numCCU != 0) {
							//Criação do numero de Utente de forma automatica				
							int tamanhoLista = listaU.getTamanhoLista();
							novoUtente.adUtente(numCCU, tamanhoLista);

							//adicionar Utente à lista
							listaU.setListaUtentes(novoUtente);
						}

						//Opção 2 Menu Utente - Listar Utentes			
					} else if (opcaoUtente == 2) {
						if (listaU.getTamanhoLista() == 0) {
							for (int i = 0; i <= 100; i++) {
								System.out.println();	
							}

							System.out.println("Ainda não foram registados Utentes\n");
							System.out.println("Use a opção 1 do Menu Utentes\n");
						}else {
							listaU.getListaUtentes();
						}
						//Listar Serviços de Utente
					}else if (opcaoUtente == 3) {

						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						//Introduçao de numero de cartão de cidadão de Utente para pesquisa de Serviços de Utente
						System.out.println("\nIntroduza o número do cartão de cidadão do Utente:");
						int numCCU = sc.nextInt();
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						listaS.listarServicosU(numCCU);

						//Sair do Menu Utentes - com 0
					} else if (opcaoUtente == 0) {

						menuUtente = false;
					} //Fecha IF Opção 0 Voltar ao Menu Principal  

				}//Fecha While Opção 2 Menu Utentes - Acaba Menu Utente


				//Opção 3 Menu Principal - Familias - Não implementado
			} else if (opcaoMenu == 3) {
				boolean menuFamilias = true;
				for (int i = 0; i <= 100; i++) {
					System.out.println();	
				}

				while (menuFamilias == true) {

					System.out.println("- Menu Família -\n");

					System.out.println("1 -> Adicionar Família");
					System.out.println("2 -> Ver Família");
					System.out.println("3 -> Listar Serviços Família");
					System.out.println("4 -> Listar Famílias");
					System.out.println("5 -> Adicionar Utente a Família");
					System.out.println("6 -> Remover Utente de Família");
					System.out.println("0 -> Voltar ao menu anterior");

					System.out.println("\nIntroduza uma opção: ");
					int opcaoFamilias = sc.nextInt();
					
					if (opcaoFamilias == 1) {
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						System.out.println("Não implementado\n");
					}
					if (opcaoFamilias == 2) {
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						System.out.println("Não implementado\n");
					}
					if (opcaoFamilias == 3) {
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						System.out.println("Não implementado\n");
					}
					if (opcaoFamilias == 4) {
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						System.out.println("Não implementado\n");
					}
					if (opcaoFamilias == 5) {
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						System.out.println("Não implementado\n");
					}
					if (opcaoFamilias == 6) {
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						System.out.println("Não implementado\n");
					}
					if (opcaoFamilias == 0) {
						menuFamilias = false;
					}
				}


				//Opção 4 Menu Principal - Profissionais

			} else if (opcaoMenu == 4) {
				boolean menuProfissionais = true;
				for (int i = 0; i <= 100; i++) {
					System.out.println();	
				}

				while (menuProfissionais == true) {

					System.out.println("- Menu Profissionais -\n");

					System.out.println("1 -> Registar Profissional");
					System.out.println("2 -> Listar Profissionais");
					System.out.println("3 -> Remover Profissional");
					System.out.println("4 -> Listar Serviços de Profissional");
					System.out.println("0 -> Voltar ao menu anterior");

					System.out.print("\nIntroduza uma opção: ");
					int opcaoProfissionais = sc.nextInt();
					if (opcaoProfissionais == 1) {

						//Criação de novo Objecto Profissonal
						Profissional novoProfissional = new Profissional();
						for (int i = 0; i <= 100; i++) {
							System.out.println();
						}

						//Introduçao de numero de cartão de cidadão de Profissional
						System.out.println("\nIntroduza o número do cartão de cidadão do Profissional:");
						int numCCP = sc.nextInt();

						//Iteração da lista "listaProfissionais" e verifica se o numero de CC existe na lista
						for (Profissional listar : listaP.listaProfissionais) {
							int compara = listar.getNumCCP();
							if (compara == numCCP) {
								for (int i = 0; i <= 100; i++) {
									System.out.println();
								}

								System.out.println("O número de cartão de cidadão - " + numCCP + " - já existe\n");
								System.out.println("Profissional não criado\n");
								numCCP = 0;
							}

						}
						if (numCCP != 0) {
							//Criação do numero de Profissional de forma automatica				
							int tamanhoLista = listaP.getTamanhoLista();
							novoProfissional.adProfissional(numCCP, tamanhoLista);

							//adicionar Profissional à lista
							listaP.setListaProfissionais(novoProfissional);

						}
						//Listar Profissionais
					} else if (opcaoProfissionais == 2) {

						if (listaP.getTamanhoLista() == 0) {
							for (int i = 0; i <= 100; i++) {
								System.out.println();	
							}

							System.out.println("Ainda não foram registados Profissionais\n");
							System.out.println("Use a opção 1 do Menu Profissionais\n");
						}	else {
							listaP.getListaProfissionais();
						}

						//Opção Remover Profissional
					} else if(opcaoProfissionais == 3) {

						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						//Introduçao de numero de cartão de cidadão de Utente para pesquisa de Serviços a Remover
						System.out.println("\nIntroduza o número do cartão de cidadão do Profissional:");
						int numCCP = sc.nextInt();
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}

						listaP.remProfissional(numCCP);

					}else if (opcaoProfissionais == 4) {

						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						//Introduçao de numero de cartão de cidadão de Utente para pesquisa de Serviços de Utente
						System.out.println("\nIntroduza o número do cartão de cidadão do Profissional:");
						int numCCP = sc.nextInt();
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}

						listaS.listarServicosP(numCCP);

						//Sair do Menu Utentes - com 0

						//Voltar ao menu anterior					
					} else if (opcaoProfissionais == 0) {

						menuProfissionais = false;
					}	
				}
				//Menu Equipas
			}else if (opcaoMenu == 5) {

				boolean menuEquipas = true;
				while (menuEquipas == true) {

					System.out.println("- Menu Equipas -\n");

					System.out.println("1 -> Adicionar Equipa");
					System.out.println("2 -> Ver Equipa");
					System.out.println("3 -> Adicionar Profissional a Equipa");
					System.out.println("4 -> Remover Profissional de Equipa");
					System.out.println("0 -> Voltar ao menu anterior");

					System.out.println("\nIntroduza uma opção: ");

					int opcaoEquipas = sc.nextInt();
					//Adicionar Equipa
					if (opcaoEquipas == 1) {

						if (listaP.listaProfissionais.size() == 0) {
							for (int i = 0; i <= 100; i++) {
								System.out.println();	
							}
							System.out.println("Ainda não existem profissionais registados");
							System.out.println("Use a opção 1 do menu Profissionais");
						}else {
							for (int i = 0; i <= 100; i++) {
								System.out.println();	
							}
							System.out.println("Quantos Profissionais pretende inserir na Equipa?");
							System.out.println("Introduza um número maior que 1: ");
							int numIntegrantes = sc.nextInt();

							if (numIntegrantes > 1) {
								for (int i = 0; i <= 100; i++) {
									System.out.println();	
								}

								ArrayList<Profissional> LEquipa = new ArrayList<>();

								int i;
								for (i = 1; i <= numIntegrantes; i++) {

									boolean opcaoCategoria = true;
									while(opcaoCategoria) {
										//Definir o numero do profissional a escolher a categoria com i
										System.out.println("Categoria do " + i + " Profissional");

										System.out.println("1 -> Médico");
										System.out.println("2 -> Enfermeiro");
										System.out.println("3 -> Auxiliar");

										System.out.println("\nIntroduza um número: ");
										//Escolher a categoria com um numero
										int opcaoCategoriaEquipa = sc.nextInt();

										if (opcaoCategoriaEquipa == 1) {
											categoria = "Médico";
											opcaoCategoria = false;
										} else if (opcaoCategoriaEquipa == 2) {
											categoria = "Enfermeiro";
											opcaoCategoria = false;
										} else if (opcaoCategoriaEquipa == 3) {
											categoria = "Auxiliar";
											opcaoCategoria = false;
										} else {
											for (int j = 0; j <= 100; j++) {
												System.out.println();	
											}
											System.out.println("\nA opção " + opcaoCategoriaEquipa + " não é válida\n");
										}
									}
									if (opcaoCategoria == false) {

										listaP.getListaProfissionais();

										//System.out.println(contador + " Profissionais encontrados");
										System.out.println("Consulte os Profissionais acima listados");
										System.out.println("Com a Categoria " + categoria + " e introduza o número de Profissional");
										System.out.println("para o associar à Equipa\n");

										System.out.println("Introduza o número de Profissional: ");
										numProfissional = sc.nextInt();
										boolean pesquisaProf = false;
										boolean profRepetido = false;
										boolean pesquisaCategoria = false;
										for (Profissional pesquisaEquipa : LEquipa) {
											System.out.println("Numero de Profissional" + pesquisaEquipa.getNumProfissional());
											if (numProfissional == pesquisaEquipa.getNumProfissional()) {
												for (int j = 0; j <= 100; j++) {
													System.out.println();	
												}
												System.out.println("O profissional número " + numProfissional + " já existe");
												profRepetido = true;
												pesquisaProf = true;
												pesquisaCategoria = true;
											}
										}
										if (profRepetido == false) {
											for (Profissional listarP : listaP.listaProfissionais) {
												//Valida se a categoria e numero de profissional existem na lista de profissionais
												if (categoria.equals(listarP.getCategoria()) && numProfissional == listarP.getNumProfissional()) {
													Profissional prof = listarP;
													LEquipa.add(prof);
													pesquisaCategoria = true;

													for (int j = 0; j <= 100; j++) {
														System.out.println();	
													}
												} 
												if (numProfissional == listarP.getNumProfissional()) {
													pesquisaProf = true;
												}
											}
										}

										if (pesquisaProf == false) {
											for (int j = 0; j <= 100; j++) {
												System.out.println();	
											}
											System.out.println("\nO profissional número " + numProfissional + " não existe\n");

										} else if (pesquisaCategoria == false) {
											for (int j = 0; j <= 100; j++) {
												System.out.println();	
											}

											System.out.println("\nA categoria do profissional selecionado não é " + categoria + "\n");
										}
									}
								}

								if (LEquipa.size() < numIntegrantes){

									System.out.println("\nEquipa não criada");
									System.out.println("Número de integrantes inferior ao selecionado\n");
								}else {
									for (int j = 0; j <= 100; j++) {
										System.out.println();	
									}
									listaE.listaEquipas.add(LEquipa);

									System.out.println("Equipa criada com sucesso\n");
								}

							} else {
								for (int j = 0; j <= 100; j++) {
									System.out.println();	
								}
								System.out.println("\nNúmero " + numIntegrantes + " inválido");
								System.out.println("A Equipa tem de ter mais do que 1 elemento\n");
							}
						}
					}

					if (opcaoEquipas == 2) {
						listaE.verEquipas();
						
					}

					if (opcaoEquipas == 3) {
						listaE.verEquipas();
						System.out.println("Escolha a equipa à qual pretende adicionar o profissional");
						System.out.println("Consulte as Equipas listadas acima");
						System.out.println("Introduza o número de Equipa: ");
						int numEquipa = sc.nextInt();
						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						if (numEquipa == 0) {
							System.out.println("O número " + numEquipa + " não é válido\n");


						}else if (numEquipa > listaE.listaEquipas.size()) {
							System.out.println("A equipa com número " + numEquipa + " não existe");

						} else {

							//Consulta de lista Profissionais
							listaP.getListaProfissionais();

							//Pedir o número de profissional
							System.out.println("Escolha o profissional que pretende adicionar à equipa");
							System.out.println("Consulte a lista de Prossionais acima");
							System.out.println("Introduza o número de profissional: ");
							int numProf = sc.nextInt(); 
							for (int i = 0; i <= 100; i++) {
								System.out.println();	
							}

							//Ver se o Profissional exite na Lista de Profissionais
							boolean pesquisaProf = false;
							for (Profissional listarP : listaP.listaProfissionais) {
								if(numProf == listarP.getNumProfissional()) {
									Profissional prof = listarP;
									listaE.adProfEquipa(numEquipa, numProf, prof);
									pesquisaProf = true;	
								}	
							}
							if (pesquisaProf == false) {
								System.out.println("O profissional número " + numProf + " não existe\n");
							}
						}
					}
					if (opcaoEquipas == 4) {
						listaE.verEquipas();
						System.out.println("Escolha a equipa da qual pretende remover um profissional");
						System.out.println("Consulte as Equipas listadas acima");
						System.out.println("Introduza o número de Equipa: ");
						int numEquipa = sc.nextInt();

						for (int i = 0; i <= 100; i++) {
							System.out.println();	
						}
						if (numEquipa == 0) {
							System.out.println("O número " + numEquipa + " não é válido\n");

						}else if (numEquipa > listaE.listaEquipas.size()) {
							System.out.println("A equipa com número " + numEquipa + " não existe");

						} else {
							//Consulta de lista Profissionais
							listaE.verEquipa(numEquipa);
							//Pedir o número de profissional
							System.out.println("Escolha o profissional que pretende remover da equipa");
							System.out.println("Consulte a lista de Prossionais acima");
							System.out.println("Introduza o número de profissional: ");
							int numProf = sc.nextInt(); 
							for (int i = 0; i <= 100; i++) {
								System.out.println();	
							}
							listaE.remProfissional(numEquipa, numProf);
						}
					}
					if (opcaoEquipas == 0) {
						menuEquipas = false;
					}
				}
				//Opção Terminar Programa no Menu Principal
			} else if(opcaoMenu == 0) {
				for (int i = 0; i <= 100; i++) {
					System.out.println();	
				}
				System.out.println("Programa Terminado.");
				menuPrincipal = false;
			}//Fecha IF opçãoMenu 0
		} //Fecha While Menu Principal
		sc.close();
	}
}