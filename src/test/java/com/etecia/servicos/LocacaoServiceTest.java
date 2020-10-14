package com.etecia.servicos;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.etecia.entidades.Filme;
import com.etecia.entidades.Locacao;
import com.etecia.entidades.Usuario;
import com.etecia.utils.DataUtils;


public class LocacaoServiceTest {
	
	@Test
	public void teste() {
		
		//cenario
		LocacaoService locacaoService = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1");
		Filme filme = new Filme("Filme 1", 2 , 10.0);
		
		//acao
		Locacao locacao = locacaoService.alugarFilme(usuario, filme);
		
		//verificacao
		Assert.assertTrue(locacao.getValor()==10.0);
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
		
	}
}
