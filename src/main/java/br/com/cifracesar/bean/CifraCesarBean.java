package br.com.cifracesar.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

import br.com.cifracesar.util.criptografador.CifraCesar;

@ManagedBean
@SessionScoped
public class CifraCesarBean implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String entrada;
	private String saida;
	private int cifra;
	private CifraCesar criptografia;

	private boolean showButton;

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
	
	@PostConstruct
	public void init() {
		this.showButton = false;
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
			this.criptografia = new CifraCesar(this.cifra);
			boolean criptografar = true;
			this.saida = this.criptografia.criptografa(entrada, criptografar);
		}
	}
	
	public void onCifraChange() {
		this.showButton = !(this.cifra > 100);
		
		if (this.cifra > 100) {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "", "O valor da Cifra deve ser entre 0 e 100."));
		}
		System.out.println(">>> showButton: " + this.showButton);
	}
	
	public boolean isShowButton() {
		return this.showButton;
	}
}
