package com.simplon.esportdata.services;

import com.simplon.esportdata.dtos.TournamentDto;
import com.simplon.esportdata.dtos.TournamentViewDto;
import com.simplon.esportdata.entities.Category;
import com.simplon.esportdata.entities.Tournament;
import com.simplon.esportdata.repositories.CategoryRepository;
import com.simplon.esportdata.repositories.TournamentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentServiceImpl extends AbstractService implements TournamentService, CategoryService {

    private final TournamentRepository repo;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    protected TournamentServiceImpl(TournamentRepository repo, CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.repo = repo;
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
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
        Tournament entity = modelMapper.map(tournamentDto, Tournament.class);
        repo.save(entity);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void update(Long id, TournamentDto tournamentDto) {
        Tournament tournament = findById(id, repo);
        modelMapper.map(tournamentDto, tournament);
        repo.save(tournament);
    }

    @Override
    @Cacheable("categories")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
