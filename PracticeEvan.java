import java.util.Scanner;
public class PracticeEvan {
    public static void main(String []args){
        Scanner scnr = new Scanner(System.in);
        //int something = 5;
        //int another = 7;
        //something += 3;
        //System.out.println(something);    
        /*if (something != another){
            System.out.println("something is not equal to another");
        } else {
            System.out.println("something is equal to another");
        }*/
        /*boolean isWeekend = true;
        boolean hasvacation = false;

        if (isWeekend && hasvacation) {
            System.out.println("It's time for a break");
        }else{
            System.out.println("No break for now");
        }*/
        System.out.println("How old are you?");
        int age = scnr.nextInt();
        int driverAge = 15;

        if (age > driverAge) {
            System.out.println("You may get your driver's license");
        }else{
            System.out.println("You may not get your driver's license");

    }
}
}
