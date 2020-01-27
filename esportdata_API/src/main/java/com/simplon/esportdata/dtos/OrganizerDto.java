package com.simplon.esportdata.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class OrganizerDto {

  @NotBlank
  @Size(min = 1, max = 25)
  private String firstname;
  @NotBlank
  @Size(min = 1, max = 25)
  private String lastname;
  @NotNull
  @Past
  private LocalDate birthdate;
  @NotBlank
  @Email
  @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Invalid mail syntax")
  private String email;
  @NotBlank
  @Size(min = 1, max = 25)
  private String pseudo;

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
