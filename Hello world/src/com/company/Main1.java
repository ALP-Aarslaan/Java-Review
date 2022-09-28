package com.company;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;

public class Main1 {

    public static void main(String[] args) {
        int age = 30, temperature = 20;
       int herage = age;
	   System.out.println(age);
	   System.out.println(temperature);
	   byte myage = 30;
	   long views_Count= 3_123_456_789L;
	   float price= 10.45F;
	   double price1= 10.45678;
	   char letter='A';
	   boolean incorrect = true;
	   System.out.println(myage);
	   System.out.println(price);
	   System.out.println(views_Count);
	   System.out.println(price1);
	   System.out.println(letter);
	   System.out.println(incorrect);
        Date now = new Date();
        System.out.println(now);
        byte x=1;
        byte y=x;
        x=2;
        System.out.println(y);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x=2;
        System.out.println(point2);
        String messege = new String("     hello world"+"!!");
        String messege1 = "Hello World" + " this is my first java code";
        System.out.println(messege);
        System.out.println(messege1);
        System.out.println(messege1.endsWith("code"));
        System.out.println(messege.startsWith("!!"));
        System.out.println(messege1.length());
        System.out.println(messege1.indexOf("h"));
        System.out.println(messege.indexOf("sky"));
        System.out.println(messege.replace("!","*"));
        System.out.println(messege1.toLowerCase());
        System.out.println(messege1.toUpperCase());
        System.out.println(messege.toLowerCase());
        System.out.println(messege.trim());



    }
}
