package com.simplon.esportdata.entities;

import javax.persistence.Entity;

@Entity
public class Login extends AbstractEntity {
  private String username;
  private String password;

}
