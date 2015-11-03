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
		this.saida = CriptografiaUtil.criptografaCifraDeCesar(AlfabetoMaiusculas.getAlfabeto(), entrada, cifra);
	}
}
