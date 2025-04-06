import java.util.*;
public class Pattern13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            char ch=(char)(row+64-i+1);
            for(int sp=1;sp<=row-i;sp++){
                System.out.print("\t");
            }for(int j=1;j<=i;j++){
                System.out.print(ch+"\t");
                ch++;
                
            
            }
            System.out.println();
        }
    }
}
