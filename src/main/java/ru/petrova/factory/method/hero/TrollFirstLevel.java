package ru.petrova.factory.method.hero;

import ru.petrova.factory.method.HeroType;

public class TrollFirstLevel extends Hero {
  public TrollFirstLevel() {
    super(60, 1, 20, "first level " + HeroType.troll);
  }
}
