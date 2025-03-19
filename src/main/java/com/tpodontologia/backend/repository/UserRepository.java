package com.tpodontologia.backend.repository;

import com.tpodontologia.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository {
    List<User> findByName(String name);
}
