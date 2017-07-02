package com.jeiker.blog.exception;

/**
 * @Author : xiao
 * @Date : 17/7/2 上午10:51
 */
public class TipException extends RuntimeException {

    public TipException() {
    }

    public TipException(String message) {
        super(message);
    }

    public TipException(String message, Throwable cause) {
        super(message, cause);
    }

    public TipException(Throwable cause) {
        super(cause);
    }

}
