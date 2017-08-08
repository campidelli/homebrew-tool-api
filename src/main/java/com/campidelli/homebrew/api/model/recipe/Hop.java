package com.campidelli.homebrew.api.model.recipe;

/**
 * Definition of a fermentable ingredient.
 * @author campidelli
 */
public class Hop extends Ingredient {

  public enum Type {
    PELLET, WHOLE
  }

  private Type type;
  private Double alphaAcid;

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
   * @return the alphaAcid
   */
  public Double getAlphaAcid() {
    return alphaAcid;
  }

  /**
   * @param alphaAcid the alphaAcid to set
   */
  public void setAlphaAcid(Double alphaAcid) {
    this.alphaAcid = alphaAcid;
  }
}
