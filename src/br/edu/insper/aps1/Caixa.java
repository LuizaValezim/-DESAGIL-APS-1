package br.edu.insper.aps1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> descontos = new HashMap<>();
	
	public Caixa() {
		this.descontos = Collections.emptyMap();
    }
	
	public void adicionarCaixa(Produto produto, int desconto) {
		if ((desconto>=1)&&(desconto<=99)){
			descontos.put(produto.getC�digo(), desconto);
		}
	}
	
	public double mostrarTotal(Carrinho carrinho) {
		double totalCompra = 0;
		for (Pedido Unitario: carrinho.getPedido()) {
			if(descontos.containsKey(Unitario.getProduto().getC�digo())) {
				totalCompra += Unitario.devolveTotal()*(1-(descontos.get(Unitario.getProduto().getC�digo())*0.01));
			}
		}
		return totalCompra;
	}
}