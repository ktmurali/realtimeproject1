package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.WhUserDataType;
import com.nt.service.IWhUserDataTypeService;
import com.nt.service.IWhUserDataTypeService;

@Controller
@RequestMapping("/whuser")
public class WhUserDataTypeController {
	@Autowired
	private IWhUserDataTypeService service;
	
	@RequestMapping("/register")
	public String showWhUserDataTypeFormPage(Model model) {
		model.addAttribute("whUserDataType", new WhUserDataType());
		return "whUserDataTypeRegister";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveWhUserDataType(@ModelAttribute WhUserDataType whUserDataType,Model model)
	{
		String msg=null;
		Integer wid=0;
		 wid=service.saveWhUserDataType(whUserDataType);
		if(wid==0)
		{
           msg=	"WhUserData'"+wid+"' not saved";		
		}
		else
		{
			msg=	"WhUserData'"+wid+"'saved";
		}
		model.addAttribute("msg", msg);
		
		return "whUserDataTypeRegister";
	}
	@RequestMapping("/view")
	public String  getOneWhUserDataType(@RequestParam("wid")Integer wid,Model model ) 
	{
		WhUserDataType whuser=service.getOneWhUserDataType(wid);
		model.addAttribute("whuser", whuser);
		return "whUserDataTypeView";
	}
	@RequestMapping("/all")
	public String getAllWhUserDataType(Model model)
	{
		List<WhUserDataType> list=service.getAllWhUserDataType();
		model.addAttribute("list", list);
		return "allWhUserDataType";
	}
	@RequestMapping("/edit")
	public String updateWhUserDataTypeFormPage(@RequestParam("wid")Integer wid, Model model,WhUserDataType whUserDataType)
	{
		whUserDataType=service.getOneWhUserDataType(wid);
		model.addAttribute("WhUserDataType", whUserDataType);
		return "whUserDataTypeEdit";
	}
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updateWhUserDataType(@ModelAttribute WhUserDataType whUserDataType, Model model)
	{
		String msg=null;
		service.updateWhUserDataType(whUserDataType);
		msg="WhUserData'"+whUserDataType.getUserId()+"'updated successfully";
		model.addAttribute("msg", msg);
		List<WhUserDataType> list=service.getAllWhUserDataType();
		model.addAttribute("list", list);
		return "allWhUserDataType";
	}
	@RequestMapping("/delete")
	public String deleteeWhUserDataType(@RequestParam("wid")Integer wid,Model model) {
        String msg=null;
		service.deleteeWhUserDataType(wid);
	 	msg="WhUserData'"+wid+"'deleted successfully";
	 	model.addAttribute("msg", msg);
	 	List<WhUserDataType> list=service.getAllWhUserDataType();
		model.addAttribute("list", list);
		return "allWhUserDataType";
	
 		
	}
	

}
