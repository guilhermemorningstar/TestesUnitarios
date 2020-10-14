package CalculadoraSom;

import org.junit.Test;

import org.junit.Assert;

public class CalculadoraSomTeste {
	
	@Test
	public void deveSomarDoisNumeros() {
		//cenario
		int a = 10;
		int b = 20;
		Calculadora calc = new Calculadora();
		
		
		//acao
		int res = calc.somar(a,b);
		
		
		//verificacao
		Assert.assertEquals(30, res);
		
	}

}
