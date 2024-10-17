package org.example.learn.spring.boot.webflux.hello.dao;

import org.example.learn.spring.boot.webflux.hello.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
