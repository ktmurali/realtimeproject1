package com.nt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.model.UploadFileType;
import com.nt.service.IDownloadService;

@Controller
@RequestMapping("/all")
public class FileDownloadController {

	@Autowired
	private IDownloadService service;
	
	@RequestMapping("/show")
	public String showUploadFiles(Model model)
	{
        List<Object[]> list=service.getUplodData();
        model.addAttribute("list",list);
        
        return "allUploadFilesList";
	}
	
	@RequestMapping("/download")
	public void getUploadFiles(@RequestParam Integer fileId,HttpServletResponse responce)
	{
		UploadFileType file=service.getDownloadData(fileId);
		//set responce header
		responce.addHeader("Content-Disposition", "attachment;filename"+file.getFileName());
		//set data to responce
		try
		{
			FileCopyUtils.copy(file.getFileData(), responce.getOutputStream());
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
