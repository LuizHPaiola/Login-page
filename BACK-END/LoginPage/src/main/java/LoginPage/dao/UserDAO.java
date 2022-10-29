package LoginPage.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import LoginPage.to.UserTO;

public class UserDAO {
	public static List<UserTO> userList;
	
	public UserDAO() {
		if(userList == null) {
			userList = new ArrayList<UserTO>();
			
			UserTO user = new UserTO();
			user.setLogin("Jungle");
			user.setPassword("123");
			
			userList.add(user);
			
			user = new UserTO();
			user.setLogin("Octopus");
			user.setPassword("8tentacles");
			
			user = new UserTO();
			user.setLogin("Cat");
			user.setPassword("9lifes");
		}
	}
	
	public UserTO loginDAO(UserTO u) {
		for(int i = 0; i<userList.size(); i++) {
			if(userList.get(i).getLogin().equals(u.getLogin()) 
					&& userList.get(i).getPassword().equals(u.getPassword())) {
				System.out.println("The user "+ userList.get(i).getLogin() + "has logged at " + Calendar.getInstance().getTime());
				
				return userList.get(i);
			}
		}
		
		System.out.println("The user "+ u.getLogin()+ "tryed to log at "+ Calendar.getInstance().getTime());
		return null;
	}
}
