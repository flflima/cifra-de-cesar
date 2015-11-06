package br.com.cifracesar.util.criptografador;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.cifracesar.util.criptografador.CifraCesar;

public class CifraCesarCriptografadorTest
{
	private static final int CIFRA = 15;
	private CifraCesar criptografia;

	@Before
	public void initTestes()
	{
		this.criptografia = new CifraCesar(CIFRA);
	}
	
	@Test
	public void testeCriptografiaDeCesarApenasComMaiusculas()
	{
		boolean criptografar = true;
		String palavraNova = this.criptografia.criptografa("OI", criptografar);
		
		assertEquals("DX", palavraNova);
	}
	
	@Test
	public void testeCriptografiaDeCesarApenasComMinusculas()
	{
		boolean criptografar = true;
		String palavraNova = this.criptografia.criptografa("oi", criptografar);
		
		assertEquals("dx", palavraNova);
	}

	@Test
	public void testeCriptografiaDeCesarComMaiusculasEMinusculas()
	{
		boolean criptografar = true;
		String palavraNova = this.criptografia.criptografa("Oi", criptografar);
		
		assertEquals("Dx", palavraNova);
	}

	@Test
	public void testeCriptografiaDeCesarComEspacosEmBranco()
	{
		boolean criptografar = true;
		String palavraNova = this.criptografia.criptografa("TESTE COM ESPACO", criptografar);
		
		assertEquals("ITHIT RDB THEPRD", palavraNova);
	}
	
	@Test
	public void testeCriptografiaDeCesarComPontuacao()
	{
		boolean criptografar = true;
		String palavraNova = this.criptografia.criptografa("TESTE, COM VIRGULA", criptografar);
		
		assertEquals("ITHIT, RDB KXGVJAP", palavraNova);
	}

}
