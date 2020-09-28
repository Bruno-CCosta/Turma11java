programa
{
	
	funcao inicio()
	{
		inteiro tempoFesta =0
		inteiro segundos =0
		inteiro minutos =0
		inteiro horas =0

		escreva ("Qual é o tempo da festa em segundos:")
		leia (tempoFesta)
		horas = tempoFesta/3600
		escreva ("\n Total de horas ", horas)
		minutos = (tempoFesta%3600)/60
		escreva ("\n Total de minutos ", minutos)
		segundos = (tempoFesta%3600)%60
		escreva ("\n Total de segundos " , segundos)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */