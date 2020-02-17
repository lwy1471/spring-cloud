package com.honeybees.demolicensingservice.service;


import com.honeybees.demolicensingservice.config.ServiceConfig;
import com.honeybees.demolicensingservice.model.License;
import com.honeybees.demolicensingservice.repository.LicenseRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseService {

  @Autowired
  private LicenseRepository licenseRepository;

  @Autowired
  ServiceConfig config;

  public License getLicense(String orgId, String licenseId) {
    License license = licenseRepository.findByOrOrganizationIdAndLicenseId(orgId, licenseId);
    return license.setComment(config.getExampleProperty());
  }

  public List<License> getLicenseByOrg(String orgId) {
    return licenseRepository.findByOrOrganizationId(orgId);
  }

  public void saveLicense(License license) {
    license.setLicenseId(UUID.randomUUID().toString());
    licenseRepository.save(license);
  }
}
