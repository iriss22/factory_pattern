package ru.petrova.factory.method;

public class NotFoundHero extends Exception {

  private HeroType heroType;

  public NotFoundHero(HeroType heroType) {
    this.heroType = heroType;
  }

  public HeroType getHeroType() {
    return heroType;
  }
}
