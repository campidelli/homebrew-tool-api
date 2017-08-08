package com.campidelli.homebrew.api.model.unit;

/**
 * Definition of temperature
 * @author campidelli
 */
public class Temperature {

  public enum Type {
    CELSIUS, FAHRENHEIT
  }

  private Type type;
  private Double value;

  /**
   * Construct a new temperature
   * @param type the type
   * @param value the value
   */
  public Temperature(Type type, Double value) {
    this.type = type;
    this.value = value;
  }

  /**
   * @return the type
   */
  public Type getType() {
    return type;
  }

  /**
   * @return the value
   */
  public Double getValue() {
    return value;
  }
}
