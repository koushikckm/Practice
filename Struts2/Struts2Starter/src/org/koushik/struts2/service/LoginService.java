package org.koushik.struts2.service;

import org.koushik.struts2.model.User;

public class LoginService {

	public boolean verifyLogin(User user){
		if(user.getUserId().equals("userId") && user.getPassword().equals("password")){
			return true;
		}
		return false;
	}
}
