package com.company;

public class SwitchStatements19 {
    public static void main(String[] args) {
        /* in the switch statements it works like if else statements
        we can use any type of data as variable then give the variable in switch(v)
        then use curly braces and give one case then use break
        for each cases we have to give break statements
        but for the final statements we use default and dont need to give any break
        statement
         */
        String role="admin";
        switch(role){
            case"admin":
                System.out.println("you are an admin");
                break;
            case"moderaror":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are a guest");
        }
        if(role=="admin")
            System.out.println("you are an admin");
        else if(role=="moderator")
            System.out.println("you are a moderator");
        else
            System.out.println("you are a guest");

    }
}
