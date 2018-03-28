/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.generics;

import java.util.List;

import br.com.generics.dao.PessoaDao;
import br.com.generics.model.Carro;
import br.com.generics.model.Pessoa;

/**
 *
 * @author tiago
 */
public class Main {

	public static Pessoa criarInstanciaPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Tiago Israel");
		pessoa.setCpf("123");
		pessoa.setEmail("tiago@gmail.com");
		return pessoa;
	}

	public static Carro CriarInstanciaCarro() {
		Carro carro = new Carro();
		carro.setCor("verde");
		carro.setMarca("Ford");
		return carro;
	}

	public static void main(String[] args) {
		// List<Integer>aux = new ArrayList<>();
		// List<?>lista = aux;
		// System.out.println(PessoaDao.getInstance().save(criarInstanciaPessoa()));
		// System.out.println(CarroDao.getInstance().save(CriarInstanciaCarro()));
		System.out.println(PessoaDao.getInstance().count());
		List<Pessoa>pessoas = PessoaDao.getInstance().buscarPorProfissao("programador sr");
		pessoas.forEach(pessoa -> {
			System.out.println(pessoa);
		});
	}
}
