package com.app.demo.controller;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.entity.Permision;
import com.app.demo.service.PermissionService;

import io.jsonwebtoken.lang.Arrays;


@RestController
@RequestMapping("/api")
public class PermissionResource {

	@Autowired
    private PermissionService permissionService;

    @GetMapping("/permissions")
    public List<String> getAllPermissions() {
    	
       List<String> myList = new ArrayList<>();
       myList.add("ADD_GROUP");
       myList.add("STATUS_CHANGE");
       myList.add("DELETE_USER");
     return myList;
       
       //   return permissionService.getAllPermissions();
    }

    @PostMapping("/permission")
    public Permision createPermission(@RequestBody Permision permission) {
        return permissionService.addPermission(permission);
    }


    @DeleteMapping("permission/{permissionId}")
    public void deletePermission(@PathVariable Long permissionId) {
    	permissionService.deletePermission(permissionId);
    }
    
}

