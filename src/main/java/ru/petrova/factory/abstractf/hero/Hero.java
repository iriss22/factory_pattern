package ru.petrova.factory.abstractf.hero;

import ru.petrova.factory.abstractf.level.LevelFactory;
import ru.petrova.factory.abstractf.artifacts.Artifact;

public abstract class Hero {

  private int health;
  private int speed;
  private int force;
  private Artifact artifact;
  private String description;

  public Hero(int health, int speed, int force, String description, LevelFactory levelFactory) {
    this.health = health + levelFactory.additionalHealth();
    this.speed = speed + levelFactory.additionalSpeed();
    this.force = force + levelFactory.additionalForce();
    this.artifact = levelFactory.getArtifact();
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
