package com.campidelli.homebrew.api.model.calculator;

/**
 * Definition of color.
 * @author campidelli
 */
public class Color {

  public enum Type {
    SRM, EBC, LOVIBOND
  }

  private Type type;
  private Double value;

  /**
   * Construct a new color
   * @param type the type
   * @param value the value
   */
  public Color(Type type, Double value) {
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
