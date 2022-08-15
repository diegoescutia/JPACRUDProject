package com.skilldistillery.hurricanes.data;

import java.util.List;

import com.skilldistillery.hurricanes.entities.Hurricane;

public interface HurricaneDAO {

	public Hurricane findById(int hurricaneId);
	
	public List<Hurricane> findAll();
	
	public Hurricane create(Hurricane hurricane);
	
	public void update(Hurricane hurricane);
	
	public void destroy(Hurricane hurricane);
	
	
}
