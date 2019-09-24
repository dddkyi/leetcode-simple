package main.homework;

import java.util.*;

public class homework3 {

    public static void shape(String name){
        System.out.println("Which shape would you like? (trapezoid, triangle, or pyramid)");
        System.out.print("Shape: ");
        Scanner sc = new Scanner(System.in);
        String Shape = sc.nextLine();
        if (Shape.equalsIgnoreCase("trapezoid")){
            trapezoid(name);
        }else  if (Shape.equalsIgnoreCase("triangle")){
            triangle(name);//语句
        }else  if (Shape.equalsIgnoreCase("pyramid")){
            pyramid(name);//你可以有任意数量的case语句
        }
//        switch(Shape){
//            case "trapezoid" :
//                trapezoid(name);//语句
//                break; //可选
//            case "triangle" :
//                triangle(name);//语句
//                break;
//            case "pyramid": //可选
//                pyramid(name);//你可以有任意数量的case语句
//                break;
//            default : //可选
//                //语句
//        }
    }
    public static void trapezoid(String name){
        System.out.print("What is the length of the top of the trapezoid:");
        Scanner sc = new Scanner(System.in);
        int top = sc.nextInt();
        System.out.println("What is the length of the bottom of the trapezoid: ");
        int bottom = sc.nextInt();
        System.out.println("What is the height of the trapezoid:");
        int height = sc.nextInt();
        int area=(top+bottom)*height/2;
        System.out.println("#### Thanks for using the Java Assistant"+name+"!");
        System.out.println("# The area of your trapezoid is:"+area);
    }
    public static void triangle(String name){
        System.out.print("What is the length of one side of the triangle:");
        Scanner sc = new Scanner(System.in);
        int oneside = sc.nextInt();
        System.out.println("What is the length of the other side of the triangle: ");
        int otherside = sc.nextInt();
        int a=(int)(Math.pow(oneside, 2)+Math.pow(otherside, 2));
        int area= (int) Math.sqrt(a);
        System.out.println("#### Thanks for using the Java Assistant"+name+"!");
        System.out.println("# The hypotenuse of your triangle is:"+area);
    }
    public static void pyramid(String name){
        System.out.print("What is the  base width of of the pyramid:");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        System.out.println("What is the base length of the pyramid: ");
        int length = sc.nextInt();
        System.out.println("What is the  height of the pyramid : ");
        int height = sc.nextInt();
        int area=(width*2+length*2)*height/2+width*length ;
        System.out.println("#### Thanks for using the Java Assistant"+name+"!");
        System.out.println("# The hypotenuse of your triangle is:"+area);
    }
    public static void RPS(String name){
        int roundCount=1,userwin=0,userloss=0;
        System.out.print("Round "+roundCount+", what do you throw? (rock, paper, or scissors)");
        while (userwin<2&&userloss<2&&roundCount<3){
            Scanner sc = new Scanner(System.in);
            Random r = new Random();
            int a= (int) r.nextInt(2);
            String choice=sc.nextLine();
            if (choice.equalsIgnoreCase("rock")) {
                if (a==0){
                    System.out.println("You threw rock and I threw rock. We tied this round.");
                    continue;
                }if (a==1){
                    System.out.println("You threw rock and I threw paper. I win this round.");
                    userloss++;
                    continue;
                }
                if (a==2){
                    System.out.println("You threw rock and I threw scissors. You win this round.");
                    userwin++;
                    continue;
                }
            }

            if (choice.equalsIgnoreCase("paper")) {
                if (a==0){
                    System.out.println("You threw paper and I threw rock. You win this round.");
                    userwin++;
                    continue;
                }if (a==1){
                    System.out.println("You threw paper and I threw paper.We tied this round.");
                    continue;
                }
                if (a==2){
                    System.out.println("You threw rock and I threw scissors. I win this round. ");
                    userloss++;
                    continue;
                }
            }

            if (choice.equalsIgnoreCase("scissors")) {
                if (a==0){
                    System.out.println("You threw scissors and I threw rock.I win this round. ");
                    userloss++;
                    continue;
                }if (a==1){
                    System.out.println("You threw scissors and I threw paper.You win this round.");
                    userwin++;
                    continue;
                }
                if (a==2){
                    System.out.println("You threw scissors and I threw scissors.We tied this round.");
                    continue;
                }
            }
            roundCount++;
        }
        System.out.println("#### Thanks for using the Java Assistant"+name+"!");
        if (userwin==2){
            System.out.println("You win!");
        }else if (userloss==2){
            System.out.println("I win!");
        }else if (roundCount==4){
            System.out.println("We tied!");
        }
    }

    public static void overtime(String name){
        int total=0;
        System.out.println("How many hours did you work:");
        Scanner sc = new Scanner(System.in);
        int hours=sc.nextInt();
        System.out.println("What is your normal hourly rate:");
        int rate=sc.nextInt();
        if(hours<=40){
            total=rate*hours;
        }else {
            total=rate*(hours-40)+(rate+rate/2)*(hours-40);
        }
        System.out.println("#### Thanks for using the Java Assistant"+name+"!");
        System.out.println("# You will get paid $"+total+" this week!");
    }

    public static void change(String name){
        System.out.println("How many nickels do you have:");
        Scanner sc = new Scanner(System.in);
        int nickels=sc.nextInt();
        System.out.println("How many pennies do you have:");
        int pennies=sc.nextInt();
        System.out.println("What is the total amount you want to make?");
        int total=sc.nextInt();
        int a=total/5;
        int b=total%5;
        System.out.println("#### Thanks for using the Java Assistant"+name+"!");
        if (a>=nickels&&b>=pennies){
            System.out.println("# You can make "+total+"! You'll have "+(a-nickels)+" nickels and"+(b-pennies)+" pennies remaining.");
        }else {
            System.out.println("#You cannot make"+total);

        }
    }
    public static void nevermind(String name){
        System.out.println("#### Thanks for using the Java Assistant"+name+"!");
        System.out.println("# Alright, see you next time!");
    }
    public static void main(String[] args){

        System.out.println("### Welcome to the Java Assistant! ###");
        System.out.println("What is your name:");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hi"+name+"! What action would you like to perform?");
        System.out.println("A) Shape calculator\n" +
                "B) Play rock-paper-scissors\n" +
                "C) Calculate my overtime pay\n" +
                "D) Change calculator\n" +
                "E) <some custom action that you choose>\n" +
                "F) Nevermind, I don't want to do anything\n+" +
                "Action:");
        String option=sc.nextLine();
        switch (option){
            case "a":
            case "A":shape(name);break;
            case "b":
            case "B": RPS(name);break;
            case "c":
            case "C":overtime(name);break;
            case "d":
            case "D":change(name);break;
            case "e":
            case "E":nevermind(name);break;
        }
    }
}
