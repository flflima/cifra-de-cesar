package br.com.cifradecesar.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.cifracesar.util.AlfabetoMaiusculas;
import br.com.cifracesar.util.CriptografiaUtil;

public class CriptografiaTest 
{
	private static int CIFRA = 15;
	
	@Test
	public void testeCriptografiaCifraDeCesar()
	{
		String palavraNova = CriptografiaUtil.criptografaCifraDeCesar(AlfabetoMaiusculas.getAlfabeto(), "OI", CIFRA);
		
		assertEquals("DX", palavraNova);
	}

}
