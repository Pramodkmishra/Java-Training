package Combinatorpattern;

public class EmployeeValidator {
	public boolean isEmailValid(String email) {
		return email.contains("@");
	}
	public boolean isPhoneValid(String phone) {
		return phone.startsWith("+91");
	}
	public boolean isEmployeeValid(Employee employee) {
		return isEmailValid(employee.getEmail())&& isPhoneValid(employee.getPhone());
	}

}
