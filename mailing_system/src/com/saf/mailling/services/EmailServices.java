package com.saf.mailling.services;

import com.saf.mailling.dao.EmailDao;

public class EmailServices {
	
	public String email_logic(String code){
		
		EmailDao ed = new EmailDao();
		String s = ed.email_data(code);
		return s;
		
}
}