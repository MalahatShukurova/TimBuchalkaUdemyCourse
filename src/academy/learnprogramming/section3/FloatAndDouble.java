package academy.learnprogramming.section3;

public class FloatAndDouble {

        public static void main(String[] args) {
            float myMinFloatValue = Float.MIN_VALUE;
            float myMaxFloatValue = Float.MAX_VALUE;
            System.out.println("float minimum value = "+ myMinFloatValue);
            System.out.println("float maximum value = "+ myMaxFloatValue);

            double myMinDoubleValue = Double.MIN_VALUE;
            double myMaxDoubleValue = Double.MAX_VALUE;
            System.out.println("double minimum value = "+ myMinDoubleValue);
            System.out.println("double maximum value = "+ myMaxDoubleValue);

            int myIntValue = 5 / 3;
            float myFloatValue =  5f / 3f;
            double myDoubleValue = 5.00/ 3.00;
            System.out.println("MyIntValue = " + myIntValue);
            System.out.println("MyFloatValue = " + myFloatValue);
            System.out.println("MyDoubleValue = "+ myDoubleValue);

            int myPoundValue = 50;
            double myKilogramValue = myPoundValue * 0.45359237;
            System.out.println(myKilogramValue);

            double numberOfPounds = 200d;
            double convertedKilograms = numberOfPounds * 0.45359237;
            System.out.println("Converted Kilograms = "+convertedKilograms);

            double pi = 3.1415927d;
            double anotherNumber = 3_000_000.4_567_890d;
            System.out.println(pi);
            System.out.println(anotherNumber);



        }
    }


