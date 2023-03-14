package com.driver;

class B extends A {
    String method() {
        return super.meth();
    }

    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}
