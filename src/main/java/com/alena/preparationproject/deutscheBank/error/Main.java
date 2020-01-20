package com.alena.preparationproject.deutscheBank.error;

public class Main {

    public static void test() {
        try {
            throw new MyThrowable();
        } catch (MyThrowable myThrowable) {
            myThrowable.printStackTrace();
        }
    }

    public static void test1() {
        try {
            throw new Throwable();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void test2() {
        throw new Error();
    }

    public static void test3() {
        throw new MyError();
    }

    public static void test4() {
        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void test5() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test6() {
        throw new MyRuntimeException();
    }

    public static void test7() {
        throw new RuntimeException();
    }
}
