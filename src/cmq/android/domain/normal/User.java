package cmq.android.domain.normal;

public class User {

	private String code;
	private String name;
	
	public User(String code, String name) {
		this.code = code;
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	
}
