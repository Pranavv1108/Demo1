package Demo1;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }

        sc.close();
    }
}
