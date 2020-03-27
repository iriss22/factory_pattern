package ru.petrova.factory.abstractf.level;

import ru.petrova.factory.abstractf.artifacts.Artifact;

public interface LevelFactory {
  int additionalSpeed();
  int additionalHealth();
  int additionalForce();
  Artifact getArtifact();
}
