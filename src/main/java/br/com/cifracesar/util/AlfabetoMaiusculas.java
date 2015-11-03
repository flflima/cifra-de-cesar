package br.com.cifracesar.util;

public abstract class AlfabetoMaiusculas extends Alfabeto
{

	private static char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
										'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
										'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	public static char[] getAlfabeto() 
	{
		return alfabeto;
	}

}
