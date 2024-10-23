
public class lec5 {
    // Conditional Statements
    public static void main(String[] args) {
        int x = 10;
        if (x > 8){
        System.out.println("greater than 8");
        }
        else if (x == 8){
        System.out.println("equal to 8");
        }
        else{
        System.out.println("less than 8");
        }

        // Switch Case
        int daynum = 4;
        switch(daynum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // new switch case
        String day = "Monday";

        switch(day){
            case "Saturday","Sunday" -> System.out.println("It's a Weekend");
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It's a Weekday");
            default -> System.out.println("Invalid Day");
        }

        // new switch case with return with arrow
        String res;
         res = switch(day){
            case "Saturday","Sunday" -> "It's a Weekend";
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "It's a Weekday";
            default -> "Invalid Day";
        };

        System.out.println(res);

        // new switch case with return with colon
        String result;
         result = switch(day){
            case "Saturday","Sunday" : yield "It's a Weekend";
            case "Monday","Tuesday","Wednesday","Thursday","Friday" : yield "It's a Weekday";
            default : yield "Invalid Day";
        };
        System.out.println(result);

        // Loops
        // For Loop
        for(int i = 0; i < 5; i++){
            System.out.print(i);
        }

        // While Loop
        int i = 0;
        while(i < 5){
            System.out.print(i);
            i++;
        }

        // Do While Loop
        int j = 0;
        do{
            System.out.print(j);
            j++;
        }while(j < 5);

    }
}
