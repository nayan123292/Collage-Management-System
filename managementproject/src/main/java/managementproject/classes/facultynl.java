package managementproject.classes;

public class facultynl {
	private String firstname;
	private String lastname;
	private int id;
	
	@Override
	public String toString() {
		return "facultynl [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + "]";
	}
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
