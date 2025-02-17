package Exceptions;

public class LogTypeDoesntExistsException extends RuntimeException {
    public LogTypeDoesntExistsException(String type) {
      super("The log type " + type + " doesn't exists.");
    }
}
