public class CompraFactory {

	protected tipoCompra tipoCompra;
	
	public Compra cadastrarCompra(tipoCompra tipoCompra, Produto produto) {	
	return (tipoCompra == tipoCompra.compraEstadual) ? new CompraEstadual(produto) : null;
	}
	
	public Compra cadastrarCompra(tipoCompra tipoCompra, Produto produto, int imposto) {
	return (tipoCompra == tipoCompra.compraNacional) ? new CompraNacional(produto, imposto, 0, 0) : null;
	}

	public Compra cadastrarCompra(tipoCompra tipoCompra, Produto produto, double impostos) {
	return (tipoCompra == tipoCompra.compraInternacional) ? new CompraInternacional(produto, impostos, 0): null;
	}
}