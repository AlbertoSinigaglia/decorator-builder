package it.alberto.pizza;

import java.util.List;

public class WurstelPizza extends ToppedPizza{
  public WurstelPizza(Pizza pizza) {
    super(pizza);
  }

  @Override
  public List<String> addIngredients(List<String> ingredients) {
    ingredients.add("Wurstel");
    return ingredients;
  }
}
