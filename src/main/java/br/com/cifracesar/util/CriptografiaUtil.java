package br.com.cifracesar.util;


public abstract class CriptografiaUtil
{

	public static String criptografaCifraDeCesar(char[] alfabetoMaisculas, String palavra, int cifra)
	{
		int tamanhoAlfabeto = alfabetoMaisculas.length;
		
		char[] letrasDaPalavra = palavra.toCharArray();
		
		StringBuilder palavraCifrada = new StringBuilder();
		
		for (int i = 0; i < letrasDaPalavra.length; i++) 
		{
			char letraDaPalavra = letrasDaPalavra[i];
			
			int posicaoNoAlfabeto = (Alfabeto.posicaoLetraAlfabeto(letraDaPalavra) + cifra) % tamanhoAlfabeto;
			
			char letra = alfabetoMaisculas[posicaoNoAlfabeto];
			
			if (Character.isLowerCase(letraDaPalavra))
			{
				letra = Character.toLowerCase(letra);
			}
			
			palavraCifrada.append(letra);
		}
		
		return palavraCifrada.toString();
	}
}