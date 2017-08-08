package com.campidelli.homebrew.api.model.recipe;

import java.util.List;

/**
 * Definition of a beer recipe;
 * @author campidelli
 */
public class Recipe {

  private List<Addition<Fermentable>> fermentables;
  private List<Addition<Hop>> hops;
  private List<Addition<Ingredient>> others;
  private String notes;

  /**
   * @return the fermentables
   */
  public List<Addition<Fermentable>> getFermentables() {
    return fermentables;
  }

  /**
   * @param fermentables the fermentables to set
   */
  public void setFermentables(List<Addition<Fermentable>> fermentables) {
    this.fermentables = fermentables;
  }

  /**
   * @return the hops
   */
  public List<Addition<Hop>> getHops() {
    return hops;
  }

  /**
   * @param hops the hops to set
   */
  public void setHops(List<Addition<Hop>> hops) {
    this.hops = hops;
  }

  /**
   * @return the others
   */
  public List<Addition<Ingredient>> getOthers() {
    return others;
  }

  /**
   * @param others the others to set
   */
  public void setOthers(List<Addition<Ingredient>> others) {
    this.others = others;
  }

  /**
   * @return the notes
   */
  public String getNotes() {
    return notes;
  }

  /**
   * @param notes the notes to set
   */
  public void setNotes(String notes) {
    this.notes = notes;
  }
}
