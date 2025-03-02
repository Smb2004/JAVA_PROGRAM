import java.io.*;
public class SquareReverse {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ENter num:");
        int num=Integer.parseInt(br.readLine());
        int  i=num;
        while(i>=1){
            System.out.println("Square is:"+ i*i);
            i--;
        }System.out.println();
    }

    
}
