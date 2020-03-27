package ru.petrova.factory.abstractf.hero;

import ru.petrova.factory.abstractf.HeroType;
import ru.petrova.factory.abstractf.level.LevelFactory;

public class Bear extends Hero {
  public Bear(LevelFactory levelFactory) {
    super(40, 2, 10, HeroType.bear.name(), levelFactory);
  }
}
