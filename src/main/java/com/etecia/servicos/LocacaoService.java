package com.etecia.servicos;

import static com.etecia.utils.DataUtils.adicionarDias;

import java.util.Date;

import com.etecia.entidades.Filme;
import com.etecia.entidades.Locacao;
import com.etecia.entidades.Usuario;
import com.etecia.utils.DataUtils;

public class LocacaoService {
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) {
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		
		return locacao;
	}

	public static void main(String[] args) {
	
		//cenario
		LocacaoService locacaoService = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1");
		Filme filme = new Filme("Filme 1", 2 , 10.0);
		
		//acao
		Locacao locacao = locacaoService.alugarFilme(usuario, filme);
		
		//verificacao
		System.out.println(locacao.getValor());
		System.out.println(locacao.getDataLocacao());
		System.out.println(locacao.getDataRetorno());
		
		//System.out.println(locacao.getValor()==10.0);
		//System.out.println(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		//System.out.println(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
	}
}