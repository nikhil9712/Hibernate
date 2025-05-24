package ManyToOne_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
    //Bin Class
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", fees=" + fees + ", location=" + location + "]";
	}
	private String name;
	private long fees;
	private String location;
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
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
