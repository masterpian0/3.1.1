package masterpian0.dao;

import org.springframework.stereotype.Repository;
import masterpian0.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    public RoleDaoImpl() {
    }

    @Override
    public void addRole(Role role) {
        entityManager.persist(role);
    }

    @Override
    public List<Role> getRoles() {
        return entityManager.createQuery("from Role", Role.class).getResultList();
    }

    @Override
    public Role getRoleByName(String rolename) {
        return entityManager.createQuery("SELECT r FROM Role r where r.name = :name", Role.class)
                .setParameter("name", rolename)
                .getSingleResult();
    }

    @Override
    public Role getRoleById(long id) {
        return entityManager.find(Role.class, id);
    }
}
