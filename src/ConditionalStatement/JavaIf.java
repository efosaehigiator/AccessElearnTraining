package ConditionalStatement;

public class JavaIf {

    public static void main (String[] args){
       //This is a code to test the If statement
        String Day = "Monday";
        int iDay = 1;
        if(Day.equals("Saturday")){
            System.out.println("Today is Saturday");
        }else if (Day.equals("Sunday")){System.out.println("Today is not Sunday");
        }else {
            System.out.println("Today is a weekday");
        }


     /*   if(iDay==6){
            System.out.println("Today is Saturday");
        }else {System.out.println("Today is not Saturday");} */
    }
}
