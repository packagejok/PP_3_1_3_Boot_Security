package ru.kata.spring.boot_security.demo.dao;





import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User getUser(long id);

    User deleteUser(long id);
}
