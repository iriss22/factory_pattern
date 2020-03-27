package ru.petrova.factory.abstractf.level;

import ru.petrova.factory.abstractf.artifacts.Artifact;
import ru.petrova.factory.abstractf.artifacts.ShieldAndSword;

public class SecondLevelFactory implements LevelFactory {
  @Override
  public int additionalSpeed() {
    return 1;
  }

  @Override
  public int additionalHealth() {
    return 10;
  }

  @Override
  public int additionalForce() {
    return 20;
  }

  @Override
  public Artifact getArtifact() {
    return new ShieldAndSword();
  }
}
