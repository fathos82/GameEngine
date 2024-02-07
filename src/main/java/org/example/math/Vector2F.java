package org.example.math;

public class Vector2F {
    public float x;
    public float y;

    public Vector2F(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Vector2F add(Vector2F vector) {
        return new Vector2F(x + vector.x, y + vector.y);
    }
    public Vector2F sub(Vector2F vector) {
        return new Vector2F(x - vector.x, y - vector.y);
    }
    public Vector2F mul(Vector2F vector) {
        return new Vector2F(x * vector.x, y * vector.y);
    }
    public Vector2F div(Vector2F vector) {
        return new Vector2F(x / vector.x, y / vector.y);
    }
    public static Vector2F zero() {
        return new Vector2F(0, 0);
    }
    public static Vector2F one() {
        return new Vector2F(1, 1);
    }

}
