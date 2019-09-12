package com.simplon.esportdata.services;

import com.simplon.esportdata.dtos.TournamentViewDto;

import java.util.List;


public interface TournamentService {

  List<TournamentViewDto> getAll();
  TournamentViewDto getById(Long id);
}
