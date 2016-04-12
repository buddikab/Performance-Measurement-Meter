package com.hsenidmobile.performancemeasurementmeter.services;

import com.hsenidmobile.performancemeasurementmeter.model.WebTestRunnerMod;

/**
 * Created by buddika on 4/11/16.
 */

import java.lang.*;

public class deletemelater implements Runnable,RunTestInterface{




        Thread t;
    Thread t2;
    deletemelater() {

            // thread created

        for (int i=0;i<5;i++){

            t = new Thread(this);
            t.start();


        }

//            t2 = new Thread(this);
//            t2.start();
        }

        public void run() {


            if(t.isAlive()){
                System.out.println( (int) t.getId());

            }else{


                System.out.println(" t not aliev ");
            }


//            if(t2.isAlive()){
//
//                System.out.println( (int) t2.getId());
//
//            }


        }

        public static void main(String args[]) {
            new deletemelater();
        }


    @Override
    public void runTest() {

    }




}
