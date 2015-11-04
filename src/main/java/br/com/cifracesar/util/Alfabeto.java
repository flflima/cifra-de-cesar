package br.com.cifracesar.util;

public abstract class Alfabeto
{
	public static int posicaoLetraAlfabeto(char letra)
	{
		char[] alfabetoMaisculas = AlfabetoMaiusculas.getAlfabeto();
		int posicaoLetra = 0;
		
		for (int i = 0; i < alfabetoMaisculas.length; i++) 
		{
			if (Character.toUpperCase(letra) == alfabetoMaisculas[i] ||
					Character.toLowerCase(letra) == Character.toLowerCase(alfabetoMaisculas[i]))
			{
				posicaoLetra = i;
				break;
			}
		}
		
		return posicaoLetra;
	}

	public static boolean isLetraUmEspacoEmBranco(char letraDaPalavra) 
	{
		return Character.isSpaceChar(letraDaPalavra);
	}
	
	public static boolean isLetraMinuscula(char letraDaPalavra) 
	{
		return Character.isLowerCase(letraDaPalavra);
	}

	public static boolean isSinalPontuacao(char letraDaPalavra) 
	{
		String letra = "" + letraDaPalavra;
		
		return letra.matches("\\p{Punct}");
	}
}
