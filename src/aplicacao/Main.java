package aplicacao;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.Cursos;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Quantos alunos estão na turma A?");
		Cursos turmaA = new Cursos("TurmaA");
		
		 int quantidade = entrada.nextInt();
		for(int i = 1; i<= quantidade; i++) {
			System.out.print(i+"° Aluno: ");
				turmaA.adicionarAluno(entrada.nextInt());
			
		}
		
		System.out.print("Quantos alunos estão na turma B?");
		Cursos turmaB = new Cursos("TurmaB");
		
		  quantidade = entrada.nextInt();
		for(int i = 1; i<= quantidade; i++) {
			System.out.print(i+"° Aluno: ");
				turmaB.adicionarAluno(entrada.nextInt());
			
		}
		
		System.out.print("Quantos alunos estão na turma C?");
		Cursos turmaC = new Cursos("TurmaC");
		
		  quantidade = entrada.nextInt();
		for(int i = 1; i<= quantidade; i++) {
			System.out.print(i+"° Aluno: ");
				turmaC.adicionarAluno(entrada.nextInt());
			
		}
		
		Set<Integer> totalAlunos = new LinkedHashSet<>();
		
		totalAlunos.addAll(turmaA.getRelacao());
		totalAlunos.addAll(turmaB.getRelacao());
		totalAlunos.addAll(turmaC.getRelacao());
		
		System.out.print("TurmaA: { ");
		
		for (Integer integer : turmaA.getRelacao()) {
			System.out.print(integer+", ");
		}
		System.out.println("}");
		
System.out.print("TurmaB: { ");
		
		for (Integer integer : turmaB.getRelacao()) {
			System.out.print(integer+", ");
		}
		System.out.println("}");
		
System.out.print("TurmaC: { ");
		
		for (Integer integer : turmaC.getRelacao()) {
			System.out.print(integer+", ");
		}
		System.out.println("}");
		
System.out.print("totalAlunos: "+totalAlunos.size()+" { ");
		
		for (Integer integer : totalAlunos) {
			System.out.print(integer+", ");
		}
		System.out.println("}");
		
		

		
		
		
		
		
	}

}
