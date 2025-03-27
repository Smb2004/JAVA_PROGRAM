import java.util.*;
public class Pattern5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter column:");
        int column=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i+1;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
