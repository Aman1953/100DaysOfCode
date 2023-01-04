import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter the values: ");
        int ctr = 0;
        int[] packet = new int[n];
        for(int i=0; i<n; i++){
            packet[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(packet[i]!=0){
                System.out.print(packet[i]+" ");
            }
            else{
                ctr++;
            }
        }
        for(int i=0; i<ctr; i++){
            System.out.print(0+" ");
        }
    }
}

