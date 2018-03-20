package br.com.generics.dao;

import br.com.generics.model.Carro;

public class CarroDao extends GenericDao<Carro, Integer> {

	private static CarroDao instance;

	private CarroDao() {
		super(Carro.class);
	}

	public static CarroDao getInstance() {
		if (instance == null) {
			instance = new CarroDao();
		}
		return instance;
	}

}
