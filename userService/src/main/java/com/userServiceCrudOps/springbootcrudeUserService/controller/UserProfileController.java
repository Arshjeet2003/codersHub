package com.userServiceCrudOps.springbootcrudeUserService.controller;

import com.userServiceCrudOps.springbootcrudeUserService.entity.UserProfile;
import com.userServiceCrudOps.springbootcrudeUserService.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserProfileController {

    @Autowired
    private UserProfileService service;

    @PostMapping("/addUserProfile")
    public UserProfile addUserProfile(@RequestBody UserProfile userProfile) {
        return service.saveUserProfile(userProfile);
    }
     @PostMapping("/addUserProfiles")
     public List<UserProfile> addUserProfiles(@RequestBody List<UserProfile> userProfiles) {
         return service.saveUserProfiles(userProfiles);
     }
    @GetMapping("/getAllUserProfiles")
    public List<UserProfile> findAllUserProfiles() {
        return service.getUserProfiles();
    }

     @GetMapping("/getUserProfileByUsername/{username}")
     public UserProfile findUserProfileByUsername(@PathVariable String username) {
         return service.getUserProfileByUsername(username);
     }
    
     @PutMapping("/updateUserProfile")
     public UserProfile updateUserProfile(@RequestBody UserProfile userProfile) {
         return service.updateUserProfile(userProfile);
     }
    
      @DeleteMapping("/deleteUserProfile/{id}")
    public String deleteUserProfile(@PathVariable int id) {
        return service.deleteUserProfile(id);
    }





}
