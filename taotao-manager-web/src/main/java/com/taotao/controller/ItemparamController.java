package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.service.ItemParamService;


@Controller
@RequestMapping("/item/param")
public class ItemparamController {

	@Autowired
	private ItemParamService itemParamService;
	
	@RequestMapping("/query/itemcatid/{itemCatId}")
	@ResponseBody
	public TaotaoResult getitemparamByCid(@PathVariable Long itemCatId){
		TaotaoResult result=itemParamService.getItemParamByCid(itemCatId);
		return result;
		 
	}
	
	@RequestMapping("/save/{cid}")
	@ResponseBody
	public TaotaoResult saveItemparam(String paramData ,@PathVariable Long cid ){
		TaotaoResult result = itemParamService.insertItemParam(cid, paramData);
		return result;
	}
}
