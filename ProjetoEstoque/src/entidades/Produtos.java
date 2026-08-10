package entidades;

public class Produtos {

	private int quant, id;
	private String nome;
	private double preco;

	public Produtos(int id, String nome, double preco, int quant) {
		this.id = id;
		this.quant = quant;
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "\n" +"ID: " + getId()+ "\nNome: " + getNome() + "\n" + "Preco: " + getPreco() + "\n" + "Quantidade: " + getQuant();
	}
	
	public int addEstoque(int qtd) {
		return quant += qtd;
	}

	public int removEstoque(int qtd) {
		return quant = quant - qtd;
	}
}
