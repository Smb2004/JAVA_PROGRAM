import java.util.*;
public class Pattern8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter row");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(j<=row-i){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }System.out.println();
        }
    }
}
