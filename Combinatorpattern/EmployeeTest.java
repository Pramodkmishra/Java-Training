package Combinatorpattern;

import static Combinatorpattern.EmployeeRegistrationValidator.isEmailValid;
import static Combinatorpattern.EmployeeRegistrationValidator.isPhoneValid;
import static Combinatorpattern.EmployeeRegistrationValidator.isRetired;

import java.util.List;

import Combinatorpattern.EmployeeRegistrationValidator.ValidationResult;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Amit Sharma","Amit@gmail.com","+91-0123456789",Gender.MALE,70);
		Employee emp2=new Employee("Ravi Kumar","Ravi@gmail.com","+92-0123456789",Gender.MALE,70);
		EmployeeValidator empValidator = new EmployeeValidator();
		//System.out.println(empValidator.isEmployeeValid(emp));
		//System.out.println(empValidator.isEmployeeValid(emp2));
		List<Employee> employees = List.of(emp,emp2);
		employees.stream().filter(em->isEmailValid().and(isPhoneValid()).and(isRetired()).apply(em).equals(ValidationResult.SUCCESS)).forEach(System.out::println);
		
		
		
//		ValidationResult result1 = (isEmailValid().and(isPhoneValid()).and(isRetired()).apply(emp));
//		ValidationResult result2 = (isEmailValid().and(isPhoneValid()).and(isRetired()).apply(emp2));
//		System.out.println(result1);
//		System.out.println(result2);

	}

}
