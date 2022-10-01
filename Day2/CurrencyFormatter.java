import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        if(payment>=0 && payment<= Math.pow(10, 9))
        {
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String India = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        // new Locale("languageCode", "CountryCode")
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + India);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        }
    }
}
