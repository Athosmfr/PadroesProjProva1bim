public class Compra {

	protected Produto produto;
	protected double valorEstoque;
	protected double valorFornecedores;
	
	public Compra(Produto produto) {
		this.produto = produto;
	}
	
	public void escrituracao() {
	}
	
	public double precoFinal() {
		return produto.preco * produto.qtd;
	}
}