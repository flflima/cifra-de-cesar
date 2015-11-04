package br.com.cifradecesar.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.cifracesar.util.AlfabetoMaiusculas;
import br.com.cifracesar.util.CriptografiaUtil;

public class CriptografiaTest 
{
	private static int CIFRA = 15;
	
	@Test
	public void testeCriptografiaDeCesarApenasComMaiusculas()
	{
		String palavraNova = CriptografiaUtil.criptografaCifraDeCesar(AlfabetoMaiusculas.getAlfabeto(), "OI", CIFRA);
		
		assertEquals("DX", palavraNova);
	}
	
	@Test
	public void testeCriptografiaDeCesarApenasComMinusculas()
	{
		String palavraNova = CriptografiaUtil.criptografaCifraDeCesar(AlfabetoMaiusculas.getAlfabeto(), "oi", CIFRA);
		
		assertEquals("dx", palavraNova);
	}

	@Test
	public void testeCriptografiaDeCesarComMaiusculasEMinusculas()
	{
		String palavraNova = CriptografiaUtil.criptografaCifraDeCesar(AlfabetoMaiusculas.getAlfabeto(), "Oi", CIFRA);
		
		assertEquals("Dx", palavraNova);
	}

	@Test
	public void testeCriptografiaDeCesarComEspacosEmBranco()
	{
		String palavraNova = CriptografiaUtil.criptografaCifraDeCesar(AlfabetoMaiusculas.getAlfabeto(), "TESTE COM ESPACO", CIFRA);
		
		assertEquals("ITHIT RDB THEPRD", palavraNova);
	}
	
	@Test
	public void testeCriptografiaDeCesarComPontuacao()
	{
		String palavraNova = CriptografiaUtil.criptografaCifraDeCesar(AlfabetoMaiusculas.getAlfabeto(), "TESTE, COM VIRGULA", CIFRA);
		
		assertEquals("ITHIT, RDB KXGVJAP", palavraNova);
	}
}
