package ru.petrova.factory.abstractf;

import ru.petrova.factory.abstractf.hero.Bear;
import ru.petrova.factory.abstractf.hero.Troll;
import ru.petrova.factory.abstractf.level.FirstLevelFactory;
import ru.petrova.factory.abstractf.level.SecondLevelFactory;

public class Main {

  public static void main(String [] str) {
    System.out.println(new Bear(new FirstLevelFactory()).getDescription());

    System.out.println(new Troll(new SecondLevelFactory()).getDescription());
  }
}
