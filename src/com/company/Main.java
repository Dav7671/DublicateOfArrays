package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[9];
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 100);
            System.out.print(arr[i] + " ");
        }

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    found = true;
                    System.out.println("Value = " + arr[i] + " in index " + i + " and " + j );
                }
            }
        }

        if(!found){
            System.out.println("Dublicates have not found");
        }
    }
}
