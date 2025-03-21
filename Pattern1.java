import java.io.*;
public class Pattern1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter rows:");
        int rows=Integer.parseInt(br.readLine());
        System.out.println("Enter column:");
        int column=Integer.parseInt(br.readLine());

        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print("*");

            }System.out.println();
        }
    }
    
}
