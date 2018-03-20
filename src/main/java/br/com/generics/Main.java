/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.generics;

import br.com.generics.dao.CarroDao;
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
		System.out.println(PessoaDao.getInstance().save(criarInstanciaPessoa()));
		System.out.println(CarroDao.getInstance().save(CriarInstanciaCarro()));
	}
}
