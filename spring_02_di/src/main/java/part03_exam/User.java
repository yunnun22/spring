package part03_exam;

public class User {
	private String id;
	private String pass;

	public User() {

	}

	public User(String id, String pass) {
		
		this.id = id;
		this.pass = pass;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
