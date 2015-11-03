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
			int posicao = (Alfabeto.posicaoLetraAlfabeto(letrasDaPalavra[i]) + cifra) % tamanhoAlfabeto;
			
			palavraCifrada.append(alfabetoMaisculas[posicao]);
		}
		
		return palavraCifrada.toString();
	}
}