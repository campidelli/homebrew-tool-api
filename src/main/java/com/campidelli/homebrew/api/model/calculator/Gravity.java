package com.campidelli.homebrew.api.model.calculator;

/**
 * Definition of gravity (or sugar density related with water density).
 * @author campidelli
 */
public class Gravity {

  public enum Type {
    SPECIFIC, ORIGINAL, FINAL
  }

  private Type type;
  private Double value;

  /**
   * Construct a new gravity
   * @param type the type
   * @param value the value
   */
  public Gravity(Type type, Double value) {
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
