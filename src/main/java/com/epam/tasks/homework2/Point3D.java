package com.epam.tasks.homework2;

public class Point3D extends Point2D {
    private int z;

    public Point3D(){
        super(3, 2);
    }

    public Point3D(int x, int y) {
        super(x, y);
    }
    public Point3D(int size) {
        super(size);
        z = size;
    }
}
