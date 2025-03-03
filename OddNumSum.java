
import java.io.*;
public class OddNumSum {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Start num:");
        int Start = Integer.parseInt(br.readLine());

        System.out.println("Enter End num:");
        int End = Integer.parseInt(br.readLine());
        
        int sum=0;
        int count=0;
        int i=Start;
        while(i<=End){
            if(i%2!=0){
                sum+=i;
                count++;
            }i++;

        }System.out.println("Sum =" +sum);
        System.out.println("Count =" +count);
    }
    
}
