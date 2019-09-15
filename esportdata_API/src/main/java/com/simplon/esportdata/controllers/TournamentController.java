package com.simplon.esportdata.controllers;

import com.simplon.esportdata.dtos.TournamentDto;
import com.simplon.esportdata.dtos.TournamentViewDto;
import com.simplon.esportdata.services.TournamentService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    private final TournamentService service;

    protected TournamentController(TournamentService service) {
        this.service = service;
    }

    @GetMapping
    protected List<TournamentViewDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    protected TournamentViewDto getOne(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping
    protected void createTournament(@RequestBody @Valid TournamentDto tournament) {
        service.create(tournament);
    }

    @DeleteMapping("/{id}")
    protected void deleteTournament(@PathVariable("id") Long id) {
        service.delete(id);
    }

}
