package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello...");
        String info = bufferedReader.readLine();


        char[] array = info.toCharArray();
        int[] compare = new int[10];
        int len = info.length();

        for (int i = 0; i < len; i++) {
            compare[info.charAt(i)]++;
        }

        for (int i = 0; i < len; i++) {
            array[i] = info.charAt(i);
            int find = 0;

            for (int j = 0; j <= i; j++) {
                if (info.charAt(i) == array[j])
                    find++;
            }
            if (find == 1)
                System.out.println("Number of Occurrence of +" + info.charAt(i) + " is: " + compare[info.charAt(i)]);
        }
    }
}