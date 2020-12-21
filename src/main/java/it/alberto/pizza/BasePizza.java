package it.alberto.pizza;

import java.util.ArrayList;
import java.util.List;

public class BasePizza extends Pizza{

  @Override
  public List<String> ingredients() {
    return new ArrayList<>();
  }
}
