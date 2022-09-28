package com.company;

import java.awt.*;

public class ReferanceTypeData2 {
    public static void main(String args[]){
        byte x=1;
        byte y=x;
        x=2;
        //y=x;
        System.out.printf("value of y is :%d\n",y);
        //reference type data
        Point point1=new Point(1,1);
        Point point2=point1;
        System.out.println(point2);
        point1.x=32;
        point1.y=23;
        System.out.println(point2);

    }
}
