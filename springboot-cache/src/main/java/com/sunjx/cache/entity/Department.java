package com.sunjx.cache.entity;
import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
* 
* gen by beetlsql 2018-06-13
*/
public class Department   implements Serializable{
	private Integer department_id ;
	private String name ;
	
	public Department() {
	}
	
	public Integer getDepartment_id(){
		return  department_id;
	}
	public void setId(Integer department_id ){
		this.department_id = department_id;
	}
	
	public String getName(){
		return  name;
	}
	public void setName(String name ){
		this.name = name;
	}
	
	
	

}
