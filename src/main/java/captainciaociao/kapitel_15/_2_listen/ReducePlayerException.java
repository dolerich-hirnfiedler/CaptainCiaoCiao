package captainciaociao.kapitel_15._2_listen;

public class ReducePlayerException extends RuntimeException {

    /**
     *
     */
    public ReducePlayerException() {
    }

    /**
     * @param message
     */
    public ReducePlayerException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public ReducePlayerException(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public ReducePlayerException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public ReducePlayerException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
