package br.com.cifracesar.util.criptografador;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.cifracesar.util.AlfabetoUtil;
import br.com.cifracesar.util.criptografador.CifraCesar;

public class CifraCesarDescriptografadorTest 
{
	private static final int CIFRA = 15;
	private CifraCesar descriptografia;

	@Before
	public void initTestes()
	{
		this.descriptografia = new CifraCesar(CIFRA);
	}
	
	@Test
	public void testeGeraAlfabetoCriptografado()
	{
		char[] alfabetoCriptografado = this.descriptografia.geraAlfabetoCriptografado(AlfabetoUtil.getAlfabeto());
		assertEquals(alfabetoCriptografado[14], 'D');
	}
	
	@Test
	public void testeCriptografiaDeCesarApenasComMaiusculas()
	{
		boolean criptografar = false;
		String palavraNova = this.descriptografia.criptografa("DX", criptografar);
		
		assertEquals("OI", palavraNova);
	}
	
	@Test
	public void testeCriptografiaDeCesarApenasComMinusculas()
	{
		boolean criptografar = false;
		String palavraNova = this.descriptografia.criptografa("dx", criptografar);
		
		assertEquals("oi", palavraNova);
	}

	@Test
	public void testeCriptografiaDeCesarComMaiusculasEMinusculas()
	{
		boolean criptografar = false;
		String palavraNova = this.descriptografia.criptografa("Dx", criptografar);
		
		assertEquals("Oi", palavraNova);
	}

	@Test
	public void testeCriptografiaDeCesarComEspacosEmBranco()
	{
		boolean criptografar = false;
		String palavraNova = this.descriptografia.criptografa("ITHIT RDB THEPRD", criptografar);
		
		assertEquals("TESTE COM ESPACO", palavraNova);
	}
	
	@Test
	public void testeCriptografiaDeCesarComPontuacao()
	{
		boolean criptografar = false;
		String palavraNova = this.descriptografia.criptografa("ITHIT, RDB KXGVJAP", criptografar);
		
		assertEquals("TESTE, COM VIRGULA", palavraNova);
	}
}
