public class Produto {
	
	public Produto(String nome, int qtd, double preco, double frete) {
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
		this.frete = frete;
	}

	protected String nome;
	protected int qtd; //quantidade
	protected double preco;
	protected double frete;
	
}