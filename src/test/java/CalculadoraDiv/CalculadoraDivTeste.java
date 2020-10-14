package CalculadoraDiv;

import org.junit.Test;

import org.junit.Assert;

public class CalculadoraDivTeste {
	
	@Test
	public void deveDividirDoisNumeros() {
		//cenario
		int a = 20;
		int b = 10;
		CalculadoraDiv calc = new CalculadoraDiv();
		
		
		//acao
		int res = calc.dividir(a,b);
		
		
		//verificacao
		Assert.assertEquals(2, res);
		
	}

}