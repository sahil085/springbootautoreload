package com.iconnect.springbootautoreload;

import com.iconnect.springbootautoreload.domain.Friends;
import com.iconnect.springbootautoreload.domain.Student;
import com.iconnect.springbootautoreload.domain.User;
import com.iconnect.springbootautoreload.repository.FriendsRepo;
import com.iconnect.springbootautoreload.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.List;
import java.util.*;

@CrossOrigin(origins= "http://localhost:4200")
@RestController

public class Rest {

    @Autowired
    UserRepo userRepo;

    @Autowired
    FriendsRepo friendsRepo;

    @GetMapping(value = "/getdetail", produces = MediaType.APPLICATION_JSON_VALUE)
    public java.util.List<Map<String,User>> getDetails(HttpServletResponse response, HttpServletRequest request ) {
        java.util.List<Map<String,User>> strings=new ArrayList<>();
        Map<String, User> map = new HashMap<>();

        User user=new User();
        user.setUserName("krishna");
        user.setRole("admin");
        map.put("radhe",user );


        strings.add(map);


        return strings;
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping(value = "/getadmin")
    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        System.out.println(username);
        User user = userRepo.findUserByUserName(username);


        System.out.println(user);
        return user;
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping(value = "/getdata")
    public User getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        System.out.println(username);
        User user = userRepo.findUserByUserName(username);
        user.setUserName("radheee shyaaamm");


        System.out.println(user);
        return user;
    }


    @PreAuthorize("hasAuthority('ADMI')")
    @GetMapping("/getcurrentuserdetails")
    public User getCurrentUserDetails() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        System.out.println(username);
        User user = userRepo.findUserByUserName(username);


        System.out.println(user);
        return user;
    }


    @PostMapping(value = "/sendfrndrqst", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> sendFrndRqst(@RequestBody Long id) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        System.out.println(username);
        User user = userRepo.findUserByUserName(username);
        System.out.println("id ---- " + id);
        Friends friends = new Friends();
        friends.setStatus("Pending");

        friends.setUserAId(user.getId());
        friends.setUserBId(id);

        friendsRepo.save(friends);
        friendsRepo.flush();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/acceptfrndrqst")
    public boolean acceptrequest(@RequestBody Long id) {
        return true;

    }

//    @PostMapping("/createUser")
//    public ResponseEntity<String> createNewUser(@RequestBody UserIyf userIyf)
//    {
//
//    }

    @PutMapping(value = "/adduser")
    public void addUser(@RequestBody Student student)
    {
        System.out.println("------------- "+student);
    }

    @PutMapping(value = "/signup")
    public ResponseEntity<User> createNewuser(@RequestBody User user)
    {
        System.out.println(" ---------  "+user);
        user.setRole("USER");
        user.setEnabled(true);
        userRepo.save(user);
        return ResponseEntity.ok(user);
    }
}
