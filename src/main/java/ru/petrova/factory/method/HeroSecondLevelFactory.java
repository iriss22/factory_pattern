package ru.petrova.factory.method;

public class HeroSecondLevelFactory extends HeroFactory {

  @Override
  public Hero createHero(HeroType heroType) throws NotFoundHero {
    switch (heroType) {
      case bear:
        return new BearSecondLevel();
      case elf:
        return new ElfSecondLevel();
      case troll:
        return new TrollSecondLevel();
      default:
        throw new NotFoundHero(heroType);
    }
  }
}
