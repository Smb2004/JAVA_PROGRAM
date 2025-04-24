import java.util.*;
public class Pattern20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int r=sc.nextInt();
        int n=r;
        for(int i=1;i<=r;i++){
    
            for(int sp=1;sp<=i-1;sp++){
                System.out.print("\t");
            }for(int j=1;j<=r+1-i;j++){
                System.out.print(n+"\t");

            }n--;
            System.out.println();
        }
    }
}
