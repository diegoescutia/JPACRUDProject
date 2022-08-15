package com.skilldistillery.hurricanes.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.hurricanes.entities.Hurricane;

@Service
@Transactional
public class HurricaneDaoImpl implements HurricaneDAO {

	@PersistenceContext
	private EntityManager em;


	@Override
	public Hurricane findById(int hurricaneId) {
		// TODO Auto-generated method stub
		return em.find(Hurricane.class, hurricaneId);
	}

	@Override
	public List<Hurricane> findAll() {
		String jpql = "SELECT h FROM Hurricane h";
		return em.createQuery(jpql, Hurricane.class).getResultList();
	}

	@Override
	public Hurricane create(Hurricane hurricane) {
		em.persist(hurricane);
		em.flush();
		return hurricane;
	}

	@Override
	public void update(Hurricane hurricane) {
		Hurricane upHurricane = em.find(Hurricane.class, hurricane.getId());
		upHurricane.setName(hurricane.getName());
		upHurricane.setCategory(hurricane.getCategory());
		upHurricane.setYear(hurricane.getYear());
		upHurricane.setState(hurricane.getState());
		upHurricane.setMaxWind(hurricane.getMaxWind());
		upHurricane.setCost(hurricane.getCost());
		upHurricane.setFatalities(hurricane.getFatalities());
		
	}

	@Override
	public void destroy(Hurricane hurricane) {
		em.remove(hurricane);
	}





}
