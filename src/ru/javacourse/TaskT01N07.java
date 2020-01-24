package ru.javacourse;
/*
Вычислить число Пи до сотых.
Попробуем посчитать через бесконечный ряд Лейбница
chr = ((Math.pow(-1,  n)) * (1 / ((2 * n) + 1)));
 */

public class TaskT01N07 {
    static double pow(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++){
            result = result * a;
        }
        return result;
    }
    public static double countPi(){
        int n = 1; //число членов ряда
        float pi = 0; // число pi
        float t = 1;
        float value_row = 1;
        while(t < value_row){
            pi += value_row;
            n++;
            value_row = (float)(Math.pow(-1,(n+1))) * (1/(2 * n - 1));
        }
        pi = pi * 4;
        return pi;
    }
}
