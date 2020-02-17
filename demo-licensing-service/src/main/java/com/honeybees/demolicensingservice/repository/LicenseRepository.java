package com.honeybees.demolicensingservice.repository;

import com.honeybees.demolicensingservice.model.License;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
  public List<License> findByOrOrganizationId(String organizationId);
  public License findByOrOrganizationIdAndLicenseId(String organizationId, String licenseId);

}
