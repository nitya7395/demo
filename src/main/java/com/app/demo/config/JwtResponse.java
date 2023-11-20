package com.app.demo.config;

import java.util.List;

import com.app.demo.entity.Group;
import com.app.demo.entity.Param;

public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;
  private String email;
  private Boolean isActive;
  private List<String> roles;
  private List<Param> groups;
  

  public JwtResponse(String accessToken, Long id, String username, String email, Boolean isActive, List<String> roles, List<Param> groups) {
    this.token = accessToken;
    this.id = id;
    this.username = username;
    this.email = email;
    this.roles = roles;
    this.setGroups(groups);
    this.isActive=isActive;
  }

  public String getAccessToken() {
    return token;
  }

  public Boolean getIsActive() {
	return isActive;
}

public void setAccessToken(String accessToken) {
    this.token = accessToken;
  }

  public String getTokenType() {
    return type;
  }

  public void setTokenType(String tokenType) {
    this.type = tokenType;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<String> getRoles() {
    return roles;
  }

public List<Param> getGroups() {
	return groups;
}

public void setGroups(List<Param> groups) {
	this.groups = groups;
}
}
