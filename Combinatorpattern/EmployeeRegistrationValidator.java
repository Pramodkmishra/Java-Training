package Combinatorpattern;

import java.util.function.Function;

import Combinatorpattern.EmployeeRegistrationValidator.ValidationResult;

public interface EmployeeRegistrationValidator extends Function<Employee, ValidationResult> {
	enum ValidationResult {
		SUCCESS, EMAIL_IS_NOT_VALID, PHONE_NUMBER_IS_NOT_VALID,RETIRED,NOT_RETIRED;
	}

	static EmployeeRegistrationValidator isEmailValid() {
		return employee -> employee.getEmail().contains("@") ? ValidationResult.SUCCESS
				: ValidationResult.EMAIL_IS_NOT_VALID;
	}

	static EmployeeRegistrationValidator isPhoneValid() {
		return employee -> employee.getPhone().startsWith("+91") ? ValidationResult.SUCCESS
				: ValidationResult.PHONE_NUMBER_IS_NOT_VALID;
	}
	
	static EmployeeRegistrationValidator isRetired() {
		return employee -> employee.getAge()>60 ? ValidationResult.SUCCESS
				: ValidationResult.NOT_RETIRED;
	}
	
	default EmployeeRegistrationValidator and(EmployeeRegistrationValidator other) {
		return employee -> {
			ValidationResult result = this.apply(employee);
			return result.equals(ValidationResult.SUCCESS) ? other.apply(employee) : result;
		};
	}

}
