package com.vm.training.java.oops;


public class EmployeePersonalDetails extends EmployeeDetails {
	
	String nationality;
	
	/*public EmployeePersonalDetails(int empId, String name, String dept,String email_ID,String mobile,String address,String nationality) {
		super(empId, name, dept, email_ID, mobile, address);
		this.nationality = nationality;
		
	}

	/*@Override
	public String toString() {
		return "EmployeePersonalDetails [nationality=" + nationality + ", email_ID=" + email_ID + ", mobile=" + mobile
				+ ", address=" + address + ", empId=" + empId + ", name=" + name + ", dept=" + dept + "]";
	}*/
	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public static void main(String[] args) {
		
		EmployeePersonalDetails empPerDetails = new EmployeePersonalDetails();
		empPerDetails.setEmpId(200);
		empPerDetails.setName("javeed");
		empPerDetails.setEmail_ID("j.com");
		empPerDetails.setNationality("india");
		System.out.println(empPerDetails.getEmpId());
		System.out.println(empPerDetails.getName());
		System.out.println(empPerDetails.getEmail_ID());
		System.out.println(empPerDetails.getNationality());
	}
	

}