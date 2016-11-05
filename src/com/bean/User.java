package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
    @Id
    private String name;
    private String password;
    
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("name:"+getName()+" password:"+getPassword());
    }
}
