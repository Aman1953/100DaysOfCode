import java.util.Scanner;
public class Q2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string separated by a hyphen: ");
        String str = sc.nextLine();
        String[] words = str.split("-");
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1; j<words.length; j++)
            {
                if(words[i].compareTo(words[j])>0)
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for(int i=0;i<words.length;i++){
            if(i == words.length-1)
                System.out.print(words[i]);
            else
                System.out.print(words[i]+"-");
        }
    }
}




