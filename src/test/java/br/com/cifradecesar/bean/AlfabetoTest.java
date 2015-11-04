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
	
}
