package com.company;

public class LogicalOperators16 {
    public static void main(String[]args){
        //logical operator
        /*logical and operator (&&)
            a statement will be true if two condition before and after of &&
            operator both are true
         */
        int temperature=25;
        boolean isWarm=temperature>20 && temperature<30;
        System.out.println(isWarm);
        /* logical or operator  (||)
        this or operator works like:
        if two condition or even if only one condition is true then the statement
        will be true

         */
        boolean hasGoodQuality=true;
        boolean hasGoodCharacter=true;
        boolean worthy = hasGoodCharacter||hasGoodQuality;
        System.out.println(worthy);
        /* not operator (!)
        if we give not operator before a true statement then it becomes false
        and false statement becomes true
         */
        boolean haveMoney=!true;
        boolean haveIdea=!true;
        boolean canShine=haveIdea||haveMoney;
        System.out.println(canShine);
        /*we can use multiple statements like
        (a>b||b>c)&& !z;
         */



    }
}
