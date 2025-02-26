import java.io.*;
class Factorial{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Num:");
        int num=Integer.parseInt(br.readLine());
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }System.out.println("Factorial is"+fact);
    }
}