package Hibernate_Mock_OneToOne_Uni_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adharcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long adharno;
	private String name;
	private String address;
	private int age;
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Adharcard [adharno=" + adharno + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	
	
	
}
