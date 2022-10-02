public class Consumidor {

	public static void main(String[] args) {
		
		Produto prod1 = new Produto("Computador",5,100,0.05);
		CompraFactory fab = new CompraFactory();
		Compra c = fab.cadastrarCompra(tipoCompra.compraEstadual, prod1);
		c.escrituracao();
		Compra c2 = fab.cadastrarCompra(tipoCompra.compraNacional, prod1, 15);
		c2.escrituracao();
		Compra c3 = fab.cadastrarCompra(tipoCompra.compraInternacional, prod1, 20.0);
		c3.escrituracao();
	}
}