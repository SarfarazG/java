package com.saf.mailling.services;

import com.saf.mailling.dao.AjaxDao;

public class AjaxServices {
	
	public int ajax_logic(String s1){
		
		AjaxDao ad = new AjaxDao();
		return ad.ajax_data(s1);		
	}
}
