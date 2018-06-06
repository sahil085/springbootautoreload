package com.iconnect.springbootautoreload.repository;

import com.iconnect.springbootautoreload.domain.UserIyf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserIyfRepo extends JpaRepository<UserIyf,Long> {

}
