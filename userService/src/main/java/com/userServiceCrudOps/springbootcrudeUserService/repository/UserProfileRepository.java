package com.userServiceCrudOps.springbootcrudeUserService.repository;

import com.userServiceCrudOps.springbootcrudeUserService.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
    UserProfile findByUsername(String username);
}
