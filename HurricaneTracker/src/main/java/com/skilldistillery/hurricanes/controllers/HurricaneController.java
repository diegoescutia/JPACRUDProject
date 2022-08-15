package com.skilldistillery.hurricanes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.hurricanes.data.HurricaneDAO;
import com.skilldistillery.hurricanes.entities.Hurricane;

@Controller
public class HurricaneController {

	@Autowired
	private HurricaneDAO dao;

	@RequestMapping(path = { "/", "index.do" })
	public String home() {
		return "index";
	}

	@RequestMapping(path = "getStorm.do")
	public String getStormById(Integer id, Model model) {
		Hurricane hurricane = dao.findById(id);
		model.addAttribute("hurricane", hurricane);
		return "details";
	}

	@RequestMapping(path = "getAllStorms.do")
	public String getAllStorms(Model model) {
		List<Hurricane> hurricane = dao.findAll();
		model.addAttribute("hurricanes", hurricane);

		return "allStorms";
	}
	
	
	@RequestMapping(path= "addHurricane.do")
	public String startAddHurricane(Model model) {
		return "addStorm";
	}

	@RequestMapping(path="addHurricanes.do")
	public String addHurricane(Model model, Hurricane hurricane) {
		Hurricane storm = dao.create(hurricane);
		model.addAttribute("hurricane", storm);
		return "details";
	}
	
	@RequestMapping(path="updateHurricane.do", method=RequestMethod.POST)
	public String updateUser(Model model, Hurricane hurricane) {
		dao.update(hurricane);
		return "details";
	}
	
	@RequestMapping(path="deleteHurricane.do", method=RequestMethod.POST)
	public String deleteHurricane(Model model, int id) {
		dao.destroy(dao.findById(id));
		List<Hurricane> hurricane = dao.findAll();
		model.addAttribute("hurricanes", hurricane);
		
		return "allStorms";
	}
	
}
