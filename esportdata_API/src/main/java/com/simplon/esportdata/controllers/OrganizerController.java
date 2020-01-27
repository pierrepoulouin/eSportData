package com.simplon.esportdata.controllers;

import com.simplon.esportdata.dtos.OrganizerDto;
import com.simplon.esportdata.services.OrganizerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {

  private final OrganizerService organizerService;

  public OrganizerController(OrganizerService organizerService) {
    this.organizerService = organizerService;
  }

  @PostMapping
  protected void createOrganizer(@Valid @RequestBody OrganizerDto organizer) {
    organizerService.create(organizer);
  }
}
