package CalculadoraSomMult;

import org.junit.Test;

import org.junit.Assert;

public class CalculadoraSomMultTeste {
	
	@Test
	public void deveSomar_E_MultiplicarDoisNumeros() {
		//cenario
		int a = 10;
		int b = 20;
		CalculadoraSomMult calc = new CalculadoraSomMult();
		
		
		//acao
		int res = calc.somar(a,b);
		
		int resu = calc.multiplicar(res,a);
		//verificacao
		Assert.assertEquals(300, resu);
		
	}

}
