package com.pl.asndktest.jni;

/**
 * Created by Administrator on 2016/1/5.
 */
public class NdkTest {

    static {
        System.loadLibrary("MyJni");
    }

    public native String getStringFromJni();
}
