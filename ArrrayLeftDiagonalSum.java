import java.io.*;
public class ArrrayLeftDiagonalSum {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter rows:");
        int rows=Integer.parseInt(br.readLine());

        System.out.println("Enter column:");
        int column=Integer.parseInt(br.readLine());

        int arr[][]=new int[rows][column];
        System.out.println("Enter Data:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter element at("+i+","+j+")");
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.print("Sum of Left Diagonal:");
        int sum=0;
        for(int i=0;i<rows;i++){
            sum+=arr[i][rows-1-i];
        }System.out.println("Sum ="+sum);
    }
    
}
