package com.company.Task_9;

public class Main {

    public static void main(String[] args) {

        Point p = new Point(2,3).translate(2,3).scale(0.5);
        System.out.println(p.getX());
        System.out.println(p.getY());

    }

}
