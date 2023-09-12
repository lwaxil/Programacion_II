package EJERCICIO_11;

public class Circle implements Movable {
    int radius;
    Point center;

    public Circle(int x, int y, int Xspeed, int Yspeed){
        this.center = new Point(x, y, Xspeed, Yspeed);
        this.radius = radius;
    }
    @Override
    public void moveUp() {
        this.center.moveUp();
    }
}
