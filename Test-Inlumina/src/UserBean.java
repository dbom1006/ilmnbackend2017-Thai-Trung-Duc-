
public class UserBean {
	private int id;
	private String firstName;
	private String lastName;
	private boolean isSeller;
	public UserBean(int id, String firstName, String lastName, boolean isSeller) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isSeller = isSeller;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isSeller() {
		return isSeller;
	}
	public UserBean(String firstName, String lastName, boolean isSeller) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.isSeller = isSeller;
	}
	public void setSeller(boolean isSeller) {
		this.isSeller = isSeller;
	}
}
