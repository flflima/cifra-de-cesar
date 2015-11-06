package br.com.cifracesar.util;


public abstract class CriptografiaUtil
{

	public static String criptografaCifraDeCesar(char[] alfabeto, String palavraDeEntrada, int cifra)
	{
		int tamanhoAlfabeto = alfabeto.length;
		
		char[] letrasDaPalavra = palavraDeEntrada.toCharArray();
		
		StringBuilder palavraCifrada = new StringBuilder();
		
		for (int i = 0; i < letrasDaPalavra.length; i++) 
		{
			char letraDaPalavra = letrasDaPalavra[i];
			
			if (naoEhUmaLetraMasEhValido(letraDaPalavra))
			{
				palavraCifrada.append(letraDaPalavra);
			} 
			else if (ehUmaLetra(letraDaPalavra))
			{
				int posicaoNoAlfabeto = (Alfabeto.posicaoLetraAlfabeto(letraDaPalavra) + cifra) % tamanhoAlfabeto;
				
				char letra = alfabeto[posicaoNoAlfabeto];
				
				if (Alfabeto.isLetraMinuscula(letraDaPalavra))
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

	private static boolean naoEhUmaLetraMasEhValido(char letraDaPalavra) 
	{
		return Alfabeto.isEspacoEmBranco(letraDaPalavra) || 
				Alfabeto.isSinalPontuacao(letraDaPalavra) || Alfabeto.isNumero(letraDaPalavra);
	}

	private static boolean ehUmaLetra(char letraDaPalavra)
	{
		return Alfabeto.isLetraValida(letraDaPalavra);
	}
}