package ru.petrova.factory.abstractf.level;

import ru.petrova.factory.abstractf.artifacts.Artifact;
import ru.petrova.factory.abstractf.artifacts.Sword;

public class FirstLevelFactory implements LevelFactory {
  @Override
  public int additionalSpeed() {
    return 0;
  }

  @Override
  public int additionalHealth() {
    return 0;
  }

  @Override
  public int additionalForce() {
    return 0;
  }

  @Override
  public Artifact getArtifact() {
    return new Sword();
  }
}
