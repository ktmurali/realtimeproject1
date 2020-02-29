package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.UomDataType;
import com.nt.service.IUomService;

@Controller
@RequestMapping("/uom")
public class UomTypeController {

	@Autowired
	private IUomService service;
	
	
	//show Form Page
	@RequestMapping("/register")
	public String showUomForm()
	{
		System.out.println("UomTypeController.showUomForm()");
		return "uomRegistrationForm";
	}
	//save UomData
	//@RequestMapping(value = "/save" ,method = RequestMethod.POST)
	@PostMapping("/save")
	public String saveUomData(@ModelAttribute UomDataType uomDataType,Model model)
	{
		System.out.println("UomTypeController.saveUomData()");
		Integer uid=null;
		String msg=null;
		uid=service.saveUomData(uomDataType);
		if(uid!=0)
		{
			msg="UomData'"+uid+"'+saved";
		}
		else
		{
			msg="UomData NotSaves" ;
		}
		model.addAttribute("msg", msg);
		
		return "uomRegistrationForm";
		
	}
	
	//get One UomData
	
	@RequestMapping("/view")
	public String showOneUomData(@RequestParam("uid")Integer uid, Model model) {
		
		UomDataType uom=service.getOneUomData(uid);
		//add attribyteValue
		model.addAttribute("uom",uom);
		return "showViewUom";
		
	}
	
	@RequestMapping("/all")
	public String showAllUomData(Model model)
	{
		List<UomDataType> list=service.getAllUomData();
		//add attribute
		model.addAttribute("list", list);
		
		return "showAllUomData";
	}
	
	@RequestMapping("/edit")
	public String editFormPage(@RequestParam("uid")Integer uid, Model model) {
		UomDataType uom=service.getOneUomData(uid);
		//add attribyteValue
		model.addAttribute("uomDataType",uom);
		return "showEditForm";
	}
	
	@RequestMapping(value = "/update" ,method = RequestMethod.POST)
	public String updateUomDAta(@ModelAttribute UomDataType uomDataType,Model model)
	{
		String msg=null;
		
		service.updateUomData(uomDataType);
		msg="UomData'"+ uomDataType.getUid()+"' updated";
		model.addAttribute("msg", msg);
		//get All UomDAta
		List<UomDataType> list=service.getAllUomData();
		//add attribute
		model.addAttribute("list", list);
		
		return "showAllUomData";
	}
	@RequestMapping("/delete")
	public String deleteUomData(@RequestParam("uid")Integer uid,Model model)
	{
           String msg=null;
		
		service.deleteeUomData(uid);
		msg="UomData'"+ uid+"' deleted";
		model.addAttribute("msg", msg);
		//get All UomDAta
		List<UomDataType> list=service.getAllUomData();
		//add attribute
		model.addAttribute("list", list);
		
		return "showAllUomData";
		
	
	}
		
	}
	
	

