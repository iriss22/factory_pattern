package ru.petrova.factory.method.hero;

import ru.petrova.factory.method.HeroType;

public class TrollSecondLevel extends Hero {
  public TrollSecondLevel() {
    super(70, 2, 30, "second level " + HeroType.troll);
  }
}
