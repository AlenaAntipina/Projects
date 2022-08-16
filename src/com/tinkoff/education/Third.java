package com.tinkoff.education;

import java.util.Scanner;

public class Third {
    void run(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        scan = new Scanner(System.in);
        int min = scan.nextInt();             // найти минимальное число среди тех что прибавляются
        int max = scan.nextInt();             // найти максимальное число среди тех что вычитаются
        // затем поменять их местами
        int result = min - max;
        int current;
        for (int i = 3; i <= num; i++){
            current = scan.nextInt();
            result += (int) Math.pow(-1, (i - 1)) * current;
            if (i % 2 == 0 && current > max) max = current;
            else{
                if (current < min) min = current;
            }
        }

        result += 2 * (max - min);

        System.out.println(result);
    }
}
