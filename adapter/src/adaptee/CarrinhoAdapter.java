package adaptee;

import adapter.NovoCarrinho;
import target.Carrinho;

public class CarrinhoAdapter extends Carrinho{
	
	NovoCarrinho novoCarrinho;
	
	public CarrinhoAdapter(NovoCarrinho novoCarrinho) {
		this.novoCarrinho = novoCarrinho;
	}
	
	public void adicionarProduto(String nome) {
		novoCarrinho.novoAdicionarProduto(nome);
	}
	
	public void retirarProduto(String nome) {
		novoCarrinho.novoRetirarProduto(nome);
	}
	
	public void finalizarCompra() {
		novoCarrinho.novoFinalizarCompra();
	}

}
