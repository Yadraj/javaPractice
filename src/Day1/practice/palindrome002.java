package Day1.practice;

import java.util.Scanner;

public class palindrome002 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String s = sc.next();

        StringBuffer sb = new StringBuffer(s);
        String reverseString = sb.reverse().toString();

        if(reverseString.equalsIgnoreCase(s)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }



    }
}
