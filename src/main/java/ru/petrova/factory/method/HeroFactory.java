package ru.petrova.factory.method;

import ru.petrova.factory.method.hero.Hero;

public abstract class HeroFactory {

  public abstract Hero createHero(HeroType heroType) throws NotFoundHero;
}
