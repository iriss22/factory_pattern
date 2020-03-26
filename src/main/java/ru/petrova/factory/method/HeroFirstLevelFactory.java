package ru.petrova.factory.method;

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
