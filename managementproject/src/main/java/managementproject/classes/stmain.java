package managementproject.classes;

public class stmain {
	private String firstname;
	private String  lastname;
	private int  rollno;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "stmain [firstname=" + firstname + ", lastname=" + lastname + ", rollno=" + rollno + "]";
	}
	
	}


