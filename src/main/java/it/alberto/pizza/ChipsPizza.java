package it.alberto.pizza;

import java.util.List;

public class ChipsPizza extends ToppedPizza{
  public ChipsPizza(Pizza pizza) {
    super(pizza);
  }

  @Override
  public List<String> addIngredients(List<String> ingredients) {
    ingredients.add("Chips");
    return ingredients;
  }
}
