package Day1.practice;

import java.util.Arrays;


public class Anagram001 {
    public static void main(String[] args) {

        String s = "silent";
        String s1 = "listen";

        char[] ch = s.toCharArray();
        char[] ch1 = s1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(Arrays.equals(ch,ch1)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }

    }

   // silent - listen



}
