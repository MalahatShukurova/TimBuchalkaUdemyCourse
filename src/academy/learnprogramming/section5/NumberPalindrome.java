package academy.learnprogramming.section5;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse=0;
        int lastDigit = number%10;
        reverse = reverse*10+ lastDigit;
        if(reverse==number){
            return true;
        }else {
            return false;}
        }
    }

