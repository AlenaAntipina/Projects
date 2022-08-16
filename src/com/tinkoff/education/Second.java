package com.tinkoff.education;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Second {
    public void run(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        Map<String, Integer> map = new HashMap<>();

        scan = new Scanner(System.in);
        String line = scan.nextLine();

        map.put(line, 1);
        String name1, name2, name3, new_line;

        for (int i = 1; i < num; i++){
            scan = new Scanner(System.in);
            name1 = scan.next();
            name2 = scan.next();
            name3 = scan.next();
            new_line = name1 + " " + name2 + " " + name3;
            boolean flag = false;

            for (String elem : map.keySet()) {
                line = elem;
                if (elem.contains(name1) && elem.contains(name2) && elem.contains(name3)){
                    map.put(line, map.get(line) + 1);
                    flag = true;
                    break;
                }
            }

            if (!flag) map.put(new_line, 1);
        }

        int max = 0;
        for (String elem : map.keySet()) {
            System.out.println(elem + ", " + map.get(elem));
            if (map.get(elem) > max) max = map.get(elem);
        }

        System.out.println(max);
    }
}
