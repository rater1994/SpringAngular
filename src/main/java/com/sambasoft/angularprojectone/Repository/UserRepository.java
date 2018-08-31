package com.sambasoft.angularprojectone.Repository;

import com.sambasoft.angularprojectone.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
