package com.myorganisation.ewallet.user52.repository;

import com.myorganisation.ewallet.user52.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
