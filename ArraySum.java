import java.util.*;
public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter Column:");
        int column=sc.nextInt();

        int arr[][]=new int[rows][column];
        System.out.println("Ente array Data:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        System.out.println("Array Sum:");
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                sum+=arr[i][j];
            }
        }System.out.println("Sum ="+sum);
    }
    
}
