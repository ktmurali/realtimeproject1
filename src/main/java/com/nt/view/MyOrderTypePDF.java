package com.nt.view;

import java.awt.Color;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;

import com.lowagie.text.pdf.PdfWriter;
import com.nt.model.OrderDataType;

public class MyOrderTypePDF extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		
		//set Responce Header
		response.setHeader("Content-Disposition", "attachement;filename=OrderType.pdf");
        //create Element of Document
		Paragraph p= new Paragraph("Welcome to OrderType");
       //add Element to Document
		document.add(p);
		//read the Data 
		List<OrderDataType> list=(List<OrderDataType>) model.get("list");
		//create Table Element with specified columns
		Table t=new Table(5);
		t.setBorder(2);
		
		t.setBackgroundColor(Color.cyan);
		t.addCell("OID");t.addCell("OMODE");
		t.addCell("OCODE");t.addCell("OACPT");
		t.addCell("NOTE");
		
		//set the data to cells
		int count=1;
		for(OrderDataType ord:list)
		{
			
			List<String> act=ord.getOrderAccept();
			
			
			
			t.addCell(ord.getOid().toString());
			t.addCell(ord.getOrderMode());
			t.addCell(ord.getOrderCode());
			t.addCell(act.toString());
			t.addCell(ord.getOrderDesc());
			
		}
		//add data to pdf
		document.add(t);
		//print data and time
		document.add(new Paragraph(new Date().toString()));
		
	}

}
