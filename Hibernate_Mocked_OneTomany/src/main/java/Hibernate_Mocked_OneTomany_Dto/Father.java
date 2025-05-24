package Hibernate_Mocked_OneTomany_Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

@Entity
public class Father {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phno;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Child> childs;
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
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public List<Child> getChilds() {
		return childs;
	}
	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}
	@Override
	public String toString() {
		return "Father [id=" + id + ", name=" + name + ", phno=" + phno + ", childs=" + childs + "]";
	}
	
	
}
