package academy.learnprogramming.section4;

public class OverloadingOfTypes {

    public static void main(String[] args) {
        OverloadingOfTypes o = new OverloadingOfTypes();
        o.calculate(11L, 12);
    }

    public void calculate(long a, int b) {
        System.out.print(a + b);
    }

    public void calculate(int a, long b) {
        System.out.print(a + b);
    }
}

