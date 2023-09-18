package com.swing.controller;

import com.swing.service.Loginservice;

public class Logincontroller {
	
	public String vaild(String input)
	{		String Vaild="N";
  
	
		Loginservice service = new Loginservice();
		Vaild=service.vaild(input);

		return Vaild;
		
	}

}
