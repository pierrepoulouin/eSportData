package com.simplon.esportdata.services;

import com.simplon.esportdata.dtos.TournamentDto;
import com.simplon.esportdata.dtos.TournamentViewDto;
import com.simplon.esportdata.entities.Category;
import com.simplon.esportdata.entities.Tournament;
import com.simplon.esportdata.repositories.CategoryRepository;
import com.simplon.esportdata.repositories.TournamentRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentServiceImpl implements TournamentService, CategoryService {

  private final TournamentRepository repo;
  private final CategoryRepository categoryRepository;

  protected TournamentServiceImpl(TournamentRepository repo, CategoryRepository categoryRepository) {
    this.repo = repo;
    this.categoryRepository = categoryRepository;
  }

  @Override
  public List<TournamentViewDto> getAll() {
    return repo.getAllTournamentBy();
  }

  @Override
  public TournamentViewDto getById(Long id) {
    return repo.getById(id);
  }

  @Override
  public void create(TournamentDto tournamentDto) {
    Tournament tournament = new Tournament();
    tournament.setTournamentName(tournamentDto.getTournamentName());
    tournament.setStartDate(tournamentDto.getStartingDate());
    tournament.setEndingDate(tournamentDto.getEndingDate());
    tournament.setGame(tournamentDto.getGame());
    tournament.setOrganizer(tournamentDto.getOrganizer());
    tournament.setCity(tournamentDto.getCity());
    tournament.setPrizePool(tournamentDto.getPrizePool());
    tournament.setOnline(tournamentDto.isOnline());
    repo.save(tournament);
  }

  @Override
  @Cacheable("categories")
  public List<Category> getAllCategories() {
    return categoryRepository.findAll();
  }
}
