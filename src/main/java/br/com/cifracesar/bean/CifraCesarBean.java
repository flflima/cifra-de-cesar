package br.com.cifracesar.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SlideEndEvent;

import br.com.cifracesar.util.criptografador.CifraCesar;

@ManagedBean
@SessionScoped
public class CifraCesarBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final int CIFRA_MIN = 0;
	private static final int CIFRA_MAX = 100;
	private static final String MENSAGEM_ERRO_CIFRA = "O valor da Cifra deve ser entre " + CIFRA_MIN + " e " + CIFRA_MAX + ".";

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
	
	public void criptografarSaida() {
		this.criptografia = new CifraCesar(this.cifra);
		boolean criptografar = true;
		this.saida = this.criptografia.criptografa(entrada, criptografar);
	}
	
	public void onCifraChange() {
		showButtonAndMessages();
	}

	private void showButtonAndMessages() {
		this.showButton = !(this.cifra > CIFRA_MAX);
		
		if (this.cifra > CIFRA_MAX) {
	        FacesContext.getCurrentInstance().addMessage(null, 
	        		new FacesMessage(FacesMessage.SEVERITY_WARN, "", MENSAGEM_ERRO_CIFRA));
		}
	}
	
	public void onSlideEnd(SlideEndEvent event) {
        this.cifra = event.getValue();
        showButtonAndMessages();
    }
	
	public boolean isShowButton() {
		return this.showButton;
	}
}
