package com.campidelli.homebrew.api.model.recipe;

import com.campidelli.homebrew.api.model.unit.Countable;

/**
 * Recipe's ingredient addition.
 * @author campidelli
 */
public class Addition<T extends Ingredient> {

  private AdditionType additionType;
  private Countable amount;
  private T ingredient;

  /**
   * @return the additionType
   */
  public AdditionType getAdditionType() {
    return additionType;
  }

  /**
   * @param additionType the additionType to set
   */
  public void setAdditionType(AdditionType additionType) {
    this.additionType = additionType;
  }

  /**
   * @return the amount
   */
  public Countable getAmount() {
    return amount;
  }

  /**
   * @param amount the amount to set
   */
  public void setAmount(Countable amount) {
    this.amount = amount;
  }

  /**
   * @return the ingredient
   */
  public T getIngredient() {
    return ingredient;
  }

  /**
   * @param ingredient the ingredient to set
   */
  public void setIngredient(T ingredient) {
    this.ingredient = ingredient;
  }
}
