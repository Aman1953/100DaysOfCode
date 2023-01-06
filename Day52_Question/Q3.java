import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println("Output: ");
        for(String word: words){
            System.out.print(word.substring(0,1).toUpperCase());
            System.out.print(word.substring(1,word.length()));
            System.out.print(" ");
        }
    }
}



