package com.simplon.esportdata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="t_tournament")
public class Tournament extends AbstractEntity {

  @Column(nullable = false, length = 50, unique = true)
  private String tournamentName;
  @Column(nullable = false)
  private LocalDate startingDate;
  @Column(nullable = false)
  private LocalDate endingDate;
  @Column(nullable = false)
  private String game;
  @Column(nullable = false)
  private String organizer;
  @Column
  private String city;
  @Column
  private Double prizePool;
  @Column
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

  public void setPrizePool(Double prizepool) {
    this.prizePool = prizepool;
  }

  public boolean isOnline() {
    return online;
  }

  public void setOnline(boolean online) {
    this.online = online;
  }
}
