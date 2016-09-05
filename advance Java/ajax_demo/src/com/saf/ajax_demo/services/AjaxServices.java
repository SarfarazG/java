package com.saf.ajax_demo.services;

import com.saf.ajax_demo.dao.AjaxDao;

public class AjaxServices {
	
	public int ajax_logic(String s1){
		
		AjaxDao ad = new AjaxDao();
		return ad.ajax_data(s1);		
	}
}
