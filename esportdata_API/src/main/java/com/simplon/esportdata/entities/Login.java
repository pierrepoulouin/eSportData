package com.simplon.esportdata.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Login {
  @Column(nullable = false)
  private String username;
  @Column(nullable = false)
  private String password;

}
