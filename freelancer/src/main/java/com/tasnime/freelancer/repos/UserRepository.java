package com.tasnime.freelancer.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasnime.freelancer.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}

