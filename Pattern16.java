import java.util.*;
public class Pattern16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        int n=row;
        for(int i=1;i<=row;i++){
            
            for(int sp=1;sp<=i-1;sp++){
                System.out.print("\t");

            }for(int j=1;j<=row+1-i;j++){
                System.out.print(n+"\t");
                
            }n--;
            System.out.println();
        }
    }
}  
