package Hibernate_PEJM15;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    
	@Id
	private int id;
	private String name;
	private String pass;
	private String email;
	private Long  phno;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", pass=" + pass + ", email=" + email + ", phno=" + phno + "]";
	}
	
}
