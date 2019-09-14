package com.simplon.esportdata.dtos;

import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class TournamentDto {

  @NotBlank
  @Size(min = 1, max = 50)
  private String tournamentName;
  @NotNull
  @FutureOrPresent
  private LocalDate startingDate;
  @NotNull
  @Future
  private LocalDate endingDate;
  @NotBlank
  private String game;
  @NotBlank
  private String organizer;
  private String city;
  private Double prizePool;
  private boolean online;

  public String getTournamentName() {
    return tournamentName;
  }

  public void setTournamentName(String tournamentName) {
    this.tournamentName = tournamentName;
  }

  public LocalDate getStartingDate() {
    return startingDate;
  }

  public void setStartingDate(LocalDate startingDate) {
    this.startingDate = startingDate;
  }

  public LocalDate getEndingDate() {
    return endingDate;
  }

  public void setEndingDate(LocalDate endingDate) {
    this.endingDate = endingDate;
  }

  public String getGame() {
    return game;
  }

  public void setGame(String game) {
    this.game = game;
  }

  public String getOrganizer() {
    return organizer;
  }

  public void setOrganizer(String organizer) {
    this.organizer = organizer;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Double getPrizePool() {
    return prizePool;
  }

  public void setPrizePool(Double prizePool) {
    this.prizePool = prizePool;
  }

  public boolean isOnline() {
    return online;
  }

  public void setOnline(boolean online) {
    this.online = online;
  }
}
