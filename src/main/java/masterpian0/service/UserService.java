package masterpian0.service;

import masterpian0.model.User;

import java.util.List;

public interface UserService {

    void deleteUser(long id);

    void updateUser(User user);

    void createUser(User user);

    List<User> getUsers();

    User getUserById(long id);

    boolean isPasswordChanged (String password, String newPassword);
}

