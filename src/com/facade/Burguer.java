package com.facade;

public class Burguer implements Produto{
	private int tipoBurguer;
	private double preco; 
	private String descric;
	
	
	
	public Burguer(int tipoBurguer) {
		this.tipoBurguer = tipoBurguer;
		alterarDesc(tipoBurguer);
		alterarPreco(tipoBurguer);
	}
	
	private void alterarDesc(int tipoBurguer)
	{
		if(tipoBurguer == 1)
		{
			descric = "Big Mac: Dois hambúrgueres (100% carne bovina), alface americana, queijo processado sabor cheddar, molho especial, cebola, picles e pão com gergelim.";
		}
		else
		{
			if(tipoBurguer == 2)
			{
				descric = "McCrispy Chicken Elite: Composto por pão tipo brioche com batata, o novo molho Honey & Fire, que une laranja, mel e aroma de pimenta vermelha, bacon em fatias, alface, tomate, queijo processado sabor cheddar e carne 100% de peito de frango, temperada e empanada.";
			}
			else
			{
				descric = null;
			}
		}
	}
	
	private void alterarPreco(int tipoBurguer)
	{
		if(tipoBurguer == 1)
		{
			preco = 23.55;
		}
		else
		{
			if(tipoBurguer == 2)
			{
				preco = 21.70;
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
