package com.taotao.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.utils.JsonUtils;
import com.taotao.service.ImageService;


@Controller
public class ImageController {

	@Autowired
	private ImageService imageService;
	/**
	 * 上传图片
	 * <p>Title: upload</p>  
	 * <p>Description: </p>  
	 * @param uploadFile
	 * @return
	 */
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String upload(MultipartFile uploadFile){
		Map resultMap=imageService.uploadImage(uploadFile);
		String result=JsonUtils.objectToJson(resultMap);
		
		return result;
	}
	
	
	

}
