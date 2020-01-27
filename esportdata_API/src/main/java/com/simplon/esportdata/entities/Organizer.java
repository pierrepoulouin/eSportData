package com.simplon.esportdata.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "t_organizer")
public class Organizer extends AbstractEntity {

  @Column(length = 25, nullable = false)
  private String firstname;

  @Column(length = 25, nullable = false)
  private String lastname;

  @Column(nullable = false)
  private LocalDate birthdate;

  @Column(nullable = false)
  private String email;

  @Column(length = 25, nullable = false)
  private String pseudo;

  public Organizer() {
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPseudo() {
    return pseudo;
  }

  public void setPseudo(String pseudo) {
    this.pseudo = pseudo;
  }
}
