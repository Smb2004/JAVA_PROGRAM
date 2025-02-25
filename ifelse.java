import java.io.*;
class ifelse{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Num1:");
        int num1=Integer.parseInt(br.readLine());

        System.out.println("Enter Num2:");
        int num2=Integer.parseInt(br.readLine());

        if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }else{
            System.out.println(num2+" is greater than "+num1);
        }



    }
}