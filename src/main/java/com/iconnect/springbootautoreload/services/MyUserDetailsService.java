package com.iconnect.springbootautoreload.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.iconnect.springbootautoreload.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

    //get user from the database, via Hibernate
    @Autowired
    private UserRepo userRepo;

    @Transactional(readOnly=true)
    @Override
    public UserDetails loadUserByUsername(final String username)
            throws UsernameNotFoundException {

    com.iconnect.springbootautoreload.domain.User user = userRepo.findUserByUserName(username);
        List<GrantedAuthority> authorities =
                buildUserAuthority(user.getRole());

        return new User(user.getUserName(), user.getPassword(),
                user.isEnabled(), true, true, true, authorities);


    }

    // Converts com.mkyong.users.model.User user to
    // org.springframework.security.core.userdetails.User


    private List<GrantedAuthority> buildUserAuthority(String userRole) {

        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

        // Build user's authorities

            setAuths.add(new SimpleGrantedAuthority(userRole));


        List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
        System.out.println(Result);

        return Result;
    }

}