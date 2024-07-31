package com.Practise.MethodArgumentNaotValidError.Repository;

import com.Practise.MethodArgumentNaotValidError.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
