/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.generics.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author tiago
 * @param <T>
 * @param <V>
 */
public class GenericDao<T, V> {

	private EntityManagerFactory emf;

	private EntityManager em;

	private Class<T> clazz;

	private String nameClass;

	public GenericDao(Class<T> clazz) {
		this.obterInformacoesClasse(clazz);
		this.criarConexao();
	}

	public T save(T entity) {
		em.getTransaction().begin();
		T response = em.merge(entity);
		em.getTransaction().commit();
		return response;
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Query query = em.createQuery("SELECT e FROM " + this.nameClass + " e");
		return query.getResultList();
	}

	public T findById(V id) {
		return em.find(this.clazz, id);
	}

	public void delete(T entity) {
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
	}

	private void obterInformacoesClasse(Class<T> clazz) {
		this.clazz = clazz;
		this.nameClass = this.clazz.getSimpleName();
	}

	private void criarConexao() {
		this.emf = Persistence.createEntityManagerFactory("com.mycompany_Generics_jar_1.0-SNAPSHOTPU");
		this.em = emf.createEntityManager();
	}
}
