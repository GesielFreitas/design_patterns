package adapter;

public class NovoCarrinho {
	
	public void novoAdicionarProduto(String nome) {
		System.out.println("Você adicionou " + nome + " ao carrinho de compras");
	}
	
	public void novoRetirarProduto(String nome) {
		System.out.println("Você retirou " + nome + " do carrinho de compras");
	}
	
	public void novoFinalizarCompra() {
		System.out.println("Novo metodo de finalizar compra");
	}

}
