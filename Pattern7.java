import java.util.*;
public class Pattern7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente row:");
        int row=sc.nextInt();
        char ch=(char)(64+row);
        int n=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(ch+""+n+" ");
                n++;
            }System.out.println();

        }
    }
}
