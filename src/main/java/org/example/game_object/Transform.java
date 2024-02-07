package org.example.game_object;

import org.example.math.Vector2F;

public class Transform {
    public Vector2F position;
    public Vector2F scale;
    public float rotation;

    public Transform(Vector2F position, Vector2F scale, float rotation) {
        this.position = position;
        this.scale = scale;
        this.rotation = rotation;
    }
    public Transform() {
        this.position = Vector2F.zero();
        this.scale = Vector2F.one();
        this.rotation = 0;
    }
}
