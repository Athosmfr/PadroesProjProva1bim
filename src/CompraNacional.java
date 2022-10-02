public class CompraNacional extends Compra {

	public CompraNacional(Produto produto, int imposto, double valorFrete, double valorICMS) {
		super(produto);
		this.imposto = imposto; // aliquota
		this.valorFrete = valorFrete;
		this.valorICMS = valorICMS;
	}

	protected int imposto; // aliquota
	protected double valorFrete;
	protected double valorICMS;
	
	public void escrituracao() {
		System.out.println("Produto: " + produto.nome + "\nQuantidade: " + produto.qtd + "\nPreço: R$" + produto.preco);
		System.out.println("\nValor em Estoque: R$" + (valorEstoque += precoFinal()));
		System.out.println("\nValor a pagar a Fornecedores: R$" + (valorFornecedores += precoFinal()));
		System.out.println("\nValor a pagar de Frete: R$" + (valorFrete += precoFinal() * produto.frete));
		System.out.println("\nValor a pagar de ICMS: R$" + (valorICMS += precoFinal() * (imposto/100) + (valorFrete - (valorFrete * imposto/100))) + "\n");
	}
}