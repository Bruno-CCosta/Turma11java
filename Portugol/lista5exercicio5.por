programa
{ 
	funcao pula(){
	escreva("\n")}
	
	funcao inicio()
	{
		real vt [5]
		inteiro a = 0 , b = 0

		para (b = 0 ; b <5 ; b++)
		{
			escreva("Qual o " , b + 1 , "° vt: " )
			leia (vt [b])
			limpa()
			
			pula()	
		}
		
		escreva("0 = Sair\n1 = Mostrar a ordem que foi teclada\n2 = Mostrar na ordem inversa")
		pula()
		escreva("Digite o numero sobre a ação que vamos fazer: ")
		leia (a)
		limpa()

		se (a==0)
		{
		escreva("Fim, obrigado por usar nosso sistema ")
		}

		senao se (a == 1){
			para (b = 0; b <5; b ++){
				escreva ("\n", vt[b])
			}
			
		} 
		senao se (a == 2){
			para (b = 4 ; b> = 0; b --)
			{
				escreva ("\n", vt[b])
			}
					
		}
		senao{
			escreva ("Código Inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 606; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */