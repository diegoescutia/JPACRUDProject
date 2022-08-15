package com.skilldistillery.hurricanes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.skilldistillery.hurricanes.data.HurricaneDaoImpl;
import com.skilldistillery.hurricanes.entities.Hurricane;

@SpringBootTest
class HurricaneTrackerApplicationTests {

	private HurricaneDaoImpl hdao;
	@PersistenceContext
	private EntityManager em;
	
	@BeforeEach
	void setUp() throws Exception {
		hdao = new HurricaneDaoImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		hdao=null;
	}

	
	
	
	
}
