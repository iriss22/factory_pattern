package ru.petrova.factory.method.hero;

import ru.petrova.factory.method.HeroType;

public class ElfSecondLevel extends Hero {
  public ElfSecondLevel() {
    super(30, 5, 2, "second level " + HeroType.elf);
  }
}
