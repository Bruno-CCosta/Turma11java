programa
{
	
inclua biblioteca Matematica --> mat

	funcao inicio()
	{
		
		real precoOriginal = 0.0, resultado = 0.0, calculo=0.0
		inteiro condicaoPagamento = 0
		
		
		escreva("Qual o valor do produto: ")
		leia(precoOriginal)
		limpa()

		
		escreva("1 - À vista em dinheiro ou cheque, recebe 20% de desconto")
		escreva("\n2 - À vista no cartão de crédito, recebe 15% de desconto")
		escreva("\n3 - Em duas vezes, preço normal de etiqueta sem juros ou desconto")
		escreva("\n4 - Em três vezes, preço normal de etiqueta mais juros de 10%")
		escreva("\n\nInforme a condição de pagamento: ")
		leia(condicaoPagamento)

		
		se (condicaoPagamento == 1){
			calculo = (20*precoOriginal)/100)
			resultado = precoOriginal - calculo
			escreva("Você escolheu a condição de pagamento ", condicaoPagamento, " e com 20% de desconto seu produto sai no valor de: R$",  mat.arredondar(resultado,3))
		}
		senao se (condicaoPagamento == 2){
			calculo = (15*precoOriginal)/100
			resultado = precoOriginal - calculo
			escreva("Você escolheu a condição de pagamento ", condicaoPagamento, " e com 15% de desconto seu produto tem um total de:  R$",  mat.arredondar(resultado,3))
		}
		
		senao se (condicaoPagamento == 3){
			resultado = precoOriginal / 2
			escreva("Você escolheu a condição de pagamento ", condicaoPagamento, " parcelando seu produto em 2 vezes tendo um total de cada parcela de:  R$",  mat.arredondar(resultado,3))
		}
		senao se (condicaoPagamento == 4){
			calculo = (10*precoOriginal)/100
			resultado = (precoOriginal/3)+calculo
			escreva("Você escolheu a condição de pagamento ", condicaoPagamento, " parcelando seu produto em 3 vezes tendo um total de cada parcela de:  R$", mat.arredondar(resultado,3))
		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */