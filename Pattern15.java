import java.util.*;
public class Pattern15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            int n=i;
            for(int sp=1;sp<=row-i;sp++){
                System.out.print("\t");

            }for(int j=1;j<=i;j++){
                System.out.print(n+"\t");
                n+=i;
            }System.out.println();
        }
    }
} 