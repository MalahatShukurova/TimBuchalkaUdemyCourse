package academy.learnprogramming.section3;

public class OperatorsChallenge {
    public static void main(String[] args) {
        double firstDoubleValue= 20.00d;
        double secondDoubleValue = 80.00d;
        double total = (firstDoubleValue + secondDoubleValue)* 100.00d;
        System.out.println("myValuesTotal = "+ total);
        double remainder = total % 40.00;
        System.out.println("the Remainder = "+ remainder);
        boolean isNoRemainder = (remainder==0)? true: false;
        System.out.println("isNoRemainder = "+ isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }








    }




}
