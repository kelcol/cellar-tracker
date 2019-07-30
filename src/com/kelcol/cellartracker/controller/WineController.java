package com.kelcol.cellartracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kelcol.cellartracker.entity.Wine;
import com.kelcol.cellartracker.service.WineService;

@Controller
@RequestMapping("/wine")
public class WineController {
	
	@Autowired
	private WineService wineService;
	
	@GetMapping("/list")
	public String listWines(Model theModel) {
		List<Wine> theWines = wineService.getWines();
		theModel.addAttribute("wines", theWines);
		return "list-wines";
	}
	
	@GetMapping("/showFormForAdd")
	public String addWine(Model theModel) {		
		Wine theWine = new Wine();
		theModel.addAttribute("wine", theWine);
		return "wine-form";
	}
	
	@PostMapping("/saveWine")
	public String saveWine(@ModelAttribute("wine") Wine theWine) {
		wineService.saveWine(theWine);
		return "redirect:/wine/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("wineId") int theId, Model theModel) {
		Wine theWine = wineService.getWine(theId);
		theModel.addAttribute("wine", theWine);
		return "wine-form";
	}
	
	@GetMapping("/delete")
	public String deleteWine(@RequestParam("wineId") int theId) {

		// delete teh wine
		wineService.deleteWine(theId);

		return "redirect:/wine/list";
	}

	@GetMapping("/search")
	public String searchWines(@RequestParam("searchName") String searchName, Model theModel) {

		// search wines from the service
		List<Wine> theWines = wineService.searchWines(searchName);

		// add the wines to the model
		theModel.addAttribute("wines", theWines);

		return "list-wines";
	}	
	
	
	

}
