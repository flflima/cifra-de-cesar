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
			
			if (Alfabeto.isLetraUmEspacoEmBranco(letraDaPalavra) || Alfabeto.isSinalPontuacao(letraDaPalavra))
			{
				palavraCifrada.append(letraDaPalavra);
				
				continue;
			} 
			else
			{
				int posicaoNoAlfabeto = (Alfabeto.posicaoLetraAlfabeto(letraDaPalavra) + cifra) % tamanhoAlfabeto;
				
				char letra = alfabetoMaisculas[posicaoNoAlfabeto];
				
				if (Alfabeto.isLetraMinuscula(letraDaPalavra))
				{
					letra = Character.toLowerCase(letra);
				}
				
				palavraCifrada.append(letra);
			}
			
		}
		
		return palavraCifrada.toString();
	}
}