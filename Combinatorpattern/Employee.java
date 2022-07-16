package Combinatorpattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

enum Gender{MALE,FEMALE}
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	private String name;
	private String email;
	private String phone;
	private Gender gender;
	private int age;

}
