package com.alibaba.druid.support.security.decryptor;

/**
 * 加密出错
 *
 * @author Jonas Yang
 */
public class DecryptException extends Exception {
    public DecryptException() {
        super();
    }

    public DecryptException(String s) {
        super(s);
    }

    public DecryptException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public DecryptException(Throwable throwable) {
        super(throwable);
    }
}
