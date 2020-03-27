package ru.petrova.factory.method.hero;

public abstract class Hero {

  private int health;
  private int speed;
  private int force;
  private String description;

  public Hero(int health, int speed, int force, String description) {
    this.health = health;
    this.speed = speed;
    this.force = force;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
