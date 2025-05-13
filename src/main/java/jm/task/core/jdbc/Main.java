package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 33);
        userService.saveUser("Fedor", "Fedorov", (byte) 23);
        userService.saveUser("Stepan", "Stepanov", (byte) 44);
        userService.saveUser("Artem", "Artemov", (byte) 68);

        List<User> usersAll = userService.getAllUsers();
        usersAll.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
