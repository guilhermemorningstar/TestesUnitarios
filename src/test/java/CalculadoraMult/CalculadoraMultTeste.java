package CalculadoraMult;

import org.junit.Test;

import org.junit.Assert;

public class CalculadoraMultTeste {
	
	@Test
	public void deveMultiplicarDoisNumeros() {
		//cenario
		int a = 10;
		int b = 20;
		CalculadoraMult calc = new CalculadoraMult();
		
		
		//acao
		int res = calc.multiplicar(a,b);
		
		
		//verificacao
		Assert.assertEquals(200, res);
		
	}

}
