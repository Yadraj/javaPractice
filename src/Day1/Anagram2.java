package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the string: ");
        String s1 = sc.nextLine();

        s=s.replace(" ","" );
        s1=s1.replace(" ","");

       s= s.toLowerCase();
       s1= s1.toLowerCase();

        char[] ch =s.toCharArray();
        char[] ch1 =s1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

       boolean result =  Arrays.equals(ch,ch1);

       if(result==true){
           System.out.println("Anagram");
       }
       else{
           System.out.println("Not Anagram");
       }



    }
}
