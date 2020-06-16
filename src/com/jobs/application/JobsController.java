package com.jobs.application;


import com.jobs.domain.Employee;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		//el objeto tiene que ser de tipo ABSStaffMember
		AbsStaffMember boss = new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		//el objeto tiene que ser de tipo ABSStaffMember
		AbsStaffMember employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		//el objeto tiene que ser de tipo ABSStaffMember
		AbsStaffMember manager = new Manager(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(manager);
	}
	

	public void payAllEmployeers() {
		// TODO Auto-generated method stub
	
	}

	public String getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createVolunteer(String name, String adress, String phone, String description) {
		// Modifico parametros los voluntarios deben tener su nombre y demas params
		AbsStaffMember volunteer = new Volunteer(name, adress, phone, description);
		repository.addMember(volunteer);
	}
	
	
	
}
