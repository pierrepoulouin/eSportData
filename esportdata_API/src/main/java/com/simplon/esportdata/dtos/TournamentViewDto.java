package com.simplon.esportdata.dtos;

import java.time.LocalDate;

public interface TournamentViewDto {

  Long getId();
  String getTournamentName();
  LocalDate getStartingDate();
  LocalDate getEndingDate();
  String getGame();
  String getOrganizer();
  String getCity();
  Double getPrizePool();
  boolean isOnline();
}
