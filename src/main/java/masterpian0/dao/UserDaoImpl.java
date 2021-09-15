package masterpian0.dao;

import org.springframework.stereotype.Repository;
import masterpian0.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    public UserDaoImpl() {
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void deleteUser(long id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);

    }

    @Override
    public User getUserByName(String name) {
        return entityManager.createQuery("SELECT u FROM User u where u.name = :name", User.class)
                .setParameter("name", name)
                .getSingleResult();
    }
}
