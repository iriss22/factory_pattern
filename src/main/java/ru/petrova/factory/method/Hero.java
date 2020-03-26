package ru.petrova.factory.method;

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

  public void addResource(int additionalHealth, int additionalSpeed, int additionalForce) {
    health += additionalHealth;
    speed += additionalSpeed;
    force += additionalForce;
  }

  public String getDescription() {
    return description;
  }
}
