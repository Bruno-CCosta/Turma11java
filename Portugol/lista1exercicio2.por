programa
{
	
	funcao inicio()
	{
		inteiro anos
		inteiro meses
		inteiro dias
		escreva ("Qual é a sua idade em dias? ")
		escreva("\ndias ")
		leia(dias)
		anos = (dias/365)
		meses = (dias%365)/30
		dias = (dias%365)%30
		escreva ("\nAnos: " , anos , "\nMeses: " , meses , "\nDias: " , dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */