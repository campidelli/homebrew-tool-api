package com.campidelli.homebrew.api.model.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Definition of a country.
 * @author campidelli
 */
@Document(collection = "countries")
public class Country {

  @Id
  private String code;
  private String name;

  /**
   * Returns the ISO two-letter country code of this country.
   * @return The country code.
   */
  public String getCode() {
    return code;
  }

  /**
   * @param code the code to set
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Returns the name of this country.
   * @return the country name.
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
}
