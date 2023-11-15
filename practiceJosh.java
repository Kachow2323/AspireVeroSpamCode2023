import java.util.Scanner;
import java.lang.Math;
public class practiceJosh {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 10;
        System.out.println("Question?");
        String question = sc.nextLine();
        double number = Math.random();
        int range = (max-min+1);
        double randNumber = (int)(Math.random() * range) + min;
        
        if(randNumber == 1){
            System.out.println("Yes");
        } else if(randNumber == 2){
            System.out.println("You can find the asnwer within yourself.");
        } else if(randNumber == 3){
            System.out.println("Sounds like a bad idea.");
        } else if(randNumber == 4){
            System.out.println("Maybe think it about it a bit more.");
        } else if(randNumber == 5){
            System.out.println("You should definitly do it.");
        } else if(randNumber == 6){
            System.out.println("You should definitly not do it");
        } else if(randNumber == 7){
            System.out.println("No");
        } else if(randNumber == 8){
            System.out.println("Sounds like a good idea");
        } else if(randNumber == 9){
            System.out.println("Should dump the idea.");
        } else if(randNumber == 10){
            System.out.println("Don't do it.");
        }

        // if(type.equals("F")){
        //     System.out.println("In Fahrenheit what degree is the tempature?");
        //     double temp = scanner.nextDouble();
        //     System.out.println(temp);
            
        //     System.out.println((temp-32) * 5/9);
        // }else if(type.equals("C")){
        //     System.out.println("In Celsius what degree is the tempature?");
        //     int temp = scanner.nextInt();
        //     System.out.println((temp * 9 / 5)+32);

        // }


    
    }
}
