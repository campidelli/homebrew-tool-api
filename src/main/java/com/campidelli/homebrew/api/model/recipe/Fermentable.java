package com.campidelli.homebrew.api.model.recipe;

import com.campidelli.homebrew.api.model.calculator.Color;
import com.campidelli.homebrew.api.model.calculator.Gravity;

/**
 * Definition of a fermentable ingredient.
 * @author campidelli
 */
public class Fermentable extends Ingredient {

  public enum Type {
    GRAIN, EXTRACT, ADJUNCT, OTHER
  }

  private Type type;
  private Gravity potentialSG;
  private Color color;

  /**
   * @return the type
   */
  public Type getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(Type type) {
    this.type = type;
  }

  /**
   * @return the potentialSG
   */
  public Gravity getPotentialSG() {
    return potentialSG;
  }

  /**
   * @param potentialSG the potentialSG to set
   */
  public void setPotentialSG(Gravity potentialSG) {
    this.potentialSG = potentialSG;
  }

  /**
   * @return the color
   */
  public Color getColor() {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(Color color) {
    this.color = color;
  }
}
