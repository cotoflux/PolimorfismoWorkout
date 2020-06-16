package com.jobs.application;


import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Boss;
import com.jobs.domain.Employee;
import com.jobs.domain.Manager;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		//el objeto tiene que ser de tipo ABSStaffMember
		AbsStaffMember boss = new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		System.out.println(boss);
		//repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		//el objeto tiene que ser de tipo ABSStaffMember
		AbsStaffMember employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		System.out.println(employee);
		//repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		//el objeto tiene que ser de tipo ABSStaffMember
		AbsStaffMember manager = new Manager(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		System.out.println(manager);
		//repository.addMember(manager);
	}
	

	public void payAllEmployeers() {
		List<AbsStaffMember> list = repository.getAllMembers();
		for(AbsStaffMember member: list) {
			member.pay();
		}
	
	}

	public String getAllEmployees() {
		String allEmployees = "";
		
		for(AbsStaffMember member: repository.getAllMembers()) {
			allEmployees = allEmployees + " " + member;
		}
		return allEmployees;
	}

	public void createVolunteer(String name, String adress, String phone, String description) throws Exception{
		// Modifico parametros los voluntarios deben tener su nombre y demas params
		AbsStaffMember volunteer = new Volunteer(name, adress, phone, description);
		System.out.println(volunteer);
		//repository.addMember(volunteer);
	}
	
	
	
}
