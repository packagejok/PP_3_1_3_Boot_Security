package ru.kata.spring.boot_security.demo.sequrity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.repositories.RoleRepository;

public class RolePrincipal implements GrantedAuthority {
    private final Role role;

    public RolePrincipal(Role role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.getName();
    }
}
