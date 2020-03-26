package ru.petrova.factory.simple;

public class SimpleHeroFactory {

  public Hero createHero(HeroType heroType) throws NotFoundHero {
    switch (heroType) {
      case bear:
        return new Bear();
      case elf:
        return new Elf();
      case troll:
        return new Troll();
      default:
        throw new NotFoundHero(heroType);
    }
  }
}
