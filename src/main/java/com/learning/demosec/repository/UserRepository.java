package com.learning.demosec.repository;

import com.learning.demosec.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
