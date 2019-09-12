package com.simplon.esportdata.controllers;

import com.simplon.esportdata.services.AdminService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@RestController
public class AdminController {

  private final AdminService service;

  protected AdminController(AdminService service) {

    this.service = service;
  }

  @DeleteMapping("/cache/{region}")
  protected void clearCacheRegion(@PathVariable("region") String region) {
    service.clearCacheRegion(region);
  }

  @DeleteMapping("/caches")
  protected void clearCacheRegions() {
    service.clearCacheRegions();
  }
}
