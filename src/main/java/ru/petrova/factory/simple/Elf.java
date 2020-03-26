package ru.petrova.factory.simple;

public class Elf implements Hero {
  public HeroType getDescription() {
    return HeroType.elf;
  }

  public int getHealth() {
    return 20;
  }

  public int getSpeed() {
    return 4;
  }

  public int getForce() {
    return 1;
  }
}
