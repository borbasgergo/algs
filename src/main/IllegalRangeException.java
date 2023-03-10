package main;

public class IllegalRangeException extends Exception{

    private final static String message = "The number must be between 1 and 3999";
    public IllegalRangeException() {
        super(message);
    }
}
