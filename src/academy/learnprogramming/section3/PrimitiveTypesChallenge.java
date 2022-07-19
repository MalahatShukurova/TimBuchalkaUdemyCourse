package academy.learnprogramming.section3;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByteValue = 68;
        short myShortValue = 5000;
        int myIntValue = 200000;
        long myLongValue = 50000+ 10*(myByteValue+myShortValue+myIntValue);
        System.out.println(myLongValue);

    }
}
