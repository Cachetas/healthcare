package entidades;


//import java.util.Locale;


public class Servico {
	
	private int idServico;
	private String nomeServico;

	private int numUtente;
	private int numCCU;
	private String nomeUtente;
	private String faixaEtaria;
	
	private int numProfissional;
	private int numCCP;
	private String nomeProfissional;
	private String categoria;
	
	
	/* Construtores */

	public Servico() {
		
	}

	public void adServico(int idServico, String nomeServico, int numUtente, int numCCU, String nomeUtente, String faixaEtaria, int numProfissional, int numCCP, String nomeProfissional, String categoria) {
		
		this.idServico = idServico;
		this.nomeServico = nomeServico;
		this.numUtente = numUtente;
		this.numCCU = numCCU;
		this.nomeUtente = nomeUtente;
		this.faixaEtaria = faixaEtaria;
		this.numProfissional = numProfissional;
		this.numCCP = numCCP;
		this.nomeProfissional = nomeProfissional; 
		this.categoria = categoria;
	
	}

	/* Getter*/
	public int getIdServico() {
		return idServico;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	
	
	public int getNumUtente() {
		return numUtente;
	}
	public int getNumCCU() {
		return numCCU;
	}
	public String getNomeUtente(){	
		return nomeUtente;
	}	
	public String getFaixaEtaria(){
		return faixaEtaria;
	}
	
	public int getNumCCP() {
		return numCCP;
	}
	public int getNumProfissional() {
		return numProfissional;
	}
	public String getNomeProfissional(){
		return nomeProfissional;
	}
	public String getCategoria() {
		return categoria;
	}




	
	


}
