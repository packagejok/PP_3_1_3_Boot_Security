package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.RoleDaoImpl;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;
    private final RoleDaoImpl roleDao;

    public RoleServiceImpl(RoleDaoImpl roleDao) {
        this.roleDao = roleDao;
    }

    public Role getRoleById(Long id) {
        return roleRepository.getRoleById(id);
    }
    public List<Role> getRolesList() {
        return roleDao.getRolesList();
    }
    public Set<Role> getSetOfRoles(List<String> rolesId){
        Set<Role> roleSet = new HashSet<>();
        for (String id: rolesId) {
            roleSet.add(getRoleById(Long.parseLong(id)));
        }
        return roleSet;
    }
}