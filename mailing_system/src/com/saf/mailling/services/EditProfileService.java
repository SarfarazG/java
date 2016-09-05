package com.saf.mailling.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saf.mailling.dao.EditProfileDao;
import com.saf.mailling.dto.RegDto;

public class EditProfileService  {

	
		public int EditP_Logic(RegDto rd1){
			
			EditProfileDao epd = new EditProfileDao();
			int a = epd.EditProfile_Query(rd1);
			return a;
			
		}
		
		
}
