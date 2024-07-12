package Day1;
import java.util.Arrays;

public class AnagramProgram {
    public static void main(String[] args) {

        String a ="silent";
        String b ="listen";

        char[] a1 =a.toCharArray();
        char[] a2 =b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        Boolean boolean1 = Arrays.equals(a1,a2);

        if(boolean1==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }


    }
}
