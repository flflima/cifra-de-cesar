package br.com.cifradecesar.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cifracesar.bean.CifraCesarBean;

public class CifraCesarBeanTest 
{
	private static int CIFRA = 15;
	private CifraCesarBean cifraCesar;
	
	@Before
	public void iniciarTestes()
	{
		cifraCesar = new CifraCesarBean();
		cifraCesar.setCifra(CIFRA);
		cifraCesar.setEntrada("OI");
	}
	
	@Test
	public void testeCriacaoChaveCriptografia()
	{		
		char[] alfabetoNovo = cifraCesar.criaChaveCriptografia();

		assertEquals(alfabetoNovo[12], 'X');
		assertEquals(alfabetoNovo[23], 'I');
		
	}
	
	@Test
	public void testeCriptografia()
	{
		char[] alfabetoNovo = cifraCesar.criaChaveCriptografia();
		String palavraNova = cifraCesar.criptografa();
		
		assertEquals("DX", palavraNova);
	}
	
	@Test
	public void testePosicaoLetraNoAlfabetoMaiusculo()
	{
		char[] letras = cifraCesar.getEntrada().toCharArray();
		
		char umaLetra = letras[0];
		
		int posicaoDessaLetra = cifraCesar.posicaoLetraAlfabeto(umaLetra);
		
		assertEquals(posicaoDessaLetra, 14);
	}

}
