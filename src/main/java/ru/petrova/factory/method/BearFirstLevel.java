package ru.petrova.factory.method;

import ru.petrova.factory.method.hero.Hero;

public class BearFirstLevel extends Hero {
  public BearFirstLevel() {
    super(40, 2, 10, "first level " + HeroType.bear);
  }
}
