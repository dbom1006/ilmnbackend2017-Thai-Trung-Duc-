import java.util.Date;

public class ContactBean {
	private int id;
	private int idUser;
	private int idAvailability;
	private Date time;
	public ContactBean(int idUser, int idAvailability, Date time) {
		super();
		this.idUser = idUser;
		this.idAvailability = idAvailability;
		this.time = time;
	}
	public ContactBean(int id, int idUser, int idAvailability, Date time) {
		super();
		this.id = id;
		this.idUser = idUser;
		this.idAvailability = idAvailability;
		this.time = time;
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
	public int getIdAvailability() {
		return idAvailability;
	}
	public void setIdAvailability(int idAvailability) {
		this.idAvailability = idAvailability;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
