package com.tweetapp.exception;

/**
 * @author Sinjon Nath
 *
 */
public class TweetAppException extends Exception{
    public TweetAppException(String message) {
        super(message);
    }
    public TweetAppException(String message, Throwable throwable){
        super(message,throwable);
    }
}
