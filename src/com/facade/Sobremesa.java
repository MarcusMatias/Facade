package com.facade;

public class Sobremesa implements Produto{
	private int tipoSobremesa;
	private String descric = "Bebida láctea sabor baunilha, flocos de ovomaltine e cobertura sabor chocolate.";
	private double preco = 15.30;
	
	
	
	public Sobremesa(int tipoSobremesa) {
		this.tipoSobremesa = tipoSobremesa;
		alterarDesc(tipoSobremesa);
		alterarPreco(tipoSobremesa);
	}

	private void alterarDesc(int tipoSobremesa)
	{
		if(tipoSobremesa == 1)
		{
			descric = "McFlurry Ovomaltine Rocks Ao Leite Chocolate: bebida láctea sabor baunilha, flocos de ovomaltine e cobertura sabor chocolate.";
		}
		else
		{
			if(tipoSobremesa == 2)
			{
				descric = "Casquinha Mista: Refrescante e geladinha. Uma bebida assim refresca a vida.";
			}
			else
			{
				descric = null;
			}
		}
	}
	
	private void alterarPreco(int tipoSobremesa)
	{
		if(tipoSobremesa == 1)
		{
			preco = 13.50;
		}
		else
		{
			if(tipoSobremesa == 2)
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
