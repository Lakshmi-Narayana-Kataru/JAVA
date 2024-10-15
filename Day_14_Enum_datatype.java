package com.learning.java_basics;
import java.util.Scanner;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Enum_datatype {
    Day day;

    public Enum_datatype(Day day) {
        this.day = day;
    }

    public void dayIsLike() {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }

    public static void main(String[] args) {
        String str = "MONDAY";
        Enum_datatype t1 = new Enum_datatype(Day.valueOf(str));
        t1.dayIsLike();
    }
}
