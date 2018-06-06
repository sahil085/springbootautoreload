package com.iconnect.springbootautoreload.repository;

import com.iconnect.springbootautoreload.domain.Friends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepo extends JpaRepository<Friends,Long> {

}
