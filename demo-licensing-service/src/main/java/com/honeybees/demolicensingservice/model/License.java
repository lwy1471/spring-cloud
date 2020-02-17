package com.honeybees.demolicensingservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Data
@Accessors(chain = true)
public class License {
  @Id
  private String licenseId;
  private String organizationId;
  private String licenseType;
  private String productName;
  @Transient
  private String comment;
}
