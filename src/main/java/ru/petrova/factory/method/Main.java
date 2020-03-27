package ru.petrova.factory.method;

import ru.petrova.factory.method.hero.HeroFirstLevelFactory;
import ru.petrova.factory.method.hero.HeroSecondLevelFactory;

public class Main {

  public static void main(String [] str) throws NotFoundHero {
    HeroFactory firstLevelFactory = new HeroFirstLevelFactory();
    System.out.println(firstLevelFactory.createHero(HeroType.troll).getDescription());

    HeroFactory secondLevelFactory = new HeroSecondLevelFactory();
    System.out.println(secondLevelFactory.createHero(HeroType.elf).getDescription());
  }
}
