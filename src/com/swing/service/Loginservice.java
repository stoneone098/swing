package com.swing.service;

import com.swing.util.Restcall;

public class Loginservice {
	public String vaild(String input)
	{
		String Vaild="N";
		Restcall rest= new Restcall();
		Vaild=	rest.post(input);

		return Vaild;
		
	}

}
