package ru.petrova.factory.abstractf.hero;

import ru.petrova.factory.abstractf.HeroType;
import ru.petrova.factory.abstractf.level.LevelFactory;

public class Troll extends Hero {
  public Troll(LevelFactory levelFactory) {
    super(60, 1, 20, HeroType.troll.name(), levelFactory);
  }
}
