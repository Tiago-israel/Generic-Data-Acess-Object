/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.generics;

import java.util.List;

import br.com.generics.dao.GenericDao;
import br.com.generics.model.Carro;
import br.com.generics.model.Pessoa;

/**
 *
 * @author tiago
 */
public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Joana");
		pessoa.setCpf("123456");
		pessoa.setEmail("joana@gmail.com");
		GenericDao<Pessoa, Integer> gd = new GenericDao<>(Pessoa.class);
		
		
		GenericDao<Carro, Integer>carroDao = new GenericDao<>(Carro.class);
		Carro carro = new Carro();
		carro.setCor("vermelho");
		carro.setMarca("fiat");
		carroDao.save(carro);
		
		Pessoa pessoaPesquisada = gd.findById(12);
		if(pessoaPesquisada != null) {
			pessoaPesquisada.setNome("et bilu");
			gd.save(pessoaPesquisada);
		}

		System.out.println(gd.save(pessoa).getNome() + "Hello World!");
		List<Pessoa> pessoas = gd.findAll();
		pessoas.forEach(p -> {
			System.out.println(p.getNome());
		});
	}
}
