public class CompraEstadual extends Compra {

	public CompraEstadual(Produto produto) {
		super(produto);
	}

	public void escrituracao() {
		System.out.println("Produto: " + produto.nome + "\nQuantidade: " + produto.qtd + "\nPreço: R$" + produto.preco);
		System.out.println("\nValor em Estoque: R$" + (valorEstoque += precoFinal()));
		System.out.println("\nValor a pagar a Fornecedores: R$" + (valorFornecedores += precoFinal()) + "\n");
	}
	
}