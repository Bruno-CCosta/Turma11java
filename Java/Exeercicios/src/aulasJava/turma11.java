package aulasJava;

import java.util.Scanner;

import classeAula.Alunos;
import classeAula.Proffesores;

public class turma11 {

public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	Proffesores primeiro = new Proffesores();//ctrl shift o para importar
	
	Alunos aluno1 = new Alunos();
	
	char info;
	
	System.out.print("Digite o nome: ");
	primeiro.nome = leia.next();
	
	System.out.print("Digite 'M' para sexo masculino, 'F' para sexo feminino ou 'O' para outros: ");
	primeiro.sexo = leia.next().toUpperCase().charAt(0);
	
	System.out.print("Digite a matéria que é especialidade do professor: ");
	primeiro.especialidade = leia.next();
	
	System.out.print("Digite o ano de nascimento: ");
	primeiro.anoNascimento = leia.nextInt();
	
	System.out.print("Digite 'F' se o professor foi fixo ou 'C' se o professor for convidado: ");
	info = leia.next().toUpperCase().charAt(0);
	if(info=='C') {
		primeiro.convidado = true;
	}else {
		primeiro.convidado = false;
	}
	
	System.out.println("Dados do primeiro professor: ");
	System.out.println("Nome: " + primeiro.nome);
	System.out.print("Sexo: ");
	System.out.println((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros");
	System.out.println("Idade: " + (2020 - primeiro.anoNascimento));
	System.out.println("Especialidade: " + primeiro.especialidade);
	
	System.out.print("Digite o nome: ");
	aluno1.nome = leia.next();
	
	System.out.print("Digite 'M' para sexo masculino, 'F' para sexo feminino ou 'O' para outros: ");
	aluno1.sexo = leia.next().toUpperCase().charAt(0);
	
	System.out.print("Digite o ano de nascimento: ");
	aluno1.anoNascimento = leia.nextInt();
	
	System.out.println("Digite o curso do aluno: ");
	aluno1.curso = leia.next();
	
	System.out.println("Digite o número da matrícula do aluno: ");
	aluno1.numMatricula = leia.nextInt();
	
	System.out.println("Digite a nota do aluno: ");
	aluno1.notaGeral = leia.nextDouble();
	
	System.out.println("Dados do primeiro aluno: ");
	System.out.println("Nome: " + aluno1.nome);
	System.out.print("Sexo: ");
	System.out.println((aluno1.sexo=='F')?"Feminino":(aluno1.sexo=='M')?"Masculino":"Outros");
	System.out.println("Idade: " + (2020 - aluno1.anoNascimento));
	System.out.println("Curso: " + aluno1.curso);
	System.out.println("Número de matrícula: " + aluno1.numMatricula);
	System.out.println("Nota: " + aluno1.notaGeral);
	System.out.println((aluno1.notaGeral<5)?"Reprovado":"Aprovado");
	
	leia.close();
}
}

	