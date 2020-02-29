package com.nt.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class OrderDtaTypePieAndBarChart {
	
	
	public void generatePie(String path,List<Object[]> list)
	{
 
		//1.create dataset object
		DefaultPieDataset dataset=new DefaultPieDataset();
		//set dataset with 
		for(Object[] args:list)
		{
		dataset.setValue(args[0].toString(), Double.valueOf(args[1].toString()));
		}
		//2.create JFreeChart using ChartFcactory
		JFreeChart chart=ChartFactory.createPieChart("OrderTypeModes", dataset, true, true, false);
		
		//3.create PieChart Image
		
		try {
			System.out.println("OrderDtaTypePieAndBarChart.generatePie()"+path);
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/OrderTypeA.jpg"), chart, 400, 400);
		} 
		catch (IOException e)
		{

			e.printStackTrace();
		}
		
	}
	public void generateBarChart(String path,List<Object[]> list)
	{
		//1.create dataset
		DefaultCategoryDataset dataset= new DefaultCategoryDataset();
		//2. set values to dataset
		for(Object[] args:list)
		{
			dataset.setValue(Double.valueOf(args[1].toString()), args[0].toString(), "");
		}
		
		//create JFreeChart object
		JFreeChart chart=ChartFactory.createBarChart("OrderTypeMosdes", "Modes", "Count", dataset);
		// convert chart object to bargraph image
		
		try {
			System.out.println("OrderDtaTypePieAndBarChart.generateBarChart()"+path);
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/OrderTypeB.jpg"), chart, 400, 400);
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
	
	

}
