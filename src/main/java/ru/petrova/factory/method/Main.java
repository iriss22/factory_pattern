package ru.petrova.factory.method;

public class Main {

  public static void main(String [] str) throws NotFoundHero {
    HeroFirstLevelFactory firstLevelFactory = new HeroFirstLevelFactory();
    System.out.println(firstLevelFactory.createHero(HeroType.troll).getDescription());

    HeroSecondLevelFactory secondLevelFactory = new HeroSecondLevelFactory();
    System.out.println(secondLevelFactory.createHero(HeroType.elf).getDescription());
  }
}
