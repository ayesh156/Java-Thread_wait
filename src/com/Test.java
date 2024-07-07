package com;

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
            try {
                synchronized (this) {
                    wait();
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
        
}

public class Test {
    public static void main(String[] args){
        
        MyThread mt = new MyThread();
        mt.start();
       
    }
}
