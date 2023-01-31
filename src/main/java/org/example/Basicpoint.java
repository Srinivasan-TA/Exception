package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Point implements Cloneable{
    Logger l = Logger.getLogger("com.api.jar");
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display(){
        l.info("value of x " + x);
        l.info("value of y " + y);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return x ==y;
        } else {
            return false;
        }
    }


    public Point clone() {
        return new Point(x, y);
    }
}

class Basicpoint {
    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner se = new Scanner(System.in);
        try {
            l.info("enter the x co-ordinate:");
            int x = se.nextInt();
            l.info("enter the y co-ordinate:");
            int y = se.nextInt();
            Point p1 = new Point(x, y);
            Point p2 = p1.clone();
            l.info(String.valueOf(p1.equals(p2)));
            p2.display();
        }
        catch(Exception e){
            l.info("error");
        }
    }
}
