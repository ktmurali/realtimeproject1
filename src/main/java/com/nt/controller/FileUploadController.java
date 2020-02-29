package com.nt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.nt.model.UploadFileType;
import com.nt.service.IUploadService;

@Controller
@RequestMapping("/file")
public class FileUploadController {

	@Autowired
	private IUploadService service;
	
	@RequestMapping("/show")
	public String showUploadFormPage()
	{
		return "uploadRegistraion";
	}
	
	@RequestMapping(value = "/upload",method = RequestMethod.POST)
	public String fileUpload(@RequestParam Integer fileId,@RequestParam CommonsMultipartFile fileData,Model model)
	{
		
		
		System.out.println("FileUploadController.fileUpload()");
		if(fileData!=null)
		{
		UploadFileType upload=new UploadFileType();
		upload.setFileId(fileId);
		upload.setFileName(fileData.getOriginalFilename());
		upload.setFileData(fileData.getBytes());
		service.savDocument(upload);
		String msg="File '"+fileId+"' upload successfully";
		model.addAttribute("msg",msg);
		
	}
		return "uploadRegistraion";
	}
	
	
}
