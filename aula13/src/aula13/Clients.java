package aula13;

import java.time.LocalDate;


public class Clients {
	private String name;
	private String email;
	private LocalDate birthDay;
	
	public Clients(){
		
	}

	public Clients(String name, String email, LocalDate birthDay) {
		this.name = name;
		this.email = email;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	
	
}
