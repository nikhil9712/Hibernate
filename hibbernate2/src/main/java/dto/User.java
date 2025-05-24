package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
	private int id;
	private String name;;
	private String email;
	private long phno;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String facebook;
	private String instagram;
	private String snapchat;
	private String  twitter;
	private String whatsup;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getSnapchat() {
		return snapchat;
	}
	public void setSnapchat(String snapchat) {
		this.snapchat = snapchat;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getWhatsup() {
		return whatsup;
	}
	public void setWhatsup(String whatsup) {
		this.whatsup = whatsup;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phno=" + phno + ", facebook=" + facebook
				+ ", instagram=" + instagram + ", snapchat=" + snapchat + ", twitter=" + twitter + ", whatsup="
				+ whatsup + "]";
	}
	



	
	
}
