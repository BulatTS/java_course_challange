package ru.javacourse;
import java.math.*;

/*
Рассчитать сложный процент. Дано: начальная сумма, процент, количество.
 */

public class TaskT01N06 {
    static int pow(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result = result * a;
        }
        return result;
    }
//    public static int countPercent(int x, float s, int m){
//        if (s <= 1 && m <=12){
//            float apy = (1+s/12);
//            float sum = x * pow(,m);
//
//
//        }
//
//        return sum;
//    }
}
