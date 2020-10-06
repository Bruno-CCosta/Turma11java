programa
{
	funcao pula()
	{
		escreva("\n")
	}
	funcao linha()
	{
		para (inteiro a = 1 ; a < 60; a++){
			
		}
	}
	
	funcao inicio()
	{
		
		
		const inteiro LIMITE = 39
		inteiro mat[LIMITE] 
		cadeia lista[] = {"Bruna dos Santos","BRUNO CORREIA DA COSTA","BRUNO DE FREITAS SOUSA","Carla Cristina Conceição de Paula","Christian Garcia Amantino","Cleiton Ortega dos Santos","Debora Miranda Carmona","Everton Luiz Rosário de Oliveira","GABRIEL REIS RITTER","Gildenor Junior da Silva Costa","Guilherme Marcionilo Pedroso do Rosario Silva","Herick Willians Canhete Rocha","Jacqueline Alves Barbosa","João Victor dos Santos Rigoleto","Jonas De Oliveira Santos","JONATHAN CAVALCANTI DE PAULA","Juliana Cavalaro de Oliveira","Karina Soares Lima","Larissa Meira Dominguez","Leonardo Iamur Terra","Lysandro Andrade Martin","Matheus Araujo de moraes","Matheus Fernandes Rodrigues","Matheus Trindade Torok","Mônica dos santos ribeiro","Natália Lopes moreno","Phelipe Almeida de Souza","Rafaela de Albuquerque","Ricardo Martins Corrêa","SARAH LIDIA DE OLIVEIRA BRAIA","Stefanie Dias Costa","Tiago Diniz Gomes","Victor Augusto de Souza Tavares","Vivian Rodrigues Nakano","Washington pereira dos santos","Wellington Vieira","Wesley Bueno da Silva","Yago Tonoli Domingues","Zaine de Queiros Jesus"}
		inteiro x = 0
		inteiro y = 0
		inteiro numInt
		inteiro verifica = 0
		para (x = 0; x <LIMITE; x++)
		{
			mat[x] = x+1
		}
		escreva("Matricula       Alunox")
		pula()
		para (x = 0; x < LIMITE; x++)
		{
			
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
			escreva("Quantos integrantes têm cada grupo?\n")
			leia(numInt)
			se(numInt>20){
				escreva("Grupos não podem ter mais que 20 integrantes\n\n")
			}senao{
				y=1
			}
		}enquanto(y==0)
		
		limpa()
		
		
		inteiro contadorIntegrantes = 0 
		inteiro contadorGrupos = 0 
		para(inteiro i = 0; i<39; i++){
			
			se(contadorIntegrantes<numInt){
				escreva(" ", mat[i], " Grupo ",contadorGrupos+1,"  Nome: ", lista[i])
				pula()
				contadorIntegrantes++
			}
			
			se(contadorIntegrantes==numInt){
				contadorIntegrantes=0
				contadorGrupos++
				pula()
			}
		}
		
	}
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */