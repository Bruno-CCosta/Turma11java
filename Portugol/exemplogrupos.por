programa
{
	funcao pula()
	{
		escreva("\n")
	}
	funcao linha()
	{
		para (inteiro a = 1 ; a < 60; a++){
			escreva("═")
		}
	}
	
	funcao inicio()
	{
		//DECLARANDO OS VETORES
		//G6
		const inteiro LIMITE = 39
		inteiro mat[LIMITE] // 0-38
		cadeia lista[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"}
		inteiro y = 0
		inteiro numInt = 0
		inteiro verifica = 0
		inteiro x = 0
		para (x = 0; x <LIMITE; x++)
		{
			mat[x] = x+1
		}
		escreva("Matricula       Alunox")
		pula()
		para (x = 0; x < LIMITE; x++)
		{
			//fuciona bem até o 9
			se (x < 9)
			{
				escreva("  ",mat[x],"             ",lista[x]) 	
			}
			senao
			{
				escreva("  ",mat[x],"            ",lista[x]) 	
			}
			pula()
		}
		limpa()
		faca{
			escreva("Quantos integrantes têm cada grupo?")
			leia(numInt)
			limpa()
			se(numInt>20){
				escreva("Grupos não podem ter mais que 20 integrantes \n")
				
			}senao{
				y=1
			}
		}enquanto(y==0)
		
		escreva ("Grupo 1: ", lista[0],", " ,lista[1], ", " ,lista[2], " e ", lista[3] , "\nGrupo 2: " , lista[4],", " ,lista[5],", " ,lista[6]," e " ,lista[7])
		pula()
		escreva ("Grupo 3: ", lista[8],", " ,lista[9],", " ,lista[10]," e " ,lista[11] , "\nGrupo 4: ", lista[12],", " ,lista[13],", " ,lista[14]," e " ,lista[15])
		pula()
		escreva ("Grupo 5: ", lista[16],", " ,lista[17],", " ,lista[18]," e " ,lista[19],"\nGrupo 6: ", lista[20],", " ,lista[21],", " ,lista[22]," e " ,lista[23])
		pula()
		escreva ("Grupo 7: ", lista[24],", " ,lista[25],", " ,lista[26]," e " ,lista[27], "\nGrupo 8: ", lista[28],", " ,lista[29],", " ,lista[30]," e " ,lista[31])
		pula()
		escreva ("Grupo 9: ", lista[32],", " ,lista[33],", " ,lista[34]," e " ,lista[35], "\nGrupo 10: ", lista[36],", " ,lista[37]," e " ,lista[38])
	
	}	
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2777; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */