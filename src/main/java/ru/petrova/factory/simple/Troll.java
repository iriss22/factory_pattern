package ru.petrova.factory.simple;

public class Troll implements Hero {
  public HeroType getDescription() {
    return HeroType.troll;
  }

  public int getHealth() {
    return 60;
  }

  public int getSpeed() {
    return 1;
  }

  public int getForce() {
    return 20;
  }
}
