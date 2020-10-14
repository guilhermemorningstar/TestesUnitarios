package CalculadoraSubDiv;

import org.junit.Test;

import org.junit.Assert;

public class CalculadoraSubDivTeste {
	
	@Test
	public void deveSomar_E_MultiplicarDoisNumeros() {
		//cenario
		int a = 40;
		int b = 20;
		CalculadoraSubDiv calc = new CalculadoraSubDiv();
		
		
		//acao
		int res = calc.subtrair(a,b);
		
		int resu = calc.dividir(res,b);
		//verificacao
		Assert.assertEquals(1, resu);
		
	}

}
