package com.tinkoff.education;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;
        do{
            str = scan.nextLine();
            if (str.equals("")) break;

            Map<String, Integer> map = new HashMap<>();
            int index = str.indexOf("=");
            String variable = str.substring(0, index);
            String value = str.substring(index + 1);
            System.out.println(variable + ", " + value);

            int foo;
            boolean flag = true;
            try {
                foo = Integer.parseInt(value);
                System.out.println("try block");
                flag = false;
            }
            catch (NumberFormatException e) {
                foo = 0;
                flag = true;
                System.out.println("catch block");
            }
            System.out.println("variable = " + variable + ", foo = " + foo);

            map.put(variable, foo);
            System.out.println(map.size());
            if (flag){
                 if (foo == 0){
                     System.out.println("foo block");
                     int val = 0;
                     for (String key : map.keySet()){
                         System.out.println("is the same? " + value+ ", " + key);
                         if (value == key){
                             val = map.get(key);
                             break;
                         }
                     }
                     System.out.println(variable + " = " + val);
                 }
            }

        } while (true);


    }
}
