package br.com.cifracesar.util;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.cifracesar.util.AlfabetoUtil;

public class AlfabetoUtilTest 
{

	@Test
	public void testeEncontraPosicaoDeUmaLetraMaiuscula() 
	{
		char[] letras = "OI".toCharArray();
		
		char umaLetra = letras[0];
		
		int posicaoDessaLetra = AlfabetoUtil.posicaoLetraAlfabeto(umaLetra, AlfabetoUtil.getAlfabeto());
		
		assertEquals(posicaoDessaLetra, 14);
	}

	@Test
	public void testeEncontraPosicaoDeUmaLetraMinuscula() 
	{
		char[] letras = "oi".toCharArray();
		
		char umaLetra = letras[0];
		
		int posicaoDessaLetra = AlfabetoUtil.posicaoLetraAlfabeto(umaLetra, AlfabetoUtil.getAlfabeto());
		
		assertEquals(posicaoDessaLetra, 14);
	}

	@Test
	public void testeVerificaSeCharEhUmEspacoEmBranco()
	{
		char branco = ' ';
		
		assertTrue(AlfabetoUtil.isEspacoEmBranco(branco));
	}
	
	@Test
	public void testeVerificaSeCharEhUmaLetraMinuscula()
	{
		char minuscula = 'm';
		
		assertTrue(AlfabetoUtil.isLetraMinuscula(minuscula));
	}
	
	@Test
	public void testeVerificaSeCharEhUmSinalDePontuacao()
	{
		char pontuacao1 = '.';
		char pontuacao2 = ';';
		char pontuacao3 = ',';
		char pontuacao4 = ':';
		char pontuacao5 = '!';

		assertTrue(AlfabetoUtil.isSinalPontuacao(pontuacao1));
		assertTrue(AlfabetoUtil.isSinalPontuacao(pontuacao2));
		assertTrue(AlfabetoUtil.isSinalPontuacao(pontuacao3));
		assertTrue(AlfabetoUtil.isSinalPontuacao(pontuacao4));
		assertTrue(AlfabetoUtil.isSinalPontuacao(pontuacao5));
	}

	@Test
	public void testeVerificaSeCharEhUmNumero()
	{
		char umNumero = '1';
		char outroNumero = '9';

		assertTrue(AlfabetoUtil.isNumero(umNumero));
		assertTrue(AlfabetoUtil.isNumero(outroNumero));
	}
	
	@Test
	public void testeVerificaSeCharEhUmaLetraValida()
	{
		char primeiraLetra = 'a';
		char segundaLetra = 'F';
		char terceiraLetra = 'y';

		assertTrue(AlfabetoUtil.isLetraValida(primeiraLetra));
		assertTrue(AlfabetoUtil.isLetraValida(segundaLetra));
		assertTrue(AlfabetoUtil.isLetraValida(terceiraLetra));
	}
	
}
