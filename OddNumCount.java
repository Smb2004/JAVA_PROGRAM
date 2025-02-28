import java.io.*;
public class OddNumCount{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num:");
        int N=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=1;i<=N;i++){
            if(i%2!=0){
                count++;
                System.out.println("num = "+i);
            }
        }System.out.println(count);
    }
}