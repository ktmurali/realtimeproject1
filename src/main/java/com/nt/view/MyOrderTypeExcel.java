package com.nt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.nt.model.OrderDataType;
import com.nt.model.ShipmentType;

public class MyOrderTypeExcel extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		//create Responce Type
		response.addHeader("Content-Disposition", "attachment;filename=Shipments.xlsx");
		
		//create Sheet
		Sheet sheet=workbook.createSheet("SHIPMENT TYPES");
		//construct zero row for head Section
		setHeader(sheet);
		//read model data
		List<OrderDataType> list=(List<OrderDataType>) model.get("list");
		setBody(sheet,list);
		
	}

	

	private void setHeader(Sheet sheet) {
		Row r1=sheet.createRow(0);
		r1.createCell(0).setCellValue("OID");
		r1.createCell(1).setCellValue("OMODE");
		r1.createCell(2).setCellValue("OCODE");
		r1.createCell(3).setCellValue("OACPT");
		r1.createCell(4).setCellValue("NOTE");
		
		
	}
	private void setBody(Sheet sheet, List<OrderDataType> list) {
		
		int count=1;
		for(OrderDataType ord:list)
		{
			
			List<String> act=ord.getOrderAccept();
			
			
			Row r2=sheet.createRow(count++);
			r2.createCell(0).setCellValue(ord.getOid());
			r2.createCell(1).setCellValue(ord.getOrderMode());
			r2.createCell(2).setCellValue(ord.getOrderCode());
			r2.createCell(3).setCellValue( act.toString());
			r2.createCell(4).setCellValue(ord.getOrderDesc());
			
		}
		
	}

}
