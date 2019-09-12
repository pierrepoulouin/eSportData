package com.simplon.esportdata.services;

import com.simplon.esportdata.dtos.TournamentViewDto;
import com.simplon.esportdata.repositories.TournamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentServiceImpl implements TournamentService {

  private TournamentRepository repo;

  protected TournamentServiceImpl(TournamentRepository repo) {
    this.repo = repo;
  }

  @Override
  public List<TournamentViewDto> getAll() {
    return repo.getAllTournamentBy();
  }

  @Override
  public TournamentViewDto getById(Long id) {
    return repo.getById(id);
  }
}
