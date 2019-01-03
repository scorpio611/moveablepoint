package com.codegym.point;

public class test extends Point3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(1, 2,3);
        System.out.println(point3D);
    }
}
