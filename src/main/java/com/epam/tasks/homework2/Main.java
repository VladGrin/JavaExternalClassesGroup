package com.epam.tasks.homework2;
public class Main{
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        Point3D point3D = new Point3D(2, 3);
    }
}
class Point2D {
    public int x;
    public int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(int size) {
        this(size, size);
    }
}

