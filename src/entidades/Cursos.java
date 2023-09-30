package entidades;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Cursos {

	private String nome;
	private Set<Integer> relacao = new LinkedHashSet<>();

	public Cursos(String nome) {
		this.nome = nome;

	}

	public Cursos(String nome, LinkedHashSet<Integer> relacao) {
		this.nome = nome;
		this.relacao = relacao;
	}

	public void adicionarAluno(int id) {

		relacao.add(id);
	}

	public void removerAluno(int id) {

		relacao.remove(id);
	}

	public Set<Integer> getRelacao() {
		return relacao;
	}

}
