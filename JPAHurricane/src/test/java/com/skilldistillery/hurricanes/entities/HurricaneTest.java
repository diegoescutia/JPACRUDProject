package com.skilldistillery.hurricanes.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HurricaneTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Hurricane hurr;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAHurricane");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		hurr = em.find(Hurricane.class, 1);
	}
	

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		hurr = null;
	}

	@Test
	void Test_Hurricane_Entity_Mapping() {
		assertNotNull(hurr);
		assertEquals("Irene", hurr.getName());
		assertEquals(1, hurr.getCategory());
		assertEquals(2003, hurr.getYear());
		assertEquals("North Carolina", hurr.getState());
		assertEquals(120, hurr.getMaxWind());
		assertEquals("$13.5 billion", hurr.getCost());
		assertEquals(58, hurr.getFatalities());
		
	}

}
