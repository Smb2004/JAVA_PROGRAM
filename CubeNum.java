import java.io.*;
public class CubeNum {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter start Num:");
        int Start=Integer.parseInt(br.readLine());

        System.out.println("Enter end num:");
        int End=Integer.parseInt(br.readLine());
    
    
        int i=Start;
        while(i<=End){
            System.out.println(i+"="+i*i*i);
            i++;
        }System.out.println();
    }
}
