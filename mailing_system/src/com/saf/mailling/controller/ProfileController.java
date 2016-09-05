package com.saf.mailling.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saf.mailling.dto.LoginDto;
import com.saf.mailling.dto.RegDto;
import com.saf.mailling.services.ProfileServices;

public class ProfileController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession hs=req.getSession(false);//false because we are not creating new session we r using the old one
		LoginDto dt=(LoginDto)hs.getAttribute("login");
		String s = dt.getEmail();
		ProfileServices ps = new ProfileServices();
		RegDto rd = ps.profile_logic(s);
		
		if(rd!=null){
			
			hs.setAttribute("profile", rd);
			req.getRequestDispatcher("Profile.jsp").forward(req, resp);
		}
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			doPost(req, resp);
	}

}
