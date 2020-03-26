package ru.petrova.factory.simple;

public class Bear implements Hero {
  public HeroType getDescription() {
    return HeroType.bear;
  }

  public int getHealth() {
    return 40;
  }

  public int getSpeed() {
    return 2;
  }

  public int getForce() {
    return 10;
  }
}
