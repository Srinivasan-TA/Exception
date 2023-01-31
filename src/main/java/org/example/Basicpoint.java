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
        String s ="value of x " + x;
        l.info(s);
        String r ="value of y " + y;
        l.info(r);
    }

    public boolean equalling(Object obj) {
        if (obj instanceof Point) {
            return x ==y;
        } else {
            return false;
        }
    }

    public Point clone() throws CloneNotSupportedException {
        super.clone();
        return new Point(x, y);
    }
}

class Basicpoint {
    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner se = new Scanner(System.in);
        try {
            String s="enter the x co-ordinate:";
            l.info(s);
            int x = se.nextInt();
            String r="enter the y co-ordinate:";
            l.info(r);
            int y = se.nextInt();
            Point p1 = new Point(x,y);
            Point p2 = p1.clone();
            String a =String.valueOf(p1.equalling(p2));
            l.info(a);
            p2.display();
        }
        catch(Exception e){
            l.info("error");
        }
    }
}
