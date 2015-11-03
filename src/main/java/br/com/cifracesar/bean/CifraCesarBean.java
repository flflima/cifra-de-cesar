package br.com.cifracesar.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.cifracesar.util.AlfabetoMaiusculas;
import br.com.cifracesar.util.CriptografiaUtil;

@ManagedBean
@SessionScoped
public class CifraCesarBean implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String entrada;
	public String saida;
	public int cifra;

	public String getEntrada()
	{
		return entrada;
	}

	public void setEntrada(String entrada) 
	{
		this.entrada = entrada;
	}
	
	public String getSaida()
	{
		return saida;
	}

	public void setSaida(String saida) 
	{
		this.saida = saida;
	}

	public int getCifra()
	{
		return cifra;
	}

	public void setCifra(int cifra)
	{
		this.cifra = cifra;
	}
	
	public void criptografarSaida()
	{
		// achar a posicao de cada letra
		// somar a cifra
		// achar o mod da soma com 26
		// usar o valor como posicao no array de alfabeto
		// incluir na posicao atual a letra do alfabeto
		
		// criar um metodo que recebe uma palavra e uma chave e faz a troca de cada letra
		this.saida = CriptografiaUtil.criptografaCifraDeCesar(AlfabetoMaiusculas.getAlfabeto(), entrada, cifra);
	}
}
