/**
 * Created by Thomas Hodges on 7/3/15.
 * CMIS 141 - Homework 4a
 * This class is for testing the program.
 * It uses 5 tests with output to separate each test
 * case scenario.
 */
public class Test {

    public static void tests() {
        testOne();
        testTwo();
        testThree();
        testFour();
        testFive();
    }

    public static void testOne() {
        System.out.println("\n===Test Case #1===\n");
        StateProgram.runState();
        System.out.println("\n---End Test Case #1---\n");
    }

    public static void testTwo() {
        System.out.println("\n===Test Case #2===\n");
        StateProgram.runState();
        System.out.println("\n---End Test Case #2---\n");
    }

    public static void testThree() {
        System.out.println("\n===Test Case #3===\n");
        StateProgram.runState();
        System.out.println("\n---End Test Case #3---\n");
    }

    public static void testFour() {
        System.out.println("\n===Test Case #4===\n");
        StateProgram.runState();
        System.out.println("\n---End Test Case #4---\n");
    }

    public static void testFive() {
        System.out.println("\n===Test Case #5===\n");
        StateProgram.runState();
        System.out.println("\n---End Test Case #5---\n");
    }
}
