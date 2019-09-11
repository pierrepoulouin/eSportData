package com.simplon.esportdata.controllers;

import com.simplon.esportdata.dtos.TournamentViewDto;
import com.simplon.esportdata.services.TournamentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
