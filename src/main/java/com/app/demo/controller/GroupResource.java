package com.app.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.entity.Group;
import com.app.demo.service.GroupService;

@RestController
@RequestMapping("/api")
public class GroupResource {

	@Autowired
    private GroupService groupService;

    @GetMapping("/groups")
    public List<Group> getAllGroups() {
        return groupService.getAllGroups();
    }

    @PostMapping("/group")
    public Group createGroup(@RequestBody Group group) {
        return groupService.addGroup(group);
    }

    @DeleteMapping("group/{groupId}")
    public void deleteGroup(@PathVariable Long groupId) {
    	groupService.deleteGroup(groupId);
    }
    
}

