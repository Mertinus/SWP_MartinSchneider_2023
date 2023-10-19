package game.strategy;

public class MoveRight implements MoveStrategy {
    private float x, y, speed;

    public MoveRight(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void Move() {
        this.x += speed;
    }

    @Override
    public float GetX() {
        return this.x;
    }

    @Override
    public float GetY() {
        return this.y;
    }
}
