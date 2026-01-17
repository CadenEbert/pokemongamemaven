

Pokémon Clicker (JavaFX)
========================

A simple Pokémon-themed clicker game built with JavaFX. Click the ball to earn coins, buy Poké Balls, badges, and trainers, and manage your inventory/PC storage.

Requirements
------------
- JDK 17
- Maven 3.8+
- JavaFX runtime (handled by the Maven JavaFX plugin in this project)

Screenshots
------------
Main Screen

![Main screen](images/UI.png)

Inventory and Pokeball Opening Example
![PC view](images/inventory.png)

Project Layout
--------------
- [src/main/java/javafx](src/main/java/javafx): Application code (Main, Controller, PC view, etc.).
- [src/main/java/api](src/main/java/api): API helpers.
- [src/main/java/javafx/fxml](src/main/java/javafx/fxml): FXML views and styling.
- [src/test/java/javafx/PokeBallRollTest.java](src/test/java/javafx/PokeBallRollTest.java): Sample JUnit test.
- [pokemon.txt](pokemon.txt) and [pokemonShinys.txt](pokemonShinys.txt): Pokémon data files used by the game.

How to Run
----------
From the project root:

```
mvn javafx:run
```

If you have multiple Java installations, ensure `JAVA_HOME` points to JDK 17.




