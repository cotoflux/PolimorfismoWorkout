package com.jobs.domain;

import com.jobs.application.PaymentFactory;

public abstract class AbsStaffMember {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0;

	private static int COUNTER_MEMBERS = 1;
	
	@Override
	public String toString() {
		return "AbsStaffMember{" +
								" id :" +id+
								", name : " + name +
								", adress: " + address +
								", phone : " + phone +
								", total paid: " + totalPaid +
								" } ";
				
	}

	public AbsStaffMember(String name, String address, String phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss()) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public abstract void pay();
}
