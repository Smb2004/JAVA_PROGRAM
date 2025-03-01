import java.io.*;
public class SumNaturalnum {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Start num:");
        int Start=Integer.parseInt(br.readLine());
        System.out.println("Enter End num:");
        int End=Integer.parseInt(br.readLine());

        int sum=0;
        int i=Start;
        while(i<=End){
            sum+=i;
            i++;
        }System.out.println("Sum =" +sum);
        
    }
    
}
