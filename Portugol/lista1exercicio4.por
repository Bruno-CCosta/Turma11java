programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{ 
		inteiro a , b , c
		real d , f , g
		escreva ("\nQual o valor de A? ")
		leia (a)
		escreva ("\nQual o valor de B? ")
		leia (b)
		escreva ("\nQual o valor de C? ")
		leia (c)

		d = mat.potencia(a+b,2)
		f = mat.potencia(b+c,2)
		g = (d+f)/2

		escreva ("\nResultado? ", d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */