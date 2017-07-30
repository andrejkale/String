package com.company;

/**
 * Created by Andre on 16.07.2017.
 */
public class MeExcertion extends Exception {
    public MeExcertion(String message) {
        super(message);
    }
    void m() {
        System.out.println("hi from MYEXECPTION ");
    }
}
