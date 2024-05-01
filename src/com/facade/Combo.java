package com.facade;

public class Combo implements Produto{
	
	private Burguer bg;
	private Bebida bd;
	private Sobremesa sb;
	private double preco;
	private String descric;

	@Override
	public String Descricao() 
	{
		// TODO Auto-generated method stub
		return descric;
	}

	@Override
	public double Preco() 
	{
		// TODO Auto-generated method stub
		return preco;
	}
	
	public void CriarCombo(int tipoCombo)
	{
		if(tipoCombo == 1) 
		{
			ComboMaster();
		}
		else
		{
			if (tipoCombo == 2) 
			{
				SuperCombo();
			}
		}
	}
	
	public void ComboMaster()
	{
		Burguer bg = new Burguer(1);
		Bebida bd = new Bebida(1);
		Sobremesa sb = new Sobremesa(1);
		preco = bg.Preco() + bd.Preco() + sb.Preco();
		descric = bg.Descricao() + "\n" + bd.Descricao() + "\n" + sb.Descricao();
	}
	
	public void SuperCombo()
	{
		Burguer bg = new Burguer(2);
		Bebida bd = new Bebida(2);
		Sobremesa sb = new Sobremesa(2);
		preco = bg.Preco() + bd.Preco() + sb.Preco();
		descric = bg.Descricao() + "\n" + bd.Descricao() + "\n" + sb.Descricao()
	}

	public String toString() { 
		return descric;
	} 
	
}
