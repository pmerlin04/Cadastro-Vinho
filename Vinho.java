package aula02;

public class Vinho {
	
	private String nome;
	private String tipo;
	private double preco;
	private int safra;
	
	public Vinho() {
		
	}
	
	public Vinho (String nomeVinho, String tipoVinho, double precoVinho, int safraVinho) {
		this.nome = nomeVinho;
		this.tipo = tipoVinho;
		this.preco = precoVinho;
		this.safra = safraVinho;
	}
	
	public String mostrarVinho() {
		return "Nome: " + this.nome + "\nTipo: " + this.tipo + "\nPreço: " + this.preco + "\nSafra: " + this.safra;
	}
	
	public boolean verificarPreco(double precoVinho) {
		if(precoVinho<25) {
			return true;
		}else {
			return false;
		}
	}

}