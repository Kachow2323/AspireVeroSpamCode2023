public class PIDtest {
    import edu.wpi.first.math.controller;
    // needs more import ig only works for WPILIB VSCODE
        public static void main(String[] args) throws InterruptedException {

            final PIDController pidController = new PIDController(1, 1, 1);
            pidController.setInputRange(0, 200); // The input limits
            pidController.setOutputRange(50, 100); // The output limits
            pidController.setSetpoint(120); // My target value (PID should minimize the error between the input and this value)
            pidController.enable();
            double input = 0;
            double output = 0;
            while (true) {
                input = output + 30;
                pidController.getInput(input);
                output = pidController.performPID();
                System.out.println("Input: " + input + " | Output: " + output + " | Error: " + pidController.getError());
    
                Thread.sleep(1000);
            }
        }
    
}
