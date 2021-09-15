package masterpian0.dao;

import masterpian0.model.User;

import java.util.List;

public interface UserDao {

    void deleteUser(long id);

    void updateUser(User user);

    List<User> getUsers();

    User getUserById(long id);

    User getUserByName(String name);
}
