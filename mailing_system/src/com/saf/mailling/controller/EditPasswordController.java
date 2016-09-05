package com.saf.mailling.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.saf.mailling.dto.LoginDto;
import com.saf.mailling.services.EditpasswordServices;

public class EditPasswordController  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String Old=req.getParameter("oldpass");
		System.out.println(Old);
		String New=req.getParameter("newpass");
		System.out.println(New);
		String Confirm=req.getParameter("confirmpass");
		System.out.println(Confirm);

		HttpSession hs = req.getSession(false);
		LoginDto ld1=(LoginDto)hs.getAttribute("login");
		System.out.println("email is:"+ld1.getEmail());

		EditpasswordServices eps = new EditpasswordServices();
		String retrivedpass =eps.Editpass_Logic(ld1);
		
		if(retrivedpass.equals(Old)){
			if(New.equals(Confirm)){
				
				int a=eps.UpdatePass(New,ld1);
				if(a>0){
					String success = "Your password is updated succesfully";
					hs.setAttribute("UpdatedPassword", success);
					req.getRequestDispatcher("Login.jsp").forward(req, resp);
				}
				
			}
			else{
				
				System.out.println("Password doesnt match");
				resp.sendRedirect("EditPass.jsp");
			}
			
		}
		else{
			
			System.out.println("you have entered wrong old password");
		}
		
		
		
		
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req, resp);
	}

}
