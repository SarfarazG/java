package com.saf.mailling.services;

import com.saf.mailling.dao.loginDao;
import com.saf.mailling.dto.LoginDto;

public class LoginServices {
	
	loginDao ld = new loginDao();
	
	public int login_logic(LoginDto dto){
	
		int a=ld.login_data(dto);	
		return a;
	}
	
	
	/*public int show_logic(LoginDto dto){
		
		ld.show_data(dto);
		return 1;
	}*/

	
	
}
