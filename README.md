Cifra de César

Em criptografia, a Cifra de César, também conhecida como cifra de troca, código de César ou 
troca de César, é uma das mais simples e conhecidas técnicas de criptografia. É um tipo de 
cifra de substituição na qual cada letra do texto é substituída por outra, que se apresenta 
no alfabeto abaixo dela um número fixo de vezes. Por exemplo, com uma troca de três posições, 
A seria substituído por D, B se tornaria E, e assim por diante. O nome do método é em homenagem 
a Júlio César, que o usou para se comunicar com os seus generais.

Fonte: Wikipédia, a enciclopédia livre. - https://pt.wikipedia.org/wiki/Cifra_de_C%C3%A9sar

Algoritmo: C = (M + T) mod 26.

Onde: 	C = Cifra
		M = Letra (posição)
		T = Troca fixa (chave)
		
* Desenvolvido em Java versão 1.8, PrimeFaces 5.1 e Eclipse Luna
		
Próximas correções:

	* Entender Maiúsculas e Minúsculas;	-- corrigido
	* Permitir espaços em branco;		-- corrigido
	* Aceitar pontuação;				-- incluído
	* Aceitar caracteres acentuados;
	* Aceitar caracteres especiais;
	* Validar campos de entrada.
