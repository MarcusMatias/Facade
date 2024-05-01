package com.facade;

public class Bebida implements Produto{

	private int tipoBebida;
	private String descric;
	private double preco;
	
	
	
	public Bebida(int tipoBebida) {
		this.tipoBebida = tipoBebida;
		alterarDesc(tipoBebida);
		alterarPreco(tipoBebida);
	}
	
	private void alterarDesc(int tipoBebida)
	{
		if(tipoBebida == 1)
		{
			descric = "Sprite X Tangerina e Morango 300 ml: sinta sabor da tangerina e doçura do morango presentes no xarope com a refrescância do limão da Sprite";
		}
		else
		{
			if(tipoBebida == 2)
			{
				descric = "Coca-Cola 300ml: Refrescante e geladinha. Uma bebida assim refresca a vida.";
			}
			else
			{
				descric = null;
			}
		}
	}
	
	private void alterarPreco(int tipoBebida)
	{
		if(tipoBebida == 1)
		{
			preco = 7.50;
		}
		else
		{
			if(tipoBebida == 2)
			{
				preco = 8.00;
			}
			else
			{
				preco = 0;
			}
		}
	}
	
	@Override
	public String Descricao() {
		// TODO Auto-generated method stub
		return descric;
	}

	@Override
	public double Preco() {
		// TODO Auto-generated method stub
		return preco;
	}

}
