package com.codegym.task.task05.kwadrat;

import java.io.*;

public class prostokat {
    public static void main(String[] args) throws Exception {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(keyboard.readLine());
        int width = Integer.parseInt(keyboard.readLine());

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(i == 0 || i == height - 1 || j == 0 || j == width - 1){
                    System.out.print(5 + " ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
