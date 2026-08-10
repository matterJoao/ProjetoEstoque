package entidades;

public class Produtos {

	private int quant;
	private String nome;
	private double preco;

	public Produtos(String nome, double preco, int quant) {
		this.quant = quant;
		this.nome = nome;
		this.preco = preco;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		return "Nome: " +getNome() + "\n"
				+ "Preco: " + getPreco()  + "\n"
				+"Quantidade: " + getQuant();
	}

}
