package Day1;

public class ReverseWithLoop {

    public static void main(String[] args) {

        String s = "raj";

        for (int i = s.length()-1; i >= 0; i--) {

            System.out.print(s.charAt(i));
        }
    }
}
