package br.com.cifracesar.util;

public abstract class Alfabeto
{
	public static int posicaoLetraAlfabeto(char letra)
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