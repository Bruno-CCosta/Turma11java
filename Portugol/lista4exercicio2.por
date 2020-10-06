programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		 const inteiro maximo = 10
		 inteiro valorDado [maximo]
		 inteiro maiorNumero = 0 , soma = 0
		 inteiro media = 0 ,  vezesMaiorGiro = 0

		escreva("Girando dado ")
		para (inteiro x = 0 ; x < maximo; x++)
		{
			escreva("\n") valorDado [x] = Util.sorteia(1 , 10) 
		se (valorDado [x] > maiorNumero){
			maiorNumero = valorDado [x]
		}
			soma = soma + valorDado [x]
			escreva ("O giro " , (x+1) , ": foi " , valorDado[x])
			escreva("\n")
		}
		para (inteiro x = 0 ; x < maximo ; x++)
		{
			se (valorDado [x] == maiorNumero)
			{
				vezesMaiorGiro ++
			}
		}
		escreva ("A média aritmética é: " , (soma/maximo) "\n")
		escreva ("O maior número sorteado foi: " , (maiorNumero) "\n" )
		escreva  (" A frequência do maior lançamento foi de: " , (vezesMaiorGiro) , " vezes" )
	}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 836; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */