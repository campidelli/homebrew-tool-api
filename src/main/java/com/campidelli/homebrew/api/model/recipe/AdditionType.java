package com.campidelli.homebrew.api.model.recipe;

/**
 * Definition of addition type
 * @author campidelli
 */
public class AdditionType {

  public enum Type {
    MASH, AFTER_MASH_BEFORE_BOIL, BOIL, AFTER_BOIL, DRY_HOP
  }

  private Type type;
  private Integer minutes;

  /**
   * Construct a new unit
   * @param type the type
   * @param minutes the minutes
   */
  public AdditionType(Type type, Integer minutes) {
    this.type = type;
    this.minutes = minutes;
  }

  /**
   * @return the type
   */
  public Type getType() {
    return type;
  }

  /**
   * @return the minutes
   */
  public Integer getMinutes() {
    return minutes;
  }
}
