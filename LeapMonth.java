
package com.codemulo.leapmonth;


import java.util.Scanner;
public class LeapMonth {
    public static void main(String[] args) {
        int month;
        Scanner mm = new Scanner(System.in);
        System.out.println("This program examines the  year to confirm if its  a leap month or not");

        System.out.println("please enter the month");

    month=mm.nextInt();
    int result=month%4;
    if (result==0){
        System.out.println(
                "The month entered  "+ month+ " is a leap month"
        );
    }else{
        System.out.println(
                "The month entered  "+ month+ " is not a leap month"
        );
    }

    }
}