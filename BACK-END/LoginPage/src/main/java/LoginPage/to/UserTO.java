package LoginPage.to;

import javax.management.remote.SubjectDelegationPermission;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserTO {
	private String login, password;
	
	public UserTO() {
		super();
	}
	
	public UserTO(String login, String password) {
		super();
		this.login=login;
		this.password=password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
