public class CompraInternacional extends Compra {

	public CompraInternacional(Produto produto, double impostos, double valorImpostos) {
		super(produto);
		this.impostos = impostos;
		this.valorImpostos = valorImpostos;
	}

	protected double impostos;
	protected double valorImpostos;
	
	public void escrituracao() {
		System.out.println("Produto: " + produto.nome + "\nQuantidade: " + produto.qtd + "\nPreço: R$" + produto.preco);
		System.out.println("\nValor em Estoque: R$" + (valorEstoque += precoFinal()));
		System.out.println("\nValor a pagar a Fornecedores: R$" + (valorFornecedores += precoFinal()));
		System.out.println("\nValor a pagar de Impostos: R$" + (valorImpostos += precoFinal() * (impostos/100)));
	}
}