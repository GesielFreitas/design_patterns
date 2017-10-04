package main;

import adaptee.CarrinhoAdapter;
import adapter.NovoCarrinho;

public class Main {

	public static void main(String[] args) {
		NovoCarrinho carrinho = new NovoCarrinho();
		
		CarrinhoAdapter carrinhoAdapter = new CarrinhoAdapter(carrinho);
		
		carrinhoAdapter.adicionarProduto("Caderno");
		carrinhoAdapter.retirarProduto("Caderno");
		carrinhoAdapter.finalizarCompra();

	}

}
