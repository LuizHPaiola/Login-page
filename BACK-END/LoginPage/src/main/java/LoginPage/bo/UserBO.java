package LoginPage.bo;

import LoginPage.dao.UserDAO;
import LoginPage.to.UserTO;

public class UserBO {
	UserDAO ud = null;
	
	public UserTO validation(UserTO u) {
		ud = new UserDAO();
		return ud.loginDAO(u);
	}
}
