package com.demo.quickpoll.repository;

import com.demo.quickpoll.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
