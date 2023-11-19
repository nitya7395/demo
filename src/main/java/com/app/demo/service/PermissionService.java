package com.app.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.entity.Permision;
import com.app.demo.repository.PermissionRepository;



@Service
public class PermissionService {
	
    @Autowired
    private PermissionRepository permisionRepository;

    public List<Permision> getAllPermissions() {
        return permisionRepository.findAll();
    }

    public Permision addPermission(Permision permission) {
        return permisionRepository.save(permission);
    }

    public void deletePermission(Long permissionId) {
    	permisionRepository.deleteById(permissionId);
    }
}
