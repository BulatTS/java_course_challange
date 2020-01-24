package ru.javacourse.week1;

public class TaskT01N09 {
     public static float countFisrt(int a, int b){
         float value = 0;
         value = (float) Math.pow((Math.pow(a,2) + Math.pow(b,2)),0.5);
         //System.out.println(Math.sqrt((Math.pow(a,2) + Math.pow(b,2))));
         return value;
     }

     public static double countSecond(int x){
         return Math.sqrt(1 - Math.pow(Math.sin(x),2));
     }
     public static double countThird(int x){
         int a = 2;
         int b = 4;
         int c = 1;
         return Math.sqrt((a * Math.pow(x,2) + b*x + c));
     }
     public static double countFourth(int x){
         return (Math.sqrt(x+1) + Math.sqrt(x-1))/(2 * Math.sqrt(x));
     }

     public static double countFifth(int x) {
        return Math.abs(x) + Math.abs(x + 1);
     }

}
