package Day1;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] a = new int[10];
        a[0] = 1;
        a[1] = 2;
        System.out.println(a.length);
        System.out.println(a[1]);
        a[1]=3;
        System.out.println(a[1]);
        System.out.println("==========");

        int[] b = {1,2,3,4,5,6,7,8,9};
        System.out.println(b.length);
        System.out.println("==========");

        int[] c = {1,2,3,4,5,6,7,8,9};
        int[] d = {1,2,3,4,5,6,7,8,9};
        System.out.println(c==d);
        System.out.println("==========");


        int[] e = c;
        System.out.println(e==c);
        System.out.println("==========");

        System.out.println(c.equals(d));
        System.out.println("==========");


        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]*2);
        }
        System.out.println("==========");


        System.out.println(args[0]);
        System.out.println("==========");








    }
}
