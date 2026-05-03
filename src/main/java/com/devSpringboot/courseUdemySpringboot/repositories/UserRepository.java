package com.devSpringboot.courseUdemySpringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devSpringboot.courseUdemySpringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
