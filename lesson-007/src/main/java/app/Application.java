package app;

import domain.User;
import service.UserService;
import service.impl.UserServiceImpl;

public class Application {
	public static void main(String[] args) {

		UserService userService = new UserServiceImpl();
		userService.create(new User("test@test", "test", "test", "test", "test"));

	}

}