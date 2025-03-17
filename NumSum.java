import java.util.*;
public class NumSum {
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter From:");
                int From=sc.nextInt();
                System.out.println("Entr To:");
                int To=sc.nextInt();
                int sum=0;
                while(From<=To){
                        sum+=From;
                        From++;
                }System.out.println(sum);
        }
}

