package com.springapp.mvc.model.repo;

import com.springapp.mvc.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}