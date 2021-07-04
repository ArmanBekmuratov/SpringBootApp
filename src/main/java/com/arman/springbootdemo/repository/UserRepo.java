package com.arman.springbootdemo.repository;

import com.arman.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {
}
