import java.io.*;
class ArrayDiagonalSum{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter rows:");
        int rows=Integer.parseInt(br.readLine());
        System.out.print("Enter column:");
        int column=Integer.parseInt(br.readLine());

        int arr[][]=new int[rows][column];

        System.out.println("Enter data:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter element at("+i+","+j+")");
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Sum of Left Diagonal is:");
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(i==j){
                    sum+=arr[i][j];

                }
            }
        }System.out.println("Sum ="+ sum);

    }    
}