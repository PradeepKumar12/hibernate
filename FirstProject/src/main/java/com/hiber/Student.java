package com.hiber;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Student {
	
	private int id;
	private String name;
	private String city;
	

}
