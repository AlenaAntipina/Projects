package com.tinkoff.education;

import java.util.Scanner;

public class First {
    public void run(){
        Scanner scan = new Scanner(System.in);
        int first_x1 = scan.nextInt();
        int first_y1 = scan.nextInt();
        int first_x2 = scan.nextInt();
        int first_y2 = scan.nextInt();

        scan = new Scanner(System.in);
        int second_x1 = scan.nextInt();
        int second_y1 = scan.nextInt();
        int second_x2 = scan.nextInt();
        int second_y2 = scan.nextInt();

        System.out.printf("first: [%d, %d], [%d, %d]\n" +
                        "second: [%d, %d], [%d, %d]\n", first_x1, first_y1, first_x2, first_y2,
                second_x1, second_y1, second_x2, second_y2);

        int side;
        if (first_x1 <= second_x1){
            side = second_x2 - first_x1;
        }
        else{
            side = first_x2 - second_x1;
        }

        int final_square = (int) Math.pow((side), 2);

        System.out.println("Square: " + final_square);
    }

}
