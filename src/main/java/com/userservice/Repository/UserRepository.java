package com.userservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.userservice.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public User findFirstByEmail(String email);

    public boolean existsByEmail(String email);
}
