package br.com.cifracesar.util.criptografador;

import br.com.cifracesar.util.AlfabetoUtil;


public class CifraCesar
{
	private int cifra;
	private char[] alfabetoCriptografado;

	public CifraCesar(int cifra) 
	{
		this.cifra = cifra;
		this.alfabetoCriptografado = geraAlfabetoCriptografado(AlfabetoUtil.getAlfabeto());
	}

	public char[] geraAlfabetoCriptografado(char[] alfabeto)
	{
		int tamanhoAlfabeto = alfabeto.length;
		char[] alfabetoCriptografado = new char[tamanhoAlfabeto];
		int posicaoNoAlfabeto = 0;
		
		for (int i = 0; i < tamanhoAlfabeto; i++) 
		{
			posicaoNoAlfabeto = (AlfabetoUtil.posicaoLetraAlfabeto(alfabeto[i], alfabeto) + this.cifra) % tamanhoAlfabeto;
			alfabetoCriptografado[i] = alfabeto[posicaoNoAlfabeto];
		}
		
		return alfabetoCriptografado;
	}
	
	public String criptografa(String entrada, boolean criptografar) 
	{
		char[] letrasDaPalavra = entrada.toCharArray();
		
		StringBuilder palavraCifrada = new StringBuilder();
		
		for (int i = 0; i < letrasDaPalavra.length; i++) 
		{
			char letraDaPalavra = letrasDaPalavra[i];
			
			if (AlfabetoUtil.naoEhUmaLetraMasEhValido(letraDaPalavra))
			{
				palavraCifrada.append(letraDaPalavra);
			} 
			else if (AlfabetoUtil.ehUmaLetra(letraDaPalavra))
			{
				int posicaoNoAlfabeto = 0;
				
				char letra = ' ';
				
				if (criptografar)
				{
					posicaoNoAlfabeto = AlfabetoUtil.posicaoLetraAlfabeto(letraDaPalavra, AlfabetoUtil.getAlfabeto());
					letra = this.alfabetoCriptografado[posicaoNoAlfabeto];
				}
				else
				{
					posicaoNoAlfabeto = AlfabetoUtil.posicaoLetraAlfabeto(letraDaPalavra, this.alfabetoCriptografado); 
					letra = AlfabetoUtil.getAlfabeto()[posicaoNoAlfabeto];
				}
				
				
				if (AlfabetoUtil.isLetraMinuscula(letraDaPalavra))
				{
					letra = Character.toLowerCase(letra);
				}
				
				palavraCifrada.append(letra);
			}
			else
			{
				palavraCifrada.append('_');
			}
		}
		
		return palavraCifrada.toString();
	}

}
