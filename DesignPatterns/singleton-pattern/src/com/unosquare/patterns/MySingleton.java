package com.unosquare.patterns;

public class MySingleton {
    private static MySingleton mySingleton;
    private MySingleton(){
        System.out.println("Singleton created");
    }
    public static synchronized MySingleton getInstance(){
        if (mySingleton == null){
            mySingleton = new MySingleton();
        }
        return mySingleton;

    }
}
