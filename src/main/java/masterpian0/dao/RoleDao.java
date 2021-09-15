package masterpian0.dao;

import masterpian0.model.Role;

import java.util.List;

public interface RoleDao {

    void addRole(Role role);

    List<Role> getRoles();

    Role getRoleById(long id);

    Role getRoleByName(String rolename);
}