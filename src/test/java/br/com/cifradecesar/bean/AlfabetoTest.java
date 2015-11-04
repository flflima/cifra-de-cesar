package br.com.cifradecesar.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.cifracesar.util.Alfabeto;

public class AlfabetoTest 
{

	@Test
	public void testeEncontraPosicaoDeUmaLetraMaiuscula() 
	{
		char[] letras = "OI".toCharArray();
		
		char umaLetra = letras[0];
		
		int posicaoDessaLetra = Alfabeto.posicaoLetraAlfabeto(umaLetra);
		
		assertEquals(posicaoDessaLetra, 14);
	}

	@Test
	public void testeEncontraPosicaoDeUmaLetraMinuscula() 
	{
		char[] letras = "oi".toCharArray();
		
		char umaLetra = letras[0];
		
		int posicaoDessaLetra = Alfabeto.posicaoLetraAlfabeto(umaLetra);
		
		assertEquals(posicaoDessaLetra, 14);
	}

	@Test
	public void testeVerificaSeCharEhUmEspacoEmBranco()
	{
		char branco = ' ';
		
		assertTrue(Alfabeto.isLetraUmEspacoEmBranco(branco));
	}
	
	@Test
	public void testeVerificaSeCharEhUmaLetraMinuscula()
	{
		char minuscula = 'm';
		
		assertTrue(Alfabeto.isLetraMinuscula(minuscula));
	}
	
	@Test
	public void testeVerificaSeCharEhUmSinalDePontuacao()
	{
		char pontuacao1 = '.';
		char pontuacao2 = ';';
		char pontuacao3 = ',';
		char pontuacao4 = ':';
		char pontuacao5 = '!';

		assertTrue(Alfabeto.isSinalPontuacao(pontuacao1));
		assertTrue(Alfabeto.isSinalPontuacao(pontuacao2));
		assertTrue(Alfabeto.isSinalPontuacao(pontuacao3));
		assertTrue(Alfabeto.isSinalPontuacao(pontuacao4));
		assertTrue(Alfabeto.isSinalPontuacao(pontuacao5));
	}
	
}
