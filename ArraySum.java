import java.io.*;
public class ArraySum {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter rows:");
        int rows=Integer.parseInt(br.readLine());
        System.out.println("Enter Column:");
        int column=Integer.parseInt(br.readLine());

        int arr[][]=new int[rows][column];
        System.out.println("Ente array Data:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=Integer.parseInt(br.readLine());
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
