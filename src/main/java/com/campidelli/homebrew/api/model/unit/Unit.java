package com.campidelli.homebrew.api.model.unit;

/**
 * Definition of unit
 * @author campidelli
 */
public class Unit implements Countable {

  public enum Type {
    UNIT, TEASPOON, CUP
  }

  private Type type;
  private Double value;

  /**
   * Construct a new unit
   * @param type the type
   * @param value the value
   */
  public Unit(Type type, Double value) {
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
  @Override
  public Double getValue() {
    return value;
  }
}
