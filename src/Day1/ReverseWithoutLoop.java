package Day1;

import java.util.Scanner;

public class ReverseWithoutLoop {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        char[] ch = str.toCharArray();
        int len = ch.length;

        reverseString(ch,len);
    }

    private static void reverseString(char[] ch, int len) {

        if(len>0){

            System.out.print(ch[len-1]);
            len--;
            reverseString(ch,len);
        }
    }


}
