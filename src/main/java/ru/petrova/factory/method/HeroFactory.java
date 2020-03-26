package ru.petrova.factory.method;

public abstract class HeroFactory {

  public abstract Hero createHero(HeroType heroType) throws NotFoundHero;
}
