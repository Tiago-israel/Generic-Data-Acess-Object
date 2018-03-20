package br.com.generics.dao;

import br.com.generics.model.Pessoa;

public class PessoaDao extends GenericDao<Pessoa, Integer> {

	private static PessoaDao instance;
	
	private PessoaDao() {
		super(Pessoa.class);
	}
	
	public static PessoaDao getInstance() {
		if(instance == null) {
			instance = new PessoaDao();
		}
		return instance;
	}
}
