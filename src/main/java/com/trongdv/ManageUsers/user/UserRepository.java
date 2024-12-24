package com.trongdv.ManageUsers.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);

    Long countById(Integer id);
}
