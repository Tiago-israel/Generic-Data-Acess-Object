package br.com.generics.exemplos;

import java.util.ArrayList;
import java.util.List;

import br.com.generics.model.Pessoa;

public class Exemplo1 {

	public static void varrerListaSemGenerics(List lista) {
		lista.forEach(item -> {
			if (item instanceof Pessoa) {
				Pessoa pessoa = (Pessoa) item;
				System.out.println(pessoa.getNome());
			}
		});
	}

	public static void varrerListaComGenerics(List<Pessoa> lista) {
		lista.forEach(item -> {
			System.out.println(item.getNome());
		});
	}

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		List<Pessoa>listaTipada = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("tiago");
		
		lista.add("TESTE");
		lista.add(1);
		lista.add(pessoa);
		
		listaTipada.add(pessoa);
		
		
		varrerListaSemGenerics(lista);
		varrerListaComGenerics(listaTipada);
	}

}
