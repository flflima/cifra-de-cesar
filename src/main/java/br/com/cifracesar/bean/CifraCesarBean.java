package br.com.cifracesar.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.cifracesar.util.AlfabetoMaiusculas;

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
	private char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
								'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
								'U', 'V', 'W', 'X', 'Y', 'Z'};

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
	
	public void imprime()
	{
		// achar a posicao de cada letra
		// somar a cifra
		// achar o mod da soma com 26
		// usar o valor como posicao no array de alfabeto
		// incluir na posicao atual a letra do alfabeto
		
		// criar um array com as chaves novas
		char[] chave = criaChaveCriptografia();
		
		// criar um metodo que recebe uma palavra e uma chave e faz a troca de cada letra
	}
	
	public char[] criaChaveCriptografia()
	{
		char[] alfabetoMaisculas = AlfabetoMaiusculas.getAlfabeto();
		int tamanhoAlfabeto = alfabetoMaisculas.length;
		
		char[] chaves = new char[tamanhoAlfabeto];
		
		for (int i = 0; i < tamanhoAlfabeto; i++) 
		{
			int posicao = (i + this.cifra) % tamanhoAlfabeto;
			
			chaves[posicao] = alfabetoMaisculas[i];
		}
		
		return chaves;
	}

	public String criptografa()
	{
		char[] alfabetoMaisculas = AlfabetoMaiusculas.getAlfabeto();
		int tamanhoAlfabeto = alfabetoMaisculas.length;
		
		char[] letrasDaPalavra = this.entrada.toCharArray();
		
		StringBuilder palavraNova = new StringBuilder();
		
		for (int i = 0; i < letrasDaPalavra.length; i++) 
		{
			int posicao = (posicaoLetraAlfabeto(letrasDaPalavra[i]) + this.cifra) % tamanhoAlfabeto;
			
			palavraNova.append(alfabetoMaisculas[posicao]);
		}
		
		return palavraNova.toString();
	}
	
	public int posicaoLetraAlfabeto(char letra)
	{
		char[] alfabetoMaisculas = AlfabetoMaiusculas.getAlfabeto();
		int posicaoLetra = 0;
		
		for (int i = 0; i < alfabetoMaisculas.length; i++) 
		{
			if (letra == alfabetoMaisculas[i])
			{
				posicaoLetra = i;
				break;
			}
		}
		
		return posicaoLetra;
	}
}
