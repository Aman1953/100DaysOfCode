import java.io.*;
import java.util.*;

public class Palindrome{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A = A.toLowerCase();
        if (isPalindrome(A)==true) {
            System.out.println("Yes");
        }
        else
        System.out.println("No");
        
    }
   static boolean isPalindrome(String A){
        for (int i = 0; i < A.length(); i++) {
            char start = A.charAt(i);
            char end = A.charAt(A.length()-1-i);
            if (start != end) 
               return false;
    }
    return true;
}
}

