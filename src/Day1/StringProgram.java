package Day1;

import java.util.Scanner;

public class StringProgram {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word To check palindrome");
        String s = sc.next();

        StringBuffer sb = new StringBuffer(s);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);


        if (reverse.equalsIgnoreCase(s)) {
            System.out.println("Yes it is  palindrome");

        }
        else {
            System.out.println("No it is not palindrome");
        }



    }

}