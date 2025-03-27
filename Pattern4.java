import java.io.*;
public class Pattern4 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter rows:");
        int rows=Integer.parseInt(br.readLine());
        System.out.println("Enter column:");
        int column=Integer.parseInt(br.readLine());
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                System.out.print(i+" ");
            }System.out.println();
        }
    }
}
