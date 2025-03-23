import java.io.*;
public class StringReverse{
        public static void main(String[]args)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter string:");
                String str1=br.readLine();

                StringBuffer str2=new StringBuffer(str1);
                str2=str2.reverse();
                str1=str2.toString();
                System.out.println(str1);
        }
}
