package com.company;

public class ArithmeticExpressions8 {
    public static void main(String[] args) {
        // like other mathematical expression java also has
        //"+"=plus operator
        // "-"=mines operator
        // "*"=multiplication operator
        // "/"=division operator
        /* "%"=mod operator which returns the end result or the number which is left
        after division
         */
        int result=10+3;
        System.out.printf("total sum is :%d\n",result);
        int sub=10-3;
        System.out.printf("total subtraction is:%d\n",sub);
        int mul=10*3;
        System.out.printf("total multiplication is:%d\n",mul);
        /*in java when we divide to numbers we only get the whole number
        we don't get the decimal point.well in that case we should use double or
         floating type variable
         */
        double div=(10/3);
        System.out.printf("total division is:%f\n",div);
        /*following this method we cant find the decimal point
        in order to get floating point we have to give the data type double or float
        before the two numbers.example below:
         */
        double div2=(double)10/(double)3;
        System.out.printf("total division is:%f\n",div2);
        //we also have increment and decrement operator in java
        int x=3;
        x++;
        int y=3;
        y--;
        System.out.printf("after incrementing the value of x:%d\n",x);
        System.out.printf("after decrementing the value of y:%d\n",y);
        //we can use increment and decrement operator as postfix or prefix
        int a=3;
        ++a;
        int b=3;
        --b;
        System.out.printf("after incrementing using postfix:%d\n",a);
        System.out.printf("after decrementing using postfix:%d\n",b);
        /* if we take increment operator under a variable and if we use
        postfix method "x--/x++" it will assign the value of x into variable y
        then the value of x will increment in this way suppose if we take x=2;
        then y will be 2 but after incrementing x=3;
        on the other hand if we use this method using prefix "++x/--x" then the
         value of x will increment first the it will assign in y and x and y both
          will show the same result
          example bellow:-
         */
        int p=2;
        int q=p++;
        System.out.printf("value of p:%d\n",p);
        System.out.printf("value of q:%d\n",q);
        int c=2;
        int d=++c;
        System.out.printf("value of c :%d\n",c);
        System.out.printf("value of d:%d\n",d);
        //in order to increment the value of z by 2;
        int z=1;
        z=z+2;
        System.out.printf("value of z:%d\n",z);
        /* we can use augmented or compound assignment operator
        like:-
        x+=2;
        x-=2;
        x*=2;
        x/=2;
         */




    }
}
