package academy.learnprogramming.section4;

public class MethodOverloadingRecap {
    public static void main(String[] args) {
        int sum = sum(12, 23, 34);
        System.out.println(sum);
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }


}
