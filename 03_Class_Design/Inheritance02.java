class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    public String toString() {
        return "Point(" + this.x + ", " + this.y + ")";
    }
}

interface Shape {
    public Shape move(Point delta);
}

class Rectangle implements Shape {
    private Point topLeft;
    private Point bottomRight; 

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Shape move(Point delta) {
        return new Rectangle(this.topLeft.add(delta), this.bottomRight.add(delta));
    }

    public String toString() {
        return "Rectangle(" + topLeft + ", " + bottomRight + ")";
    }
}


public class Inheritance02 {
    public static void main(String[] args) {
       Point a = new Point(1,2);
       Point b = new Point(2,3);
       System.out.println("add " + a.add(b));

       Rectangle s = new Rectangle(new Point(0,0), new Point(4,5));
       System.out.println(s);
       System.out.println(s.move(new Point(5,6)));
    }
}
