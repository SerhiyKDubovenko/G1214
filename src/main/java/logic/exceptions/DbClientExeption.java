package logic.exceptions;

public class DbClientExeption extends Exception {
    public DbClientExeption() {
        super();
    }

    public DbClientExeption(String message) {
        super(message);
    }

    public DbClientExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DbClientExeption(Throwable cause) {
        super(cause);
    }

    protected DbClientExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
