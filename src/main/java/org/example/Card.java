package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Carda{
    public static void main(String[] args)  {
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);
        try {
            l.info("Enter the credit card name:");
            String name = sc.nextLine();
            l.info("Enter the credit card number:");
            String number = sc.nextLine();
            l.info("enter the expiration date");
            String date = sc.nextLine();
            l.info("Enter the credit card number:");
            String number1 = sc.nextLine();
            Card s1 = new Card(name, number, date);
            Card s3 = (Card) s1.clone();
            l.log(Level.INFO, () -> "result is " + s3.equalling(number1));
            l.log(Level.INFO, () -> ":" + s1);
            l.log(Level.INFO, () -> ":" + s3);
        }
        catch (CloneNotSupportedException e){
            l.info("error");
        }
    }
}
class Card implements Cloneable{
     String name;
     String number ;
     String date;
    Card(String name,String number,String date){
        this.name =name;
        this.number =number;
        this.date =date;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    public boolean equalling(String number1){
            return number.equals(number1);
    }
}

