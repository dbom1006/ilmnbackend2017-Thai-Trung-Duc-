
public class AvailabilityBean {
	private int id;
	private int idUser;
	private String firstName;
	private String lastName;
	private String day;
	private String time;
	public AvailabilityBean(int id, int idUser, String firstName, String lastName, String day, String time,
			boolean available) {
		super();
		this.id = id;
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.time = time;
		this.available = available;
	}
	private boolean available;
	public AvailabilityBean(int idUser, String day, String time, boolean available) {
		super();
		this.idUser = idUser;
		this.day = day;
		this.time = time;
		this.available = available;
	}
	public AvailabilityBean(int id, int idUser, String day, String time, boolean available) {
		super();
		this.id = id;
		this.idUser = idUser;
		this.day = day;
		this.time = time;
		this.available = available;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
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
}
