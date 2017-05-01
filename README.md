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

	- [x] Entender Maiúsculas e Minúsculas;
	- [x] Permitir espaços em branco;
	- [x] Aceitar pontuação;
	- [ ] Aceitar caracteres acentuados;
	- [x] Aceitar caracteres especiais;	
	- [x] Aceitar letras;					
	- [x] Se o char não existir exibir '_';
	- [x] Descriptografar;
	- [ ] Melhorar o design da página;
	- [ ] Ler um arquivo "*.txt" e criptografar;
	- [ ] Incluir um botão para salvar a saída em um arquivo "*.txt";
	- [ ] Incluir uma página inicial com menus ("Sobre" ...);
	- [x] Validar input "Valor Cifra" <= 100;
	- [ ] Incluir um botão "Limpar" para os dois campos de texto;
	- [x] Mudar o nome do botão de "Codificar" para "Criptografar";	
