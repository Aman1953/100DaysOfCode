/*


Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2


*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static int B,H;
static boolean flag = false;
static {
Scanner sc = new Scanner(System.in);
B = sc.nextInt();
H = sc.nextInt();

sc.close();

if(B>0 && H>0)
    flag = true;
else
System.out.print("java.lang.Exception: Breadth and height must be positive");

}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

