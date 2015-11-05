package br.com.cifracesar.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import br.com.cifracesar.util.Alfabeto;
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
		if (cifra > 100)
		{
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "", "O valor da Cifra deve ser entre 0 e 100."));
			this.cifra = 0;
			this.saida = "";
			RequestContext.getCurrentInstance().update("formCifraCesar:idCifra");
			RequestContext.getCurrentInstance().update("formCifraCesar:sliderCifra");
			RequestContext.getCurrentInstance().update("formCifraCesar:textoCriptografado");
		}
		else
		{
			this.saida = CriptografiaUtil.criptografaCifraDeCesar(Alfabeto.getAlfabeto(), entrada, cifra);
		}
	}
}
