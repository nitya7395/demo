package com.app.demo.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.demo.entity.Permision;



@Repository
public interface PermissionRepository extends JpaRepository<Permision, Long> {
    
}
