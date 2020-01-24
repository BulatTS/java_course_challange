package ru.javacourse;
import java.math.*;

/*
Рассчитать сложный процент. Дано: начальная сумма, процент, количество.
x - первоначальная сумма
s-  ежегодная процентная ставка
m - количество месяцов
 */

public class TaskT01N06 {
    static int pow(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result = result * a;
        }
        return result;
    }
    public static int countPercent(int x, int s, int m){
        if ((s <= 100 && s >= 0) && (m <=12) && (x >0)){
            int apy = 1 + s/12; // подумать над привидением типа
            return (x * pow(apy,m));

        }
        else
            System.out.println("incorrect input values");
            return -1;
    }
}
