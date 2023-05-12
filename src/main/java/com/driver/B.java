package com.driver;

public class B extends A{
    B() {
        A obj = new A();
        System.out.println(obj.meth());
    }

    @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}
