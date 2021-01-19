package main;

/**
* The HandException class to assist with handling of exceptions.
*
* @author  Sello Mamorobela
* @version 1.5
* @since   2021-01-15 
 */


public class HandleException extends Exception {

    public HandleException() {
    }

    public HandleException(String msg) {
        super(msg);
    }
}
