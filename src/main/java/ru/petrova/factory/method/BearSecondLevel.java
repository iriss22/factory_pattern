package ru.petrova.factory.method;

import ru.petrova.factory.method.hero.Hero;

public class BearSecondLevel extends Hero {
  public BearSecondLevel() {
    super(50, 1, 20, "second level " + HeroType.bear);
  }
}
