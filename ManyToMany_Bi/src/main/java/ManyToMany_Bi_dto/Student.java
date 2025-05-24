package ManyToMany_Bi_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity  //unknown Entity
public class Student {
	
	@Id
	private int sid;
	private String name;
	@Column(unique=true)
	private long phno;
    private String address;
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
	@JoinTable(joinColumns = @JoinColumn(name="sid"),inverseJoinColumns =@JoinColumn(name="cid") )
	List<Course> c;
	
	
	@Override
	public String toString() {
		return "Student [id=" + sid + ", name=" + name + ", phno=" + phno + ", address=" + address + ", c=" + c + "]";
	}

	public int getId() {
		return sid;
	}

	public void setId(int sid) {
		this.sid = sid;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Course> getC() {
		return c;
	}

	public void setC(List<Course> c) {
		this.c = c;
	}
}
