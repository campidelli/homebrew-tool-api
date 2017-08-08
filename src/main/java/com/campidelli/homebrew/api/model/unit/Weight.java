package com.campidelli.homebrew.api.model.unit;

/**
 * Definition of weight
 * @author campidelli
 */
public class Weight implements Countable {

  public enum Type {
    KILOGRAM, POUND
  }

  private Type type;
  private Double value;

  /**
   * Construct a new weight
   * @param type the type
   * @param value the value
   */
  public Weight(Type type, Double value) {
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
