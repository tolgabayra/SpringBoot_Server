package com.tolgabayrak.SpringApiServer.repository;

import com.tolgabayrak.SpringApiServer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
