package com.hsenidmobile.performancemeasurementmeter.controller;

import com.hsenidmobile.performancemeasurementmeter.model.WebTestRunnerMod;
import com.hsenidmobile.performancemeasurementmeter.services.WebTestRunnerSer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by buddika on 4/7/16.
 */
public class PerformanceMeasurementMeterRun extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String testType;



        WebTestRunnerMod wTRM;
        WebTestRunnerSer wTRS;



        testType=request.getParameter("testType");








        if(testType.equals("Web")){

            System.out.println("I am a web Test ");

            wTRM=new WebTestRunnerMod();

            wTRM.setApplicationPath(request.getParameter("applicationPath"));
            wTRM.setAcceptType(request.getParameter("acceptType"));


            try {

                wTRM.setApplicationPort((short) Integer.parseInt((request.getParameter("applicationPort"))));






            }catch (Exception e1){

                System.out.println("Invalid input for port");

            }





            wTRM.setApplicationURL(request.getParameter("applicationURL"));
            wTRM.setCommandsSSH(request.getParameter("commandsSSH"));
            wTRM.setHostNameSSH(request.getParameter("hostNameSSH"));
            wTRM.setPasswordSSH(request.getParameter("passwordSSH"));
            wTRM.setRequestType(request.getParameter("requestType"));
            wTRM.setServerDetails(request.getParameter("serverDetails"));


            try {

                wTRM.setTimePeriodSSH(Float.parseFloat((request.getParameter("timePeriodSSH"))));

            }catch (Exception e1){

                System.out.println("Invalid input for SSH time period");

            }


            wTRM.setUserNameSSH(request.getParameter("userNameSSH"));


            try {

                wTRM.setRempUpPeriod1(Float.parseFloat((request.getParameter("rempUpPeriod1"))));
                wTRM.setRempUpPeriod2(Float.parseFloat((request.getParameter("rempUpPeriod2"))));
                wTRM.setRempUpPeriod3(Float.parseFloat((request.getParameter("rempUpPeriod3"))));
                wTRM.setRempUpPeriod4(Float.parseFloat((request.getParameter("rempUpPeriod4"))));
                wTRM.setRempUpPeriod5(Float.parseFloat((request.getParameter("rempUpPeriod5"))));

            }catch (Exception e1){

                System.out.println("Invalid input for Remp-Up Period");

            }




            wTRS=new WebTestRunnerSer();
















        }else if(testType=="Database"){



        }else if(testType=="FTP"){



        }




//
//        response.getWriter().println("<h1>" + testType + "</h1>");


    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // Set response content type
//        response.setContentType("text/html");
//
//        String message = "Hello World";
//
//        // Actual logic goes here.
//        PrintWriter out = response.getWriter();
//        out.println("<h1>" + message + "</h1>");

//    response.getWriter().println("<h1>" + testType + "</h1>");
//    }
}
