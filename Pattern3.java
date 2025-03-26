import java.util.*;
public class Pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("ENter column");
        int column=sc.nextInt();
        int num=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                System.out.print(num+" ");
                num++;
            }System.out.println();
        }
    }
}
