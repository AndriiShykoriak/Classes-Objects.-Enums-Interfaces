package ua.com.figure;

public class CounterClass {
    private static int counter = 0;

    public CounterClass() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
