package com.fcj.grammer;

/**
 * Created by fcj on 11/30/15.
 */
public class MainClass {


    public static void main(String[] args) {
        New newInstant = new New();
        newInstant.a();
        newInstant.b();


        A aInstant = new New();
        B bInstant = (B)aInstant;
        bInstant.b();



    }



}



class New implements A,B{
    @Override
    public void a() {
        System.out.println("Impl a method in A interface");
    }
    @Override
    public void b() {
        System.out.println("Impl b method in B interface");
    }
}



interface A{
    void a();
}

interface B{
    void b();
}