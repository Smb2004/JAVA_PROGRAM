import java.io.*;

public class IntToString {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number:");
        int n=Integer.parseInt(br.readLine());
        String str=Integer.toString(n);
        System.out.println(str);


    }
    
}
