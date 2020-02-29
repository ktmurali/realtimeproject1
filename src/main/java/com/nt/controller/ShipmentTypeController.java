package com.nt.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.ShipmentType;
import com.nt.service.IShipmentService;

@Controller
@RequestMapping("/ship")
public class ShipmentTypeController {
	@Autowired
	private IShipmentService service;
	
	@RequestMapping("/show")
	public String showFormPage()
	{
		return "registration_form";
	}

	@PostMapping("/save")
	public String shipmentRegistration(@ModelAttribute ShipmentType emp,Model mod)
	{
		String msg=null;
		//use service
		msg=service.saveShipmentDetailes(emp);
		//set model attribute
		mod.addAttribute("msg", msg);
		return "reg_sucess";
	}
	@RequestMapping("/get")
	public String getshipmentDeailles(Model mod)
	{
		List<ShipmentType> list=service.processShopmentDetailes();
		//set model attribute
		mod.addAttribute("list", list);
		return "ship_detailes";
	}
	@RequestMapping("/delete")
	public String deleteshipmentDeailles(@RequestParam("sid")Integer id, Model mod)
	{
		String msg=null;
		service.deleteShipmentDetailes(id);
		msg="ShiptypeData"+id+"deleted Successfully";
		List<ShipmentType> list=service.processShopmentDetailes();
		//set model attribute
		mod.addAttribute("list", list);
		mod.addAttribute("msg", msg);
		return "ship_detailes";
	}

}
