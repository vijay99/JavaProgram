package com.interview;

//Singleton
class SingletonLazyHealthEdge {
    private static SingletonLazyHealthEdge instance;

    //private constrctur
    private SingletonLazyHealthEdge() {
    }


    //global access method
    public static SingletonLazyHealthEdge getInstance() {
        //  instance = null;
        if (instance == null) {
            synchronized (SingletonLazyHealthEdge.class) {
                if (instance == null)
                    instance = new SingletonLazyHealthEdge();
            }
        }
        return instance;
    }
}
