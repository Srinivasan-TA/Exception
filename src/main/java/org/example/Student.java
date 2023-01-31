package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Student extends Mainb {
    private String name;
    private int gradeLevel;
    private double gpa;

    public Student(String name, int gradeLevel, double gpa) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    public String getInfo() {
        return name + " is in grade " + gradeLevel + " and has a " + gpa + " GPA";
    }
}

class Mainb{
    public static void main(String[] args) {
    Logger l = Logger.getLogger("com.api.jar");
        Scanner se = new Scanner(System.in);
        try{
        l.info("enter your name :");
        String name = se.next();
        l.info("enter your grade level :");
        int gradelevel = se.nextInt();
        l.info("Type the gpa :");
        double gpa= se.nextDouble();
        Student student = new Student(name,gradelevel,gpa);
        l.info(student.getInfo());
        student.updateGPA(3.7);
        l.info(student.getInfo());
    }
        catch(Exception e){
            l.info("Type the values correctly");
        }
    }

}