package ru.petrova.factory.method.hero;

import ru.petrova.factory.method.BearFirstLevel;
import ru.petrova.factory.method.HeroFactory;
import ru.petrova.factory.method.HeroType;
import ru.petrova.factory.method.NotFoundHero;

public class HeroFirstLevelFactory extends HeroFactory {
  @Override
  public Hero createHero(HeroType heroType) throws NotFoundHero {
    switch (heroType) {
      case bear:
        return new BearFirstLevel();
      case elf:
        return new ElfFirstLevel();
      case troll:
        return new TrollFirstLevel();
      default:
        throw new NotFoundHero(heroType);
    }
  }
}
