package ru.petrova.factory.abstractf.hero;

import ru.petrova.factory.abstractf.HeroType;
import ru.petrova.factory.abstractf.level.LevelFactory;

public class Elf extends Hero {

  public Elf(LevelFactory levelFactory) {
    super(20, 4, 1, HeroType.elf.name(), levelFactory);
  }
}
