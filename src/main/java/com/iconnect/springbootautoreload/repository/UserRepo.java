package com.iconnect.springbootautoreload.repository;

import com.iconnect.springbootautoreload.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

     User findUserByUserName(String username);
}
