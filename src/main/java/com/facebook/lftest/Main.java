package com.facebook.lftest;

import java.util.concurrent.Callable;

public class Main
{
    public static void main(String[] args)
            throws Exception
    {
        Compiler compiler = new Compiler();

        int value = 0;
        for (int i = 0; i < 100; i++) {
            Callable call = compiler.compile();
            for (int j = 0; j < 100; j++) {
                value += call.call().hashCode();
            }
        }
        System.out.println(value);
    }
}
