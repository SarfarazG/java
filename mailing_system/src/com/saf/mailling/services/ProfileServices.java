package com.saf.mailling.services;

import com.saf.mailling.dao.ProfileDao;
import com.saf.mailling.dto.RegDto;


public class ProfileServices {
	
	public RegDto profile_logic(String s1){
		
		ProfileDao pd =new ProfileDao();
		RegDto rd= pd.Profile_data(s1);
		return rd;
	}

}
