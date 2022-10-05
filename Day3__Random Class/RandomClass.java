/*
Write a Java program that randomly picks an English alphabet (A-Z)
and keeps asking the user to guess the alphabet 
until he/she has got it right. Also report the number of trials.
*/

package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int counter = 1;
        char c = (char) ('A'+ r.nextInt(26));
        while (true)
        {
            System.out.println("Enter a character ");
            char character = sc.next().charAt(0);
            if (character == c)
            {
                System.out.println("Right!\nNo of trials : "+counter);
                break;
            }
            else System.out.println("Wrong!");
            counter ++;
        }
    }
}
