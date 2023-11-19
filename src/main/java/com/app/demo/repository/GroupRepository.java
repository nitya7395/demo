package com.app.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.entity.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
    
}
