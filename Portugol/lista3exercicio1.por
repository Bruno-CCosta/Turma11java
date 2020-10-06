programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro quantidadeFilhos, somaFilhos = 0, menosDeCem = 0, pessoas = 20
		
		real salario, somaSalario = 0, mediaSalario, mediaFilhos, maiorSalario = 0, percentual

		para(inteiro x = 1; x <= pessoas; x++){
			
			escreva("Digite o salario da " + x + "° pessoa: ")
			leia(salario)
			escreva("Digite a quantidade de filhos da " + x + "° pessoa: ")
			leia(quantidadeFilhos)
		limpa()
			
			se(salario > maiorSalario){
				maiorSalario = salario
				}
			se(salario <= 100){
				menosDeCem = menosDeCem + 1
				
				}
			somaSalario = somaSalario + salario
			somaFilhos = somaFilhos + quantidadeFilhos
			
			}
		mediaSalario = somaSalario / pessoas
		mediaFilhos = somaFilhos / pessoas			
		percentual = (menosDeCem * 100) / pessoas

		escreva("Media salarial: R$" + mat.arredondar(mediaSalario, 2)
			 + "\nMedia de filhos: " + mediaFilhos
			 + "\nMaior Salario: R$" + maiorSalario
			 + "\nPercentual de pessoas que rebem ate de RS100,00: " + percentual + "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */