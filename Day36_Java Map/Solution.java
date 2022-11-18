//Complete this code or write your own from scratch
import java.util.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> phonebook = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++)
        { 
            String name=sc.nextLine();
            int phone=sc.nextInt();
            phonebook.put(name, phone);
            sc.nextLine();
        }
        while(sc.hasNext())
        {
            
            String str=sc.nextLine();
            if (phonebook.containsKey(str))
            {
                System.out.println(str+"="+phonebook.get(str));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        
    }
}