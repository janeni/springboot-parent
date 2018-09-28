package com.sunjx.cache.entity;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2018-06-13
*/
public class User implements Serializable{
	private Integer  user_id ;
	private Integer department_id ;
	private String name ;
	private Date create_time ;
	
	public User() {
	}
	
	public Integer getUser_id(){
		return  user_id;
	}
	public void setId(Integer user_id ){
		this.user_id =  user_id;
	}
	
	public Integer getDepartment_id(){
		return  department_id;
	}
	public void setDepartment_id(Integer department_id ){
		this.department_id = department_id;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	public Date getCreate_time(){
		return  create_time;
	}
	public void setCreate_time(Date create_time ){
		this.create_time = create_time;
	}
	
	
	

}
