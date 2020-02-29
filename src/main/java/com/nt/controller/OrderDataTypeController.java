package com.nt.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nt.model.OrderDataType;
import com.nt.service.IOrderDataTypeService;
import com.nt.util.OrderDtaTypePieAndBarChart;
import com.nt.view.MyOrderTypeExcel;
import com.nt.view.MyOrderTypePDF;

@Controller
@RequestMapping("/order")
public class OrderDataTypeController {
	@Autowired
	private IOrderDataTypeService service;
	
	@Autowired
	private ServletContext context;
	
	@Autowired
	private OrderDtaTypePieAndBarChart charts;
	
	@RequestMapping("/register")
	public String showOrderDataTypeFormPage() {
		return "OrderDataTypeRegister";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveOrderDataType(@ModelAttribute OrderDataType orderDataType,Model model)
	{
		String msg=null;
		Integer oid=0;
		 oid=service.saveOrderDataType(orderDataType);
		if(oid==0)
		{
           msg=	"orderData'"+oid+"' not saved";		
		}
		else
		{
			msg=	"orderData'"+oid+"'saved";
		}
		model.addAttribute("msg", msg);
		
		return "OrderDataTypeRegister";
	}
	@RequestMapping("/view")
	public String  getOneOrderDataType(@RequestParam("oid")Integer oid,Model model ) 
	{
		OrderDataType order=service.getOneOrderDataType(oid);
		model.addAttribute("order", order);
		return "OrderDataTypeView";
	}
	@RequestMapping("/all")
	public String getAllOrderDataType(Model model)
	{
		List<OrderDataType> list=service.getAllOrderDataType();
		model.addAttribute("list", list);
		return "allOrderDataType";
	}
	@RequestMapping("/edit")
	public String updateOrderDataTypeFormPage(@RequestParam("oid")Integer oid, Model model,OrderDataType orderDataType)
	{
		orderDataType=service.getOneOrderDataType(oid);
		model.addAttribute("orderDataType", orderDataType);
		return "OrderDataTypeEdit";
	}
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String updateOrderDataType(@ModelAttribute OrderDataType orderDataType, Model model)
	{
		String msg=null;
		service.updateOrderDataType(orderDataType);
		msg="OrderData'"+orderDataType.getOid()+"'updated successfully";
		model.addAttribute("msg", msg);
		List<OrderDataType> list=service.getAllOrderDataType();
		model.addAttribute("list", list);
		return "allOrderDataType";
	}
	@RequestMapping("/delete")
	public String deleteeOrderDataType(@RequestParam("oid")Integer oid,Model model) {
        String msg=null;
		service.deleteeOrderDataType(oid);
	 	msg="OrderData'"+oid+"'deleted successfully";
	 	model.addAttribute("msg", msg);
	 	List<OrderDataType> list=service.getAllOrderDataType();
		model.addAttribute("list", list);
		return "allOrderDataType";
	
 		
	}
	@RequestMapping("/excel")
	public ModelAndView showXlsView()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new MyOrderTypeExcel());
		//to get the list data fron Db
		List<OrderDataType> list=service.getAllOrderDataType();
		//set data to modelandview
		m.addObject("list",list);
		return m;
	}
	
	@RequestMapping("/pdf")
	public ModelAndView showPdfView()
	{
		ModelAndView m=new ModelAndView();
		m.setView(new MyOrderTypePDF());
		//to get the list data fron Db
		List<OrderDataType> list=service.getAllOrderDataType();
		//set data to modelandview
		m.addObject("list",list);
		return m;
	}
	@RequestMapping("/charts")
	public String showCharts()
	{
		List<Object[]> list=service.getOrderDataTypeModeCount();
		String path=context.getRealPath("/");
		charts.generateBarChart(path, list);
		charts.generatePie(path, list);
		
		return "OrderTypeCharts";
	}

}
