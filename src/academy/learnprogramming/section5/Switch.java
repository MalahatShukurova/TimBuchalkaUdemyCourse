package academy.learnprogramming.section5;

public class Switch {
    public static void main(String[] args) {
        String month = "JuNe";
        switch (month.toUpperCase()){
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not found");
        }

    }

}
