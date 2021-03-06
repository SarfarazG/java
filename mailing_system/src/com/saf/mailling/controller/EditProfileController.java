package com.saf.mailling.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saf.mailling.dto.RegDto;
import com.saf.mailling.services.EditProfileService;

public class EditProfileController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession hs =req.getSession(false);
		String Name=req.getParameter("name");
		System.out.println("name"+Name);
		String Email=req.getParameter("email");
		System.out.println("email"+Email);
		String Mobile=req.getParameter("mob");
		System.out.println("mob"+Mobile);
		String Branch=req.getParameter("branch");
		System.out.println("branch"+Branch);
		String Address=req.getParameter("add");
		System.out.println("add"+Address);
		String Enrollment=req.getParameter("enroll");
		System.out.println("enroll"+Enrollment);

		
		RegDto rd = new RegDto();
		rd.setName(Name);
		rd.setEmail(Email);
		rd.setMobile(Mobile);
		rd.setBranch(Branch);
		rd.setAddress(Address);
		rd.setEno(Enrollment);
		
		EditProfileService eps = new EditProfileService();
		int a=eps.EditP_Logic(rd);
		if(a==1){
			String ans = "suceesfully updated your profile";
			hs.setAttribute("profileupdate",ans);
			hs.setAttribute("profile", rd);
			req.getRequestDispatcher("Profile.jsp").forward(req, resp);
		}
		else{
			String ans ="Please update again";
			hs.setAttribute("profileupdate",ans);
			req.getRequestDispatcher("EditProfile.jsp").forward(req, resp);
		}
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
		doPost(req, resp);
	}

}
