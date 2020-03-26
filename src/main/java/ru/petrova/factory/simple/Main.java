package ru.petrova.factory.simple;

public class Main {

  public static void main(String [] str) throws NotFoundHero {
    SimpleHeroFactory factory = new SimpleHeroFactory();
    System.out.println(factory.createHero(HeroType.elf).getDescription());
    System.out.println(factory.createHero(HeroType.bear).getDescription());
  }
}
