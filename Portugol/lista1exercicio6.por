programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real x1 , x2 , y1 , y2 , dis

		escreva ("\nValor de X1: ")
		leia (x1)
		escreva("\nValor de X2: ")
		leia (x2)
		escreva ("\nValor de Y1: ")
		leia (y1)
		escreva ("\nValor de Y2: ")
		leia (y2)

		dis = mat.raiz  (mat.potencia ( (x1+x2), 2)+ mat.potencia ( (y1+y2), 2), 2)

		escreva ("\nO resultado é: " , dis)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */