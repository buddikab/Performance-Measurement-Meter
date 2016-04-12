package com.hsenidmobile.performancemeasurementmeter.services;

import com.hsenidmobile.performancemeasurementmeter.model.WebTestRunnerMod;

/**
 * Created by buddika on 4/7/16.
 */
public class WebTestRunnerSer implements RunTestInterface,Runnable {


    Thread t1;
    Thread t2;
    WebTestRunnerMod wTRM;



    public WebTestRunnerSer() {


        if(wTRM.getServerDetails().equals("Yes")){

            t1 = new Thread(this);
            t1.start();

        }


        for(int i=0;i==i;i++){



        }



    }


    @Override
    public void run() {


        if(t1.isAlive()){

            //call to SSH class

        }else if(t2.isAlive()){



        }



    }



    @Override
    public void runTest() {




    }


//    String rawData = "id=10";
//    String type = "application/x-www-form-urlencoded";
//    String encodedData = URLEncoder.encode( rawData );
//    URL u = new URL("http://www.example.com/page.php");
//    HttpURLConnection conn = (HttpURLConnection) u.openConnection();
//    conn.setDoOutput(true);
//    conn.setRequestMethod("POST");
//    conn.setRequestProperty( "Content-Type", type );
//    conn.setRequestProperty( "Content-Length", String.valueOf(encodedData.length()));
//    OutputStream os = conn.getOutputStream();
//    os.write(encodedData.getBytes());






}
