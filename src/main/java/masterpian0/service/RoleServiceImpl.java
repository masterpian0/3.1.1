package masterpian0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import masterpian0.dao.RoleDao;
import masterpian0.model.Role;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    @Autowired
    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    public List<Role> getRoles() {
        return roleDao.getRoles();
    }

    @Override
    public Role getRoleById(long id) {
        return roleDao.getRoleById(id);
    }

    @Override
    public Role getRoleByName(String rolename) {
        return roleDao.getRoleByName(rolename);
    }
}
