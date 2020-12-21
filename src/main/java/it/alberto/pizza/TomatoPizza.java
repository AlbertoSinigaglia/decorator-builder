package it.alberto.pizza;

import java.util.List;

public class TomatoPizza extends ToppedPizza {
  public TomatoPizza(Pizza pizza) {
    super(pizza);
  }

  @Override
  public List<String> addIngredients(List<String> ingredients) {
    ingredients.add("Tomato");
    return ingredients;
  }
}
