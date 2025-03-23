import java.io.*;
public class StringPalindrome {
    
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Start Code..");
        System.out.println("Enter string:");
        String str1=br.readLine();
        StringBuffer str2=new StringBuffer(str1);
        str2=str2.reverse();
        System.out.println("original String:"+str1);
        System.out.println("reverse String:"+str2);
        if(str1.equals(str2.toString())){
            System.out.println("IS PALINDROME");
        }else{
            System.out.println("IS NOT PALINDROME");
        }
        System.out.println("End Code..");
    }
}


