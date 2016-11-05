package com.action;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;  

public class UserAction extends ActionSupport  
{  
    public final static String MESSAGE = "Struts2 is up and running ...";  
	private String username;
	private String password;	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public String execute() throws Exception  
    {  
    	
        System.out.println(username+","+password);
        
        return SUCCESS;  
    }  
}  
