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

}
