package ConditionalStatement;

public class SwitchStatement {

    public static void main(String[] args) {
      //  int iDay = 4;
        String Day = "Thursday";

        switch(Day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is Sunday");
                break;
        }


    }
}
