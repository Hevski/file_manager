package com.codeclan.example.fileservice.Repositories;

import com.codeclan.example.fileservice.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
