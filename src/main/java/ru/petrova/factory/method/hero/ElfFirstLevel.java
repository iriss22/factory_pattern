package ru.petrova.factory.method.hero;

import ru.petrova.factory.method.HeroType;

public class ElfFirstLevel extends Hero {
  public ElfFirstLevel() {
    super(20, 4, 1, "first level " + HeroType.elf);
  }
}
