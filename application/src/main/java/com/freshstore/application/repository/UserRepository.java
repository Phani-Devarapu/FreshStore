package com.freshstore.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshstore.application.model.*;

public interface UserRepository extends JpaRepository<users, Long> {


}
