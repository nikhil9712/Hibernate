package Hibernate_Mocked.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
	int id;
	String name;
	int age;
	String location;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	
	
}
