package ManyToMany_Bi_dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course {

	@Id
	private int cid;
	private String name;
	private int fees;
	private double duration;
	@ManyToMany(mappedBy ="c")
	List<Student> s;
	public int getId() {
		return cid;
	}
	public void setId(int id) {
		this.cid = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Course [id=" + cid + ", name=" + name + ", fees=" + fees + ", duration=" + duration + ", s=" + s + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public List<Student> getS() {
		return s;
	}
	public void setS(List<Student> s) {
		this.s = s;
	}
	
}
