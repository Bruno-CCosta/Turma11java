programa
{
	
	
			inclua biblioteca Util --> ut
	funcao pula(){
		escreva("\n")
	}
	
		

	
	funcao inicio()
	{
		 const inteiro LIMITELINHA=3,LIMITECOLUNA=3
		 inteiro valores[LIMITELINHA][LIMITECOLUNA]
		 inteiro linha=0, coluna=0, totalDiagonal = 0, totalMatriz = 0
		
		 
		 para (linha = 0; linha<LIMITELINHA; linha++)
		 {
		 	para (coluna = 0; coluna <LIMITECOLUNA; coluna++)
		 	{
		 		escreva("Digite o valor da linha ",linha," e coluna ", coluna," :")
		 		valores[linha][coluna] = ut.sorteia(1, 10)
		 		escreva(" ",valores[linha][coluna])
		 		pula()
		 		se(linha==coluna)
		 		{
		 			totalDiagonal = totalDiagonal + valores[linha][coluna]	 			
		 		}
				totalMatriz = totalMatriz + valores[linha][coluna]
		 		
		 	}
		  }
		  escreva("A soma da diagonal principal é:",totalDiagonal)
		  
		  escreva("O total dos valores digitados é : ", totalMatriz)
	
	}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 110; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */