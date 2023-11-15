import java.util.Scanner;

class morePracticeJosh{
    public static void main(String[]args){
        boolean approval = true;
        while(approval){
            Scanner grabber = new Scanner(System.in);
            System.out.println("What is your first number?");
            int numF = grabber.nextInt();
            System.out.println("What is the math symbol?(+,-,*,/,%)");
            Character sign = grabber.next().charAt(0);
            System.out.println("What is your second number?");
            int numS = grabber.nextInt();
            if(sign == '+'){
                System.out.println(numF + numS);
            }else if(sign == '-'){
                System.out.println(numF - numS);
            }else if (sign == '*'){
                System.out.println(numF * numS);
            }else if (sign == '/'){
                System.out.println(numF / numS);
            }else if (sign == '%'){
                System.out.println(numF % numS);
            }else System.out.println("error");

            System.out.println("Do you want to calculate again? Y/N");
            Character approve =  grabber.next().charAt(0);
            if(approve == 'Y'){
                System.out.println("Repeating...");
            }else{
                approval = false;
            }
        }
    }
}