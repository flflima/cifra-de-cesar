package br.com.cifracesar.util;

public abstract class Alfabeto
{

	private static char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
										'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
										'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	public static char[] getAlfabeto() 
	{
		return alfabeto;
	}
	
	public static int posicaoLetraAlfabeto(char letra)
	{
		int posicaoLetra = 0;
		
		for (int i = 0; i < alfabeto.length; i++) 
		{
			if (Character.toUpperCase(letra) == alfabeto[i] ||
					Character.toLowerCase(letra) == Character.toLowerCase(alfabeto[i]))
			{
				posicaoLetra = i;
				break;
			}
		}
		
		return posicaoLetra;
	}

	public static boolean isEspacoEmBranco(char letraDaPalavra) 
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

	public static boolean isNumero(char letraDaPalavra) 
	{
		return Character.isDigit(letraDaPalavra);
	}

	public static boolean isLetraValida(char letraDaPalavra) 
	{
		return Character.isLetter(letraDaPalavra);
	}
}
