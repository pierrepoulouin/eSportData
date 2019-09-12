package com.simplon.esportdata.repositories;

import com.simplon.esportdata.dtos.TournamentViewDto;
import com.simplon.esportdata.entities.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long> {

  TournamentViewDto getById(Long id);
  List<TournamentViewDto> getAllTournamentBy();

}
