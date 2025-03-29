import java.util.*;
public class Pattern6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        //System.out.println("Enter column:");
        //int column=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if (j<row+2-i){

                
                System.out.print("* ");}
                continue;
            
            }System.out.println();
        }
        
    }
}
