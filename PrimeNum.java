import java.io.*;
public class PrimeNum {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter num:");
        int num = Integer.parseInt(br.readLine());
    
        boolean isPrime=false;
        for(int i=2;i<Math.sqrt(num);i++){

            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }   
    
}
