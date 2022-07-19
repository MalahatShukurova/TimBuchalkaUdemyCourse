package academy.learnprogramming.section5;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
    getDaysInMonth(1,2020);

    }

    public static boolean isLeapYear(int year) {
        if (!(year > 1 && year < 9999)) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        int numberOfDays = -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = 31;
                break;

            case 2:
                if (isLeapYear(year)) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }


            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = 30;


        }
        return numberOfDays;


    }

}





