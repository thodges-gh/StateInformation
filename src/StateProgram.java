import java.util.Scanner;

/**
 * Created by Thomas Hodges on 6/28/15.
 */
public class StateProgram {

    public static void runState() {
        // Creates a Scanner object
        Scanner input = new Scanner(System.in);
        // String used to store user input
        String stateName;

        // Loop until "none" is entered
        do{
            System.out.println("Enter a State or None to exit: ");
            // nextLine method so that states with spaces will work
            stateName = input.nextLine();
            // Test so that "none" isn't treated as a state
            if (!stateName.equalsIgnoreCase("none")) {
                // Creates a new state in lowecase, trims spaces
                State state = new State(stateName.toLowerCase().trim());
                // Calls the state's toString method to print to output
                System.out.println(state.toString());
            }
        // Breaks the loop when "none" is entered
        } while (!stateName.equalsIgnoreCase("none"));
    }

    public static void main(String[] args) {
        // Calls runState
        runState();
    }
}
