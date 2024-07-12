package Day1;

import java.util.Scanner;

public class Array2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        System.out.println("enter 1st sub marks");
        marks[0] = sc.nextInt();

        System.out.println("enter 2nd  sub marks");
        marks[1] = sc.nextInt();

        System.out.println("enter 3rd sub marks");
        marks[2] = sc.nextInt();



        for (int i = 0; i < marks.length; i++) {

            if (marks[i]<30)
            {
                System.out.println("failed  "+marks[i]);
            }
            System.out.println(marks[i]);
        }


        


    }
}
