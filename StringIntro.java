import java.util.*;

public class StringIntro{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int length=(A.length())+(B.length());
        System.out.println(length);
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String CA_A = A.substring(0, 1).toUpperCase() + A.substring(1);
        String CA_B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(CA_A+" "+CA_B);
        
        
    }
}



