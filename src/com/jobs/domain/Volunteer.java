package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	

	private String description;


	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		//created the variable is not herited
		this.description = description;
		
	}

	//Created the toString
	@Override
	public String toString() {
		
		return "\nVolunteer \n name : " + name +
				"\n adress : " +address+
				"\n phone : " + phone+
				"\n description: " + this.description + ".";
	}
	
	
	@Override
	public void pay() {
		//not geting paid
		
	}

}
