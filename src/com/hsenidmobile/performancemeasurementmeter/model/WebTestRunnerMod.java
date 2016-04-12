package com.hsenidmobile.performancemeasurementmeter.model;

/**
 * Created by buddika on 4/7/16.
 */
public class WebTestRunnerMod {

    private short applicationPort;
    private float timePeriodSSH,rempUpPeriod1,rempUpPeriod2,rempUpPeriod3,rempUpPeriod4,rempUpPeriod5;
    private String applicationPath,acceptType,requestType,applicationURL,serverDetails,hostNameSSH,userNameSSH,passwordSSH,commandsSSH;













    public void setRempUpPeriod1(float rempUpPeriod1) {
        this.rempUpPeriod1 = rempUpPeriod1;
    }

    public void setRempUpPeriod2(float rempUpPeriod2) {
        this.rempUpPeriod2 = rempUpPeriod2;
    }

    public void setRempUpPeriod3(float rempUpPeriod3) {
        this.rempUpPeriod3 = rempUpPeriod3;
    }

    public void setRempUpPeriod4(float rempUpPeriod4) {
        this.rempUpPeriod4 = rempUpPeriod4;
    }

    public void setRempUpPeriod5(float rempUpPeriod5) {
        this.rempUpPeriod5 = rempUpPeriod5;
    }

    public float getRempUpPeriod1() {
        return rempUpPeriod1;
    }

    public float getRempUpPeriod2() {
        return rempUpPeriod2;
    }

    public float getRempUpPeriod3() {
        return rempUpPeriod3;
    }

    public float getRempUpPeriod5() {
        return rempUpPeriod5;
    }

    public float getRempUpPeriod4() {
        return rempUpPeriod4;
    }

    public short getApplicationPort() {
        return applicationPort;
    }

    public float getTimePeriodSSH() {
        return timePeriodSSH;
    }

    public String getApplicationPath() {
        return applicationPath;
    }

    public String getAcceptType() {
        return acceptType;
    }

    public String getRequestType() {
        return requestType;
    }

    public String getApplicationURL() {
        return applicationURL;
    }

    public String getServerDetails() {
        return serverDetails;
    }

    public String getHostNameSSH() {
        return hostNameSSH;
    }

    public String getUserNameSSH() {
        return userNameSSH;
    }

    public String getPasswordSSH() {
        return passwordSSH;
    }

    public String getCommandsSSH() {
        return commandsSSH;
    }


    public void setApplicationPort(short applicationPort) {
        this.applicationPort = applicationPort;
    }

    public void setTimePeriodSSH(float timePeriodSSH) {
        this.timePeriodSSH = timePeriodSSH;
    }

    public void setApplicationPath(String applicationPath) {
        this.applicationPath = applicationPath;
    }

    public void setAcceptType(String acceptType) {
        this.acceptType = acceptType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public void setApplicationURL(String applicationURL) {
        this.applicationURL = applicationURL;
    }

    public void setServerDetails(String serverDetails) {
        this.serverDetails = serverDetails;
    }

    public void setHostNameSSH(String hostNameSSH) {
        this.hostNameSSH = hostNameSSH;
    }

    public void setUserNameSSH(String userNameSSH) {
        this.userNameSSH = userNameSSH;
    }

    public void setPasswordSSH(String passwordSSH) {
        this.passwordSSH = passwordSSH;
    }

    public void setCommandsSSH(String commandsSSH) {
        this.commandsSSH = commandsSSH;
    }




    public void  mmm() {

        System.out.println(rempUpPeriod1);
        System.out.println(rempUpPeriod2);
        System.out.println(rempUpPeriod3);
        System.out.println(rempUpPeriod4);
        System.out.println(rempUpPeriod5);


    }



    public static void main(String[] args) {

        WebTestRunnerMod nnn=new WebTestRunnerMod();

        nnn.mmm();

    }




}
