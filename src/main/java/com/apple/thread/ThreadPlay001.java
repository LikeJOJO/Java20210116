package com.apple.thread;

public class ThreadPlay001 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();
    }
}

