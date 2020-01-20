package ru.javacourse;

public class TaskT01N04 {
    public static void convertTimeFromHoursToSeconds(int hours) {
        try {
            if (hours <= 23) {
                int minutes = hours * 60 * 60;
                System.out.println(minutes);
            }
            else {
                System.out.println("try with hours");
            }
        }
        catch(Exception e){
                System.out.println("Be sure, that input is numbers");
            }
        }
    }

