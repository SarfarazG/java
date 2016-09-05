package com.saf.mailling.services;

import java.util.UUID;

import com.saf.mailling.dao.RegDao;
import com.saf.mailling.dto.RegDto;

public class REGServices {
	
	public int regsdata(RegDto g1){
		
		RegDao rd = new RegDao();
		String code=UUID.randomUUID().toString();
		System.out.println(code+" code");
		g1.setCode(code);
		
		int a = rd.Access_record(g1);
		return a;
		
	}
	

}

