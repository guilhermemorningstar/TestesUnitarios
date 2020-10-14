package CalculadoraSub;

import org.junit.Test;

import org.junit.Assert;

public class CalculadoraSubTeste {
	
	@Test
	public void deveSubtrairDoisNumeros() {
		//cenario
		int a = 10;
		int b = 20;
		CalculadoraSub calc = new CalculadoraSub();
		
		
		//acao
		int res = calc.subtrair(a,b);
		
		
		//verificacao
		Assert.assertEquals(-10, res);
		
	}

}
