package com.challengeSpring.Repository;

import com.challengeSpring.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserId (Long userId);
}
