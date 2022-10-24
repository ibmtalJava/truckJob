package truckJob;

public class Dispacher {
	private String name;
	private String surname;
	private String phone;
	private String mail;
	public Dispacher() {
		super();
	}
	public Dispacher(String name, String surname, String phone, String mail) {
		super();
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
 