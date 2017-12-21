package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Student
{
	@Id	
	private String firstName;
	private String lastName;
	private String email;
	private String age;
	
	public Student()
	{
		
	}
	public Student (String firstName, String lastName, String email, String age)
	{	
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
