package org.example.game_object;

import org.example.game_object.GameObject;

import java.util.List;

public class GameObjectPool {
    List<GameObject> gameObjects;

    public void update() {
        for (GameObject gameObject: gameObjects) {
            gameObject.update();
        }
    }

}
