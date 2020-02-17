package com.honeybees.demolicensingservice.controller;

import com.honeybees.demolicensingservice.model.License;
import com.honeybees.demolicensingservice.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/orgnizations/{organizationId}/licenses")
public class LicenseServiceController {

  @Autowired
  LicenseService service;


  @GetMapping(value = "/{licenseId}")
  public License getLicenses(
      @PathVariable("organizationId") String organizationId,
      @PathVariable("licenseId") String licenseId
  ) {
    return service.getLicense(organizationId, licenseId);
  }


}
