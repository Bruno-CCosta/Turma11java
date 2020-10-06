programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		
		real peso = 0.0, altura = 0.0, imc=0.0

		
		escreva("Qual é o seu peso: ")
		leia(peso)
		limpa()
		escreva("Agora precisamos da sua altura: ")
		leia(altura)

		imc = ( peso / (altura*altura))

		
		se (imc < 18.5)
		{
			escreva("Você esta abaixo do seu peso, e seu IMC é: " , mat.arredondar(imc,2))
		}
		senao se (imc >= 18.5 e imc <= 25.0) 
		{
			escreva("Você esta no seu peso normal, e seu IMC é: ", mat.arredondar(imc,2))
		}
		senao se (imc >= 25.0 e imc <= 30.0) 
		{
			escreva("Você esta acima do seu peso, e seu IMC é: " , mat.arredondar(imc,2))
		}
		senao se (imc > 30.0)
		{
			escreva("Você esta obeso, e seu IMC é: " , mat.arredondar(imc,2))
		}
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */