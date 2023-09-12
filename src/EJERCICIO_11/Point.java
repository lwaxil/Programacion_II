package EJERCICIO_11;

public class Point implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public Point(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y = this.y+1;
    }
}
