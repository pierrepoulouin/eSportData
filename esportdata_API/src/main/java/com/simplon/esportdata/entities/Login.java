package com.simplon.esportdata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_login")
public class Login extends AbstractEntity {
  @Column(nullable = false)
  private String username;
  @Column(nullable = false)
  private String password;

  public Login() {
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
