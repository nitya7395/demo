package com.app.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.entity.Group;
import com.app.demo.entity.Param;
import com.app.demo.entity.User;
import com.app.demo.repository.UserRepository;
import com.app.demo.service.GroupService;

@RestController
@RequestMapping("/api")
public class GroupResource {

	@Autowired
    private GroupService groupService;
	
	@Autowired
    private UserRepository userRepository;

    @GetMapping("/groups")
    public List<Group> getAllGroups() {
        return groupService.getAllGroups();
    }


    @PostMapping("/group")
    public Group createGroup(@RequestBody Map<String, Object>  groupData) {
    	
    	Group group = new Group();
    	 Long userId = Long.parseLong((String) groupData.get("userId"));
    	 Optional<User> user   = userRepository.findById(userId);
    	    
    //	Optional<User> user = userRepository.findById(Long.parseLong((String) groupData.get("userId") ));
    	
    		group.setName(Param.valueOf((String) groupData.get("name")));
    	group.setUser(user.get());
        return groupService.addGroup(group);
    }

    @DeleteMapping("group/{groupId}")
    public void deleteGroup(@PathVariable Long groupId) {
    	groupService.deleteGroup(groupId);
    }
    
}

