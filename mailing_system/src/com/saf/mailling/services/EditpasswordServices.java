package com.saf.mailling.services;

import com.saf.mailling.dao.EditPasswordDao;
import com.saf.mailling.dto.EditpwDto;
import com.saf.mailling.dto.LoginDto;

public class EditpasswordServices  {
	EditPasswordDao epd = new EditPasswordDao();
	
	public String Editpass_Logic(LoginDto ld1){
		System.out.println("inside services");
		return epd.get_pass(ld1);	
		
	}
	public int UpdatePass(String New,LoginDto ld1){
		return epd.ChangePass(New, ld1);
		
	}

}
