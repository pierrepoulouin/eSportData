package com.simplon.esportdata.services;

import com.simplon.esportdata.dtos.OrganizerDto;
import com.simplon.esportdata.entities.Organizer;
import com.simplon.esportdata.repositories.OrganizerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class OrganizerServiceImpl implements OrganizerService {

  private final OrganizerRepository organizerRepository;
  private final ModelMapper modelMapper;

  public OrganizerServiceImpl(OrganizerRepository organizerRepository, ModelMapper modelMapper) {
    this.organizerRepository = organizerRepository;
    this.modelMapper = modelMapper;
  }

  @Override
  public void create(OrganizerDto organizerDto) {
    Organizer organizer = modelMapper.map(organizerDto, Organizer.class);
    organizerRepository.save(organizer);
  }
}
