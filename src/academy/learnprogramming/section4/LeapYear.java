package academy.learnprogramming.section4;

public class LeapYear {
    public static void main(String[] args) {
//        boolean leapYear = isLeapYear(1800);
//        System.out.println(leapYear);

        boolean leapyear= isLeapYear(2000);
        System.out.println(leapyear);


    }
//    public static boolean isLeapYear(int year){
//        if(!(year>1&&year<9999)){
//            return  false;
//        } else if(year%4==0&& year%100!=0||year %400==0){
//            return true;
//        }else{
//            return false;
public static boolean isLeapYear (int year){
    if(year < 1 || year > 9999){
        return false;
    }
    else{
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 ==0){
                    return true;
                }
                else {
                    return false;
                }
            }
            else{
                return true;
            }
        }
        return false;
    }
}


}
