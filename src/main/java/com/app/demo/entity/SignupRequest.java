package com.app.demo.entity;

import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class SignupRequest {
	@NotBlank
	  @Size(max = 20)
	  private String firstName;
	  
	  @NotBlank
	  @Size(max = 20)
	  private String lastName;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;
  private Set<String> role;

  @NotBlank
  @Size(min = 6, max = 40)
  private String password;

  public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }
}
