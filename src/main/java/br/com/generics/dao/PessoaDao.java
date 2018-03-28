package br.com.generics.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.generics.model.Pessoa;

public class PessoaDao extends GenericDao<Pessoa, Integer> {

	private static PessoaDao instance;

	private PessoaDao() {
		super(Pessoa.class);
	}

	@SuppressWarnings("unchecked")
	public List<Pessoa> buscarPorProfissao(String profissao) {
		Query query = this.em.createQuery("SELECT p FROM Pessoa p WHERE p.profissao = :profissao");
		query.setParameter("profissao", profissao);
		return query.getResultList();
	}

	public static PessoaDao getInstance() {
		if (instance == null) {
			instance = new PessoaDao();
		}
		return instance;
	}
}
