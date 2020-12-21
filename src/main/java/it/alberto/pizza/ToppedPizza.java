package it.alberto.pizza;

import java.util.List;

public abstract class ToppedPizza extends Pizza{
  private final Pizza pizza;
  public ToppedPizza(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public final List<String> ingredients() {
    return addIngredients(pizza.ingredients());
  }
  public abstract List<String> addIngredients(List<String> ingredients);
}
