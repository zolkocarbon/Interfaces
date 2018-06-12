package com.chrisz;

public interface ITelephone { // could be public abstract interface, but all interfaces are abstract by default
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
