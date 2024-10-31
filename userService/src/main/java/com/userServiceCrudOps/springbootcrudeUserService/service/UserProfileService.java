package com.userServiceCrudOps.springbootcrudeUserService.service;

import com.userServiceCrudOps.springbootcrudeUserService.entity.UserProfile;
import com.userServiceCrudOps.springbootcrudeUserService.repository.UserProfileRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserProfileService {

    private final UserProfileRepository repository;

    public UserProfileService(UserProfileRepository repository) {
        this.repository = repository;
    }

    public UserProfile saveUserProfile(UserProfile userProfile) {
        return repository.save(userProfile);
    }

    public List<UserProfile> saveUserProfiles(List<UserProfile> userProfiles) {
        return repository.saveAll(userProfiles);
    }

    public List<UserProfile> getUserProfiles() {
        return repository.findAll();
    }

    public UserProfile getUserProfileByUsername(String username) {
        return repository.findByUsername(username);
    }

    public UserProfile getUserProfileById(int id) {
        return repository.findById(id).orElse(null);
    }

    public UserProfile updateUserProfile(UserProfile userProfile) {
        UserProfile existingUserProfile = repository.findById(userProfile.getId()).orElse(null);
        if (existingUserProfile != null) {
            existingUserProfile.setName(userProfile.getName());
            existingUserProfile.setUsername(userProfile.getUsername());
            existingUserProfile.setProblemsSolved(userProfile.getProblemsSolved());
            existingUserProfile.setNumberOfSubmissions(userProfile.getNumberOfSubmissions());
            existingUserProfile.setuserRank(userProfile.getuserRank());
            return repository.save(existingUserProfile);
        }
        return null;
    }

    public String deleteUserProfile(int id) {
        repository.deleteById(id);
        return "User profile removed !! " + id;
    }
}
