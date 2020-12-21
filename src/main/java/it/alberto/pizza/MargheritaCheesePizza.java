package it.alberto.pizza;

import java.util.List;

public class MargheritaCheesePizza extends ToppedPizza{
  public MargheritaCheesePizza(Pizza pizza) {
    super(pizza);
  }

  @Override
  public List<String> addIngredients(List<String> ingredients) {
    ingredients.add("Cheese");
    return ingredients;
  }
}
