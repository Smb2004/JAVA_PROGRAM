import java.util.*;
public class Pattern10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente row:");
        int row=sc.nextInt();
        int n=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }System.out.println();
        }
    }
}
