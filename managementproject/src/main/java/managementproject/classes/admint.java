package managementproject.classes;

public class admint {
	
	@Override
	public String toString() {
		return "admint [name=" + name + ", password=" + surname + "]";
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
	public void setSurname(String password) {
		this.surname = password;
	}
	protected String name;
	protected String surname;

}
